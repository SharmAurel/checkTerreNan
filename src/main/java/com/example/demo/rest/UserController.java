package com.example.demo.rest;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping("/user/create")
    public ResponseEntity createUser(@RequestBody @Valid User user){
        return ResponseEntity.ok().body(user);
    }
}