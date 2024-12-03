package com.demo.spring_with_graphql.service;

import com.demo.spring_with_graphql.model.User;
import com.demo.spring_with_graphql.model.UserRequest;
import com.demo.spring_with_graphql.repository.IUserRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final IUserRepository userRepository;

    public UserService(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }


    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public User createUser(UserRequest userRequest) {
        User user = new User();
        user.setUsername(userRequest.getUsername());
        user.setEmail(userRequest.getEmail());
        user.setRole(userRequest.getRole());
        return userRepository.save(user);
    }

    public User updateUser(Long id, UserRequest userRequest) {
        User existingUser = userRepository.findById(id).orElse(null);
        existingUser.setUsername(userRequest.getUsername());
        existingUser.setEmail(userRequest.getEmail());
        existingUser.setRole(userRequest.getRole());
        return userRepository.save(existingUser);
    }

    public Boolean deleteUser(Long id) {
        userRepository.deleteById(id);
        return true;
    }

}
