package com.example.Login.Service;

import com.example.Login.Model.user;
import com.example.Login.Repository.loginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class userService {
    @Autowired
    loginRepository loginRepository;

    public ArrayList<user> getUser() {
        return (ArrayList<user>) loginRepository.findAll();
    }

    public user setUser(String name, String email, String password) {
        user user = new user();
        return setAll(user, name, email, password);
    }

    public user editUser(Long id, String name, String email) {
        user user = loginRepository.findById(id).get();
        return setAll(user, name, email);
    }

    private user setAll(user user, String name, String email, String password) {
        user.setName(name);
        user.setEmail(email);
        user.setPassword(password);
        return loginRepository.save(user);
    }

    private user setAll(user user, String name, String email) {
        user.setName(name);
        user.setEmail(email);
        return loginRepository.save(user);
    }

}
