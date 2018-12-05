package com.example.authentication.endpoint;


import com.example.authentication.model.User;
import com.example.authentication.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/floor1")
public class FirstFloorEndpoint {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @GetMapping("office1")
    public String enterOffice1() {
        return "You are on the first floor, inside office1";
    }

    @GetMapping("office2")
    public String enterOffice2() {
        return "You are on the first floor, inside office2";
    }

    @PostMapping("add")
    public String addUser(@RequestBody User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
        return "User added successfully";
    }
}



