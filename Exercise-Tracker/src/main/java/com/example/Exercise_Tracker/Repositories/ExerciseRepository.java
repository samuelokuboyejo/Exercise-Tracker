package com.example.Exercise_Tracker.Repositories;

import com.example.Exercise_Tracker.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExerciseRepository extends JpaRepository<Exercise, Long> {
    List<Exercise> findByUserId(Long userId);

    Exercise save(Exercise exercise);
}
