package com.cristobalhernandez.apirun.accion.service;

import com.cristobalhernandez.apirun.accion.entity.Accion;
import com.cristobalhernandez.apirun.accion.repository.AccionJpaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author hdez.cristobal
 */
@Service
public class AccionService {
    
    @Autowired
    private AccionJpaRepository jpaRepository;
    
    public List<Accion> encontrarTodos() {
        return jpaRepository.findAll();
    }
}
