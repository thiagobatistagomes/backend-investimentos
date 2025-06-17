package com.example.investimentos.controller;

import com.example.investimentos.dto.UserRegistrationDTO;
import com.example.investimentos.model.User;
import com.example.investimentos.service.UserService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/cadastro")
    public ResponseEntity<User> register(@Valid @RequestBody UserRegistrationDTO dto) {
        User createdUser = userService.register(dto);
        return ResponseEntity.ok(createdUser);
    }
}
