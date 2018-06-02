package com.bah.devnation.demo.devnation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping(value = "/knights")
public class KnightsController {

    @Autowired
    private KnightssRepo repo;

    @GetMapping
    public Iterable<Knights> getAllKnights(){
        return repo.findAll();
    }
}
