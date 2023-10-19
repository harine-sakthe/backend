package com.example.demo.api.controller;

import com.example.demo.api.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {
//    private UserService userService;
//
//    @Autowired
//    public UserController(UserService userService) {
//        this.userService = userService;
//    }
     User user;
    @GetMapping("{id}")
    public User getUser(Integer id) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date date1;
        try {
            date1 = sdf.parse("24-10-2023");
            return user;
//            return new User(1, "india", "Pakistan", date1);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
            // Handle the exception, such as logging an error or taking appropriate action.
        }
//        Optional<User> user = userService.getUser(id); // Use userService instance, not the class name
//        if (user.isPresent()) {
//            return user.get();
//        }
//        return null;

    }
    @PostMapping
    public String createUser(@RequestBody User user){
        this.user= user;
        return "Data Inserted Successfully";
    }
    @PutMapping
    public String updateUser(@RequestBody User user){
        this.user= user;
        return "Data Updated Successfully";
    }
    @DeleteMapping("{id}")
    public String deleteUser(Integer id){
        this.user= null;
        return "Deleted Successfully";
    }
}