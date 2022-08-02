package com.example.demo.controllers;

import java.util.List;

import org.json.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Response;
import com.example.demo.services.TransactionService;

@RestController
public class TransactionController {
    TransactionService service = new TransactionService();
    @PostMapping("/transaction")
    public ResponseEntity<List<Response>> request(@RequestBody String input){
        return ResponseEntity.ok().body(service.executeTransacion(input));
    }

    @GetMapping("/")
    public ResponseEntity<String> getRequest(){
        return ResponseEntity.ok("Hola Mundo");
    }
}
