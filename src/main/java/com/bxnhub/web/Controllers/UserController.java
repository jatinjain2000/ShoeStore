package com.bxnhub.web.Controllers;

import com.bxnhub.web.entities.User;

import com.bxnhub.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("http://127.0.0.1:5173/")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/users")
    public String createUser(@RequestBody User user) {
        userService.createUser(user);
        return "success";
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return this.userService.getAllUsers();
    }

    @GetMapping("/users/{userId}")
    public Optional<User> getUserById(@PathVariable("userId") Integer userId) {
        return this.userService.getUserById(userId);
    }

    @GetMapping("/users/email/{email}")
    public User getUserByEmail(@PathVariable("email") String email) {
        return this.userService.getUserByEmail(email);
    }

    @GetMapping("/users/emailpass/{email}/{password}")
    public User getUserByEmailAndPassword(@PathVariable("email") String email,
            @PathVariable("password") String password) {
        return this.userService.getUserByEmailAndPassword(email, password);
    }

    @DeleteMapping("/users/{userId}")
    public void deleteUser(@PathVariable("userId") Integer userId) {
        this.userService.deleteUser(userId);
    }

}
