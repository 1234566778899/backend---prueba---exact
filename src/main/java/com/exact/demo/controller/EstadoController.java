package com.exact.demo.controller;

import com.exact.demo.model.Estado;
import com.exact.demo.service.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
@CrossOrigin(origins = "http://localhost:4200/")
public class EstadoController {
    @Autowired
    private EstadoService estadoService;
    @GetMapping("/estados")
    public List<Estado> listar(){
        return estadoService.listar();
    }
}
