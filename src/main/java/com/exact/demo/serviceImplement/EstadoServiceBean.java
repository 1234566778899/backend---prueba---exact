package com.exact.demo.serviceImplement;

import com.exact.demo.model.Estado;
import com.exact.demo.repositories.EstadoRepository;
import com.exact.demo.service.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstadoServiceBean implements EstadoService {
    @Autowired
    private EstadoRepository estadoRepository;
    @Override
    public List<Estado> listar() {
        return estadoRepository.findAll();
    }
}
