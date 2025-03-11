package main.java.me.dio.renanfreitas.avanade_decola.service.impl;

import main.java.me.dio.renanfreitas.avanade_decola.domain.model.User;
import main.java.me.dio.renanfreitas.avanade_decola.domain.repository.UserRepository;

@Service
public class UserServiceImpl {
    
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @Override
    public User findByID(Long id) {
        return userRepository.findByID(id).orElseThrow(NoSuchElementException::new);
    }
    @Override
    public User create(User userToCreate) {
        if (userRepository.existsByAccountNumber(userToCreate.getAccountNumber(userToCreate.getAccount().getNumber()))) {
            throw new IllegalArgumentException("User already exists");
        }
        return userRepository.save(userToCreate);
    }
}
