package motorcycleservice.motorcycle.controller;

import motorcycleservice.motorcycle.entity.Motorcycle;
import motorcycleservice.motorcycle.service.MotorcycleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/motorcycle")
public class MotorcycleController {

    @Autowired
    private MotorcycleService motorcycleService;

    @GetMapping
    public ResponseEntity<List<Motorcycle>> getListMotorcycle(){
        List<Motorcycle> motorcycles = motorcycleService.getAll();
        return (motorcycles.isEmpty())
                ? ResponseEntity.noContent().build()
                : ResponseEntity.ok(motorcycles);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Motorcycle> getMotorcycle(@PathVariable("id") int id){
        return (motorcycleService.getMotorcycleById(id) == null)
                ? ResponseEntity.notFound().build()
                : ResponseEntity.ok(motorcycleService.getMotorcycleById(id));
    }

    @PostMapping
    public ResponseEntity<Motorcycle> save(@RequestBody Motorcycle motorcycle){
        return ResponseEntity.ok(motorcycleService.save(motorcycle));
    }

    @GetMapping("/users/{userId}")
    public ResponseEntity<List<Motorcycle>> getAllMotorcyclesByUser(@PathVariable("userId") int userId){
        return (motorcycleService.getAllMotorcyclesByUserId(userId).isEmpty())
                ? ResponseEntity.noContent().build()
                : ResponseEntity.ok(motorcycleService.getAllMotorcyclesByUserId(userId));
    }
}
