package com.hup.consumer.movice.service.impl;

import com.hup.basic.user.client.UserServiceClient;
import com.hup.basic.user.model.User;
import com.hup.consumer.movice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserServiceClient userServiceClient;

    @Override
    public User getUser(Long id) {
        return userServiceClient.findOne(id);
    }
}
