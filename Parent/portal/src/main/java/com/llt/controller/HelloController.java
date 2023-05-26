package com.llt.controller;

import com.llt.domain.entity.User;
import com.llt.repository.UserRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

/**
 * @author llt
 */
@RestController
@RequestMapping("/api")
public class HelloController {

    private final UserRepository userRepository;

    public HelloController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello World";
    }


    @GetMapping("/user")
    public String getUserById(@RequestParam(value = "id") Long id) {

        User user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("entity not find"));
        return user.getUsername();
    }
}
