package com.bxnhub.web.Repository;


import com.bxnhub.web.entities.Shoes;
import com.bxnhub.web.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User,Integer> {
    public User findById(int userId);
}
