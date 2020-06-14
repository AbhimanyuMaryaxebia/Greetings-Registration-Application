package com.xebia.springdataoverview.controller;

import com.xebia.springdataoverview.model.Registration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.Map;

@Controller
public class RegistrationController {
    @GetMapping("/registration")
    public String addRegistration() {
        return "registration";
    }

    @PostMapping("/registration")
    public String registerUser( @Valid @ModelAttribute("registration1") Registration registration, BindingResult result) {
        if (result.hasErrors()) {
            System.out.println("Fatal Errors");
            return "registration";
        }
        System.out.println("FirstName of Registered User: " + registration.getFirstName());
        System.out.println("LastName of Registered User: " + registration.getLastName());
        return "redirect:registration";


    }

}
