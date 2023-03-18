package motorcycleservice.motorcycle.service;

import motorcycleservice.motorcycle.entity.Motorcycle;
import motorcycleservice.motorcycle.repository.MotorcycleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MotorcycleService {

    @Autowired
    private MotorcycleRepository motorcycleRepository;

    public List<Motorcycle> getAll() {
        return motorcycleRepository.findAll();
    }

    public Motorcycle getMotorcycleById(int id) {
        return motorcycleRepository.findById(id).orElse(null);
    }

    public Motorcycle save(Motorcycle motorcycle) {
        return motorcycleRepository.save(motorcycle);
    }

    public List<Motorcycle> getAllMotorcyclesByUserId(int userId) {
        return motorcycleRepository.findByUser(userId);
    }

}
