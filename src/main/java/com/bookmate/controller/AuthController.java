package com.bookmate.controller;

import com.bookmate.entity.User;
import com.bookmate.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return authService.register(user);
    }

    @GetMapping("/login")
public Object login(@RequestParam String email) {
    User user = authService.login(email);

    if (user == null) {
        return "User not found";
    }

    return user;
}
}