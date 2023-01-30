package com.example.demo.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/v1/users")
@CrossOrigin
public class UserController {
    @GetMapping("/getUser")
    public String getUser(){
        return "hello Kavini";
    }
    @PostMapping ("/saveUser")
    public String saveUser(){
        return "User is saved Successfully";
    }
    @PutMapping("/updateUser")
    public String updateUser(){
        return "User is updated Successfully";
    }
    @DeleteMapping("/deleteUser")
    public String deleteUser(){
        return "User is Deleted Successfully";
    }



}
