package com.example.dao;

import com.example.model.Product;
import com.example.model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserDAO {
    Map<Integer, User> userDb = new HashMap<>();
    {
        userDb.put(1, new User(1, "Julia", "123"));
        userDb.put(2, new User(2, "Jack", "123"));
    }

    public void addUser(User user){
        userDb.put(user.getId(), user);
    }
    public List<User> getAllUsers(){
        return new ArrayList<>(userDb.values());
    }
    public int genId() {
        return userDb.size()+1;
    }


}

