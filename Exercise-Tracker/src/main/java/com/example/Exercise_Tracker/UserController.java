package com.example.Exercise_Tracker;


import com.example.Exercise_Tracker.Services.ExerciseService;
import com.example.Exercise_Tracker.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private ExerciseService excerciseService;

    @PostMapping("/users")
    public User createUser(@RequestBody String username){
        return userService.createUser(username);
    }

    @PostMapping("/users/{userId}?exercises")
    public Exercise addExercise(@PathVariable Long userId,
                                @RequestParam String description,
                                @RequestParam int duration,
                                @RequestParam(required = false) Date date) {
        return excerciseService.addExercise(userId, description, duration, date);
    }

    @GetMapping("/users/{userId}/exercises")
    public List<Exercise> getExercises(@PathVariable Long userId){
        return excerciseService.getExerciseByUserId(userId);
    }
}
