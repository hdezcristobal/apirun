package com.cristobalhernandez.apirun.articulo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author hdez.cristobal
 */
@RestController
public class ArticuloController {
    
    @GetMapping("/saluda")
    public String saludar() {
        return "Hola Cristóbal Hdez C.";
    }
}
