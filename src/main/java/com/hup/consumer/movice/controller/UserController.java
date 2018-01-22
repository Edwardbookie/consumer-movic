package com.hup.consumer.movice.controller;

import com.hup.basic.user.model.User;
import com.hup.consumer.movice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author to dapeng
 */
@RestController
@RequestMapping(value = "/api/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping(value = "/{id}")
    public User findById(@PathVariable("id") Long id){
        return userService.getUser(id);
    }
}
