package com.bah.devnation.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class PlayersController {

    @Autowired
    private CapsRepo repoCaps;
    @Autowired
    private KnightssRepo repoKnights;


    @GetMapping(value = "/caps")
    public Iterable<Caps> getAllCaps(){
        return repoCaps.findAll();
    }


    @GetMapping(value = "/knights")
    public Iterable<Knights> getAllKnights(){
        return repoKnights.findAll();
    }
}
