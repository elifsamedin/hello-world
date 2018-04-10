package com.example.hello;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloWorldController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET, produces = "text/plain")
    public ResponseEntity<String> greet() {
        return new ResponseEntity<>("Hello user", HttpStatus.OK);
    }

}
