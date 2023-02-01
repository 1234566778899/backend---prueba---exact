package com.exact.demo.serviceImplement;

import com.exact.demo.model.Estado;
import com.exact.demo.model.Tarea;
import com.exact.demo.repositories.EstadoRepository;
import com.exact.demo.repositories.TareaRepository;
import com.exact.demo.service.TareaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TareaServiceBean implements TareaService {
    @Autowired
    private TareaRepository tareaRepository;
    @Autowired
    private EstadoRepository estadoRepository;

    @Override
    public Tarea registrar(Tarea tarea) {
        Estado estado=new Estado();
        estado.setId(Long.valueOf(1));
        tarea.setEstado(estado);
        return tareaRepository.save(tarea);
    }
    @Override
    public List<Tarea> listar() {
        return tareaRepository.listar();
    }
    @Override
    public Tarea updateTarea(Long tarea_id,Tarea tarea) {
        Tarea _tarea=tareaRepository.findById(tarea_id).get();
        _tarea.setEstado(tarea.getEstado());
        return tareaRepository.save(_tarea);
    }
}
