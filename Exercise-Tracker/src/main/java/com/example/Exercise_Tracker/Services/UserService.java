package com.example.Exercise_Tracker.Services;

import com.example.Exercise_Tracker.Repositories.UserRepository;
import com.example.Exercise_Tracker.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User createUser(String username){
        User user = new User();
        user.setUsername(username);

        return userRepository.save(user);
    }
    public User getUserbyId(Long id){
        return (User) userRepository.findById(id).orElse(null);
    }

}
