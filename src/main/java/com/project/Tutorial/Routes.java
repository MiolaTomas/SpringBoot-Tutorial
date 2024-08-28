package com.project.Tutorial;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Routes {
    @GetMapping("/users")
    String myFirstRoute(){
        return "This is my first users endpoint";
    }

    @GetMapping("/users/{id}")
    String userById(@PathVariable int id){
        return "User id: " + id;
    }
    
}
