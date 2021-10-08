package com.example.demo.app.users.services;

import com.example.demo.app.users.models.User;
import com.example.demo.app.users.repos.UserRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findById(Integer id) throws Exception {
        User foundUser = userRepository.findById(id).get();
        if (foundUser != null){
            return foundUser;
        } else{
            throw new Exception("Usuario no encontrado");
        }
    }

    public List<User> findAll() {
        return userRepository.findAll(Sort.by("userName"));
    }

    public User create(User user) {
        return userRepository.save(user);
    }

    public User update(Integer id, User user) throws Exception {
        User foundUser = userRepository.findById(id).get();
        if (foundUser != null) {
            return userRepository.save(user);
        } else {
            throw new Exception("Usuario no encontrado");
        }
    }

    public void deleteById(Integer id) throws Exception {
        User foundUser = userRepository.findById(id).get();
        if (foundUser != null) {
            userRepository.deleteById(id);
        } else {
            throw new Exception("Usuario no enecontrado");
        }

    }
}
