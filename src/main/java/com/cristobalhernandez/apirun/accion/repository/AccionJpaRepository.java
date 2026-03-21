package com.cristobalhernandez.apirun.accion.repository;

import com.cristobalhernandez.apirun.accion.entity.Accion;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author hdez.cristobal
 */
public interface AccionJpaRepository extends JpaRepository<Accion, String> {
    
}
