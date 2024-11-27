package com.example.demo.controller;

import com.example.demo.dto.UserDTO;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "api/v1/")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/getusers")
    public List<UserDTO> getUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/user/{userId}")
    public UserDTO getUser(@PathVariable Integer userId){
//        return userService.getUserById();
        return userService.getUserById(userId);
    }

    @PostMapping("/adduser")
    public UserDTO addUser(@RequestBody UserDTO userDTO){
        return userService.addUser(userDTO);
    }

    @PutMapping("/updateuser")
    public  UserDTO updateUser(@RequestBody UserDTO userDTO){
        return userService.updateUser(userDTO);
    }

    @DeleteMapping("/deleteuser")
    public String deleteUser1(@RequestBody UserDTO userDTO){
        return userService.deleteUser1(userDTO);
    }

    @DeleteMapping("/deleteuser/{userId}")
    public String deleteUser(@PathVariable Integer userId){
        return userService.deleteUser(userId);
    }

}

