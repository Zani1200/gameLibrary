package com.example.gameLibrary.controller;

import com.example.gameLibrary.model.JuegosModel;
import com.example.gameLibrary.service.JuegosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("")
public class JuegosController {
    @Autowired
    JuegosService juegosService;

    @GetMapping("")
    public List<JuegosModel> findAll() {
        return juegosService.findAll();
    }
}
