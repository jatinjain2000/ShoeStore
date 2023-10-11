package com.bxnhub.web.Controllers;


import com.bxnhub.web.entities.User;

import com.bxnhub.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class UserController {

    @Autowired
    UserService userService;
    @PostMapping("/users")
    public String createUser(@RequestBody User user){
        userService.createUser(user);
        return "success";
    }
    @GetMapping("/users")
    public List<User> getUsers(){
        return this.userService.getAllUsers();
    }
    @DeleteMapping("/users/{userId}")
    public void deleteUser(@PathVariable("userId")int userId) {
        this.userService.deleteUser(userId);
    }

}
