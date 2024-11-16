package com.curudAPI.service;

import com.curudAPI.entity.UserDetails;
import com.curudAPI.repository.UserDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserDetailsService {

    @Autowired
    private UserDetailsRepository userDetailsRepository;

    public List<UserDetails> getAllUsers() {
        return userDetailsRepository.findAll();
    }

    public Optional<UserDetails> getUserById(int id) {
        return userDetailsRepository.findById(id);
    }

    public UserDetails addUser(UserDetails userDetails) {
        return userDetailsRepository.save(userDetails);
    }

    public UserDetails updateUser(int id, UserDetails userDetails) {
        Optional<UserDetails> existingUser = userDetailsRepository.findById(id);
        if (existingUser.isPresent()) {
            UserDetails updatedUser = existingUser.get();
            updatedUser.setName(userDetails.getName());
            updatedUser.setColors(userDetails.getColors());
            updatedUser.setSizes(userDetails.getSizes());
            updatedUser.setPrices(userDetails.getPrices());
            return userDetailsRepository.save(updatedUser);
        } else {
            throw new RuntimeException("User not found with id: " + id);
        }
    }

    public void deleteUser(int id) {
        userDetailsRepository.deleteById(id);
    }
}