package com.bookmate.service;

import com.bookmate.entity.User;
import com.bookmate.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserRepository userRepository;

    public User register(User user) {
        return userRepository.save(user);
    }

    public User login(String email) {
        return userRepository.findByEmail(email).orElse(null);
    }
}
