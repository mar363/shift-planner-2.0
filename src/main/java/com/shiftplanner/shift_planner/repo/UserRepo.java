package com.shiftplanner.shift_planner.repo;

import com.shiftplanner.shift_planner.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
}
