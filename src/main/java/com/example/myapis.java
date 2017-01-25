package com.example;

import javax.websocket.server.PathParam;

import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class myapis {

    @RequestMapping("/greeting")
    @ResponseBody
    String home() {
    	System.out.println("Received request for this api");
        return "Hello world!";
    }
    
    @RequestMapping(value="/greet/{name}", method = RequestMethod.GET)
    @ResponseBody
    String greet(@PathVariable("name") String name) {
        return "Hi, "+name;
    }
}