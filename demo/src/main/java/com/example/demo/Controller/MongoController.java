package com.example.demo.Controller;

import com.example.demo.Entity.MongoEntity.Chips;

import com.example.demo.Service.MongoService.MongoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/mongo")
public class MongoController {

    @Autowired
    MongoRepository repository;

    @PostMapping("/saveAllChips")
    public ResponseEntity<Object> saveAllChips(@RequestBody ArrayList<Chips> chipsArray) {
        try {

            repository.saveAll(chipsArray);

            return ResponseEntity.status(HttpStatus.OK).body("save data successfull");

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }

    @GetMapping("/findAllChips")
    public ResponseEntity<Object> findAllChips() {
        try {

            return ResponseEntity.status(HttpStatus.OK).body(repository.findAll());

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }
}
