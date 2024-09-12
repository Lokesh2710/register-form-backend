package com.example.registration_form;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/register-form")
@CrossOrigin(origins = "http://localhost:3003")  // Allow React frontend to access this API
public class RegistrationController {

    @PostMapping("/add")
    public String registerUser(@RequestBody User user) {
        // Simple in-memory storage (you can later replace this with a database)
        System.out.println("Registered user: " + user.getName());
        return "\n\n We are welcoming you  " + user.getName() + " Have a great day ahead : )";

    }
}

