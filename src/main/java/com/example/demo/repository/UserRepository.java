package com.example.demo.repository;
import com.example.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface UserRepository extends JpaRepository<User, Long>{

    User findUserById(int id);
    User findUserByNom(String nom);
    void deleteUserById(int id);
}
