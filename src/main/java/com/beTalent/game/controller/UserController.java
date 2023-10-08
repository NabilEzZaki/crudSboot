package com.beTalent.game.controller;

import com.beTalent.game.model.User;
import com.beTalent.game.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;


//@RequestMapping("/user")
//@RestController
//public class UserController {
//    @GetMapping("/redirectWithResponseEntity")
//    public ResponseEntity<Void> redirectWithResponseEntity() {
//        return ResponseEntity.status(302).location(URI.create("https://www.google.com")).build();
//    }
//
//}




//    private UserRepo repo;
//    @PostMapping("/login")
//    public ResponseEntity<?> loginUser(@RequestBody User userData){
//        System.out.println(userData);
//        User user=repo.findByUsername(userData.getUsername());
//        if (user.getPassword().equals(userData.getPassword()))
//            return ResponseEntity.ok(user);
//
//        return (ResponseEntity<?>) ResponseEntity.internalServerError();
//    }