package com.exact.demo.service;

import com.exact.demo.model.Tarea;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TareaService {
    public Tarea registrar(Tarea tarea);
    public List<Tarea> listar();
    public Tarea updateTarea(Long tarea_id,Tarea tarea);
}
