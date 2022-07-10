package com.spring.services.servicesImpl;

import com.spring.entity.User;
import com.spring.repo.UserRepo;
import com.spring.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServicesImpl implements UserServices {

    @Autowired
    private UserRepo userRepo;

    @Override
    public User save(User user) {
        return userRepo.save(user);
    }
}
