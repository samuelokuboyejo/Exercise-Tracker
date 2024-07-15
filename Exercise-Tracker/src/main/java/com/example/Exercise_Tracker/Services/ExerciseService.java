package com.example.Exercise_Tracker.Services;

import com.example.Exercise_Tracker.Exercise;
import com.example.Exercise_Tracker.Repositories.ExerciseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;


@Service
public class ExerciseService {
    @Autowired
private ExerciseRepository exerciseRepository;

    public Exercise addExercise(Long userId, String description, int duration, Date date){
        Exercise exercise = new Exercise();
        exercise.setUserId(userId);
        exercise.setDescription(description);
        exercise.setDuration(duration);
        exercise.setDate(date != null ? date : new Date());

        return exerciseRepository.save(exercise);
    }
    public List<Exercise> getExerciseByUserId(Long userId){
        return exerciseRepository.findByUserId(userId);
    }

}
