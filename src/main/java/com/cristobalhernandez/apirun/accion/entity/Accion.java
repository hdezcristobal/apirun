package com.cristobalhernandez.apirun.accion.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author hdez.cristobal
 */
@Entity
@Data
@NoArgsConstructor
@Table(name = "accion")
public class Accion {
    
    @Id
    @Column(name = "id_accion")
    private String idAccion;
    private String nombre;
    private String descripcion;
    private String icono;
}
