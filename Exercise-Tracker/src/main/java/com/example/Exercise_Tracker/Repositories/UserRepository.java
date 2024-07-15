package com.example.Exercise_Tracker.Repositories;

import com.example.Exercise_Tracker.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User save(User user);


}
