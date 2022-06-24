package com.example.demo.service.impl;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
public class UserServiceImplementation implements UserService {

    @Autowired
    private  UserRepository userRepository;

    public UserServiceImplementation(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public User createUser(User user) {

        return userRepository.save(user);
    }

    @Override
    public List<User> findAllUser(){
        return userRepository.findAll();
    }


    @Override
    public User updateUser(User users){
        return userRepository.save(users);
    }

    @Override
    public User findUserById(int id){
        return userRepository.findUserById(id);
    }

    @Override
    public void deleteUserById(int id){
                userRepository.deleteUserById(id);
    }
    @Override
    public User findUserByNom(String nom){
        return userRepository.findUserByNom(nom);
    }

}
