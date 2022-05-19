package com.example.springdemo.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloRestController {

    @RequestMapping(value = {"", "/", "/home"})
    public String sayHello () {
        return "Hello from Saiprakash";
    }

    @RequestMapping(value = {"/query"}, method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "name") String name) {
        return "Hello " + name + " !";
    }

    @GetMapping("/params/{name}")
    public String sayHelloParam(@PathVariable String name) {
        return "Hello " + name + " !";
    }


}
