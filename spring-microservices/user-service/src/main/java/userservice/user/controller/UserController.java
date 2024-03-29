package userservice.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import userservice.user.entity.User;
import userservice.user.models.Car;
import userservice.user.models.Motorcycle;
import userservice.user.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<List<User>> listUsers() {
        List<User> users = userService.getAll();
        return (users.isEmpty()) ? ResponseEntity.noContent().build() : ResponseEntity.ok(users);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUser(@PathVariable("id") int id) {
        return (userService.getUserById(id) == null) ? ResponseEntity.notFound().build() : ResponseEntity.ok(userService.getUserById(id));
    }

    @PostMapping
    public ResponseEntity<User> saveUser(@RequestBody User user) {
        return ResponseEntity.ok(userService.save(user));
    }

    @GetMapping("/cars/{userId}")
    public ResponseEntity<List<Car>> getAllCarsByUser(@PathVariable("userId") int userId) {
        return (userService.getUserById(userId) == null)
                ? ResponseEntity.notFound().build()
                : ResponseEntity.ok(userService.getCars(userId));
    }

    @GetMapping("/motorcycles/{userId}")
    public ResponseEntity<List<Motorcycle>> getAllMOtorcyclesByUser(@PathVariable("userId") int userId){
        return (userService.getUserById(userId) == null)
                ? ResponseEntity.notFound().build()
                : ResponseEntity.ok(userService.getMotorcycles(userId));
    }

}
