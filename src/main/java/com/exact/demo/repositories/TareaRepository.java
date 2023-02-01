package com.exact.demo.repositories;

import com.exact.demo.model.Estado;
import com.exact.demo.model.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TareaRepository extends JpaRepository<Tarea, Long> {
    @Query("select t from Tarea t where t.estado.descripcion!='Eliminado' order by t.estado.id asc,t.id desc")
    public List<Tarea> listar();

}