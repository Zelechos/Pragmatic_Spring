package carservice.car.controller;

import carservice.car.entity.Car;
import carservice.car.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/car")
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping
    public ResponseEntity<List<Car>> getCarsList() {
        List<Car> cars = carService.getAll();
        return (cars.isEmpty())
                ? ResponseEntity.noContent().build()
                : ResponseEntity.ok(cars);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Car> getCar(@PathVariable("id") int id) {
        return (carService.getCarById(id) == null)
                ? ResponseEntity.notFound().build()
                : ResponseEntity.ok(carService.getCarById(id));
    }

    @PostMapping
    public ResponseEntity<Car> save(@RequestBody Car car) {
        return ResponseEntity.ok(carService.save(car));
    }

    @GetMapping("/users/{userId}")
    public ResponseEntity<List<Car>> getAllCarsByUser(@PathVariable("userId") int userId) {
        return (carService.getAllCarsByUserId(userId).isEmpty())
                ? ResponseEntity.noContent().build()
                : ResponseEntity.ok(carService.getAllCarsByUserId(userId));
    }


}
