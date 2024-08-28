package com.project.Tutorial;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Routes {
    @GetMapping("/users")
    String myFirstRoute(){
        return "This is my users endpoint";
    }

    //PathVariable
    @GetMapping("/users/{id}")
    String userById(@PathVariable int id){
        return "User id: " + id;
    }

    //Query Params
    @GetMapping("/users/{id}")
    String queryParams(@PathVariable int id, @RequestParam String name){
        return "User id: " + id + " - " + "Query params name: " + name;
    }

    
}
