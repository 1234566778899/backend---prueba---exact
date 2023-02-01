package com.exact.demo.controller;

import com.exact.demo.excepcion.ValidationException;
import com.exact.demo.model.Tarea;
import com.exact.demo.repositories.TareaRepository;
import com.exact.demo.service.TareaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
@CrossOrigin(origins = "http://localhost:4200/")
public class TareaController {
    @Autowired
    private TareaService tareaService;
    @GetMapping("/tareas")
    public ResponseEntity<List<Tarea>> listar(){
        return new ResponseEntity<>(tareaService.listar(), HttpStatus.OK);
    }
    @PostMapping("/tareas")
    public ResponseEntity<Tarea> registrar(@RequestBody Tarea tarea){
        if(tarea.getDescripcion().equals("")){
            throw  new ValidationException("Debe colocar una descripcion a la tarea");
        }
        return new ResponseEntity<>(tareaService.registrar(tarea),HttpStatus.CREATED);
    }
    @PutMapping("/tareas/{tarea_id}")
    public ResponseEntity<Tarea> updateTarea(@RequestBody Tarea tarea,@PathVariable Long tarea_id){
        return new ResponseEntity<>(tareaService.updateTarea(tarea_id,tarea),HttpStatus.CREATED);
    }
}
