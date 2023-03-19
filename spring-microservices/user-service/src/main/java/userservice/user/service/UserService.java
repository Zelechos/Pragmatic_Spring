package userservice.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import userservice.user.entity.User;
import userservice.user.models.Car;
import userservice.user.models.Motorcycle;
import userservice.user.repository.UserRepository;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private UserRepository userRepository;

    public List<Car> getCars(int userId) {
        return restTemplate.getForObject("http://localhost:8080/car/users/" + userId, List.class);
    }

    public List<Motorcycle> getMotorcycles(int userId) {
        return restTemplate.getForObject("http://localhost:8082/motorcycle/users" + userId, List.class);
    }

    public List<User> getAll() {
        return userRepository.findAll();
    }

    public User getUserById(int id) {
        return userRepository.findById(id).orElse(null);
    }

    public User save(User user) {
        return userRepository.save(user);
    }

}
