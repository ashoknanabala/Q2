/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vm.Q2.controller;

import com.vm.Q2.Repository.UserRepository;
import com.vm.Q2.dto.UserDTO;
import com.vm.Q2.dto.UserProjection;
import com.vm.Q2.mapper.UserMapper;
import com.vm.Q2.models.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Ashok
 */
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserMapper userMapper;
    
    @Autowired
    UserRepository userRepository;
    

    @GetMapping("/users")
    public List<com.vm.Q2.models.User> users() {
        return userRepository.findAll();
    }

    @GetMapping("/usersdto")
    public List<UserProjection> usersdto() {
        return userRepository.findAllUsers();
    }
    
     @GetMapping("/users/{id}")
    public UserDTO usersdto(@PathVariable("id") Long id) {
        User user= userRepository.getOne(id);
          UserDTO userDTO = userMapper.userToUserDTO(user);
        return userDTO;
    }

    @GetMapping("/usersdtos")
    public List<UserDTO> usersdtousingMapsruct() {
      List<User> user= userRepository.findAll();
        List<UserDTO> userDTO = userMapper.usersToUserDTOs(user);
        return userDTO;
    }
    
}
