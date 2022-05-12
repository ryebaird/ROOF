package com.project2.api1.Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("customer")
public class CustomerController {

    @GetMapping("/test")
    public ResponseEntity testEndpoint(){
        return ResponseEntity.ok("IT WORKS!");
    }
    /*
     Add different endpoints here
     */

}
