package com.example.demo.service;
import com.example.demo.model.User;

import java.util.List;
import java.util.Optional;


public interface UserService {

     User createUser(User user);
     List<User> findAllUser();
     User updateUser(User users);
     User findUserById(int id);
     void deleteUserById(int id);
     User findUserByNom(String nom);



}
