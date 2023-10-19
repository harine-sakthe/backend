package com.example.demo.service;
import java.util.List;
import java.util.Optional;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import com.example.demo.api.controller.UserController;
import com.example.demo.api.model.User;
import org.springframework.stereotype.Service;
import java.util.Date;

import java.util.ArrayList;
import java.util.Arrays;

@Service
public class UserService {
    private List<User> userList;


    public UserService() {
        userList = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

        try {
            Date date1 = sdf.parse("24-10-2023");
            Date date2 = sdf.parse("25-10-2023");

            User user1 = new User(1, "india", "Pakistan", date1);
            User user2 = new User(2, "Bangladesh", "Sri Lanka", date2);

            userList.addAll(Arrays.asList(user1, user2));
        } catch (ParseException e) {
            e.printStackTrace();
            // Handle the exception, such as logging an error or taking appropriate action.
        }
    }
    public Optional<User> getUser(Integer id) {
        Optional<User> optional = Optional.empty();
        for (User user : userList) {
            if (id.equals(user.getId())) { // Use equals() for object comparison
                optional = Optional.of(user);
                return optional;
            }
        }
        return optional;
    }

}
