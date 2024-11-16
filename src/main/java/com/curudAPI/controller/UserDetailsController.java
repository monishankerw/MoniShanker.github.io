package com.curudAPI.controller;

import com.curudAPI.entity.UserDetails;
import com.curudAPI.service.UserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UserDetailsController {

    @Autowired
    private UserDetailsService userDetailsService;

    @GetMapping
    public List<UserDetails> getAllUsers() {
        return userDetailsService.getAllUsers();
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDetails> getUserById(@PathVariable int id) {
        Optional<UserDetails> user = userDetailsService.getUserById(id);
        return user.map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<UserDetails> addUser(@RequestBody UserDetails userDetails) {
        UserDetails createdUser = userDetailsService.addUser(userDetails);
        return ResponseEntity.ok(createdUser);
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserDetails> updateUser(@PathVariable int id, @RequestBody UserDetails userDetails) {
        try {
            UserDetails updatedUser = userDetailsService.updateUser(id, userDetails);
            return ResponseEntity.ok(updatedUser);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable int id) {
        userDetailsService.deleteUser(id);
        return ResponseEntity.noContent().build();
    }
}