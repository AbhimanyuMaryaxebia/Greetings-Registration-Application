package com.xebia.springdataoverview.controller;

import com.xebia.springdataoverview.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user")
    public User getUser(@RequestParam(value = "firstname", defaultValue = "Anshul") String firstname,
                        @RequestParam(value = "lastname", defaultValue = "Marya") String lastname,
                        @RequestParam(value = "age", defaultValue = "28") int age

    ) {

    User user=new User();
    user.setFirstname(firstname);
    user.setLastname(lastname);
    user.setAge(age);
    return user;
    }


}
