package com.example.account.controller;

import com.example.account.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    // http://localhost:8080/users
    @GetMapping(value = "/users", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<User>> findAccounts() {
        List<User> accounts = List.of(new User(1L, "Ann"), new User(2L, "John"));
        return ResponseEntity.status(HttpStatus.OK).body(accounts);
    }
}
