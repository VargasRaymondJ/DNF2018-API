package com.bah.devnation.demo.devnation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/caps")
public class CapsController {

    @Autowired
    private CapsRepo repo;

    @GetMapping
    public Iterable<Caps> getAllCaps(){
        return repo.findAll();
    }
}
