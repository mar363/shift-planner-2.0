package com.shiftplanner.shift_planner.controller;

import com.shiftplanner.shift_planner.model.User;
import com.shiftplanner.shift_planner.repo.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor


public class UserController {
private final UserRepo userRepo;

public record CreateUserReq(String email, String name) {}

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public User create(@RequestBody CreateUserReq req) {
    User u = User.builder()
            .email(req.email())
            .name(req.name())
            .build();
    return userRepo.save(u);
    }
    @GetMapping
    public List<User> all() {
    return userRepo.findAll();
    }
}
