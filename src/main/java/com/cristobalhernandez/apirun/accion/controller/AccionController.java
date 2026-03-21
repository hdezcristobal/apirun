package com.cristobalhernandez.apirun.accion.controller;

import com.cristobalhernandez.apirun.accion.entity.Accion;
import com.cristobalhernandez.apirun.accion.service.AccionService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author hdez.cristobal
 */
@RestController
@RequestMapping("/accion")
public class AccionController {
    
    private final AccionService accionService;
    
    public AccionController(AccionService accionService) {
        this.accionService = accionService;
    }
    
    @GetMapping
    public List<Accion> obtenerAcciones() {
        return accionService.encontrarTodos();
    }
}
