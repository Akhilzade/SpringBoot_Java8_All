package com.spring.controller;

import com.spring.entity.User;
import com.spring.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/akhil")
public class UserController {

    @Autowired
    private UserServices userServices;

    @PostMapping(value = "/save")
    public ResponseEntity<User> saveUser(@RequestBody User user){
        userServices.save(user);
        return new ResponseEntity( user, HttpStatus.CREATED);
    }

}

