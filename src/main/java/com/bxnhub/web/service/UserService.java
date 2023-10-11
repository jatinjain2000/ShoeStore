package com.bxnhub.web.service;

import com.bxnhub.web.Repository.UserRepo;
import com.bxnhub.web.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;

    public User createUser(User user){
        User result = userRepo.save(user);
        return result;
    }
    public User findUserById(int userId){
        User user = null;
        try{
            user = this.userRepo.findById(userId);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return user;
    }
    public void deleteUser(int userId){
        userRepo.deleteById(userId);
    }
    public List<User> getAllUsers(){
        List<User> list = (List<User>)this.userRepo.findAll();
        return list;
    }

}
