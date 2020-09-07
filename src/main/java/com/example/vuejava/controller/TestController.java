package com.example.vuejava.controller;

import com.example.vuejava.entity.User;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@CrossOrigin
public class TestController {

    private static List<User> userList;
    static{
        userList = new ArrayList<>();
        userList.add(new User("1","lzp1",18,new Date()));
        userList.add(new User("2","lzp2",19,new Date()));
        userList.add(new User("3","lzp3",20,new Date()));
        userList.add(new User("4","lzp4",21,new Date()));
    }

    @GetMapping("/user")
    public User getUser(){
        return new User("1","liuzp",18,new Date());
    }

    @GetMapping("/userList")
    public List<User> getUserList(){
        return userList;
    }

    @PostMapping("/user")
    public void addUser(@RequestBody User user){
        userList.add(user);
    }
    @PostMapping("/delete")
    public void deleteUser(@RequestBody User user){
        Iterator<User> it = userList.iterator();
        while(it.hasNext())
        {
            if(it.next().getId().equals(user.getId()))
                {
                    it.remove();
                }
            }
        }
}
