package com.example.authentication.endpoint;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/floor2")
public class SecondFloorEndpoint {

    @GetMapping("office1")
    @PreAuthorize("hasAnyRole('ADMIN')")
    public String enterOffice1() {
        return "You are on the second floor, inside office1";
    }

    @GetMapping("office2")
    @PreAuthorize("hasAnyRole('ADMIN')")
    public String enterOffice2() {
        return "You are on the second floor, inside office2";
    }
}
