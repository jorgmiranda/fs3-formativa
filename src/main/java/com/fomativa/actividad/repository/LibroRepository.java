package com.fomativa.actividad.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fomativa.actividad.model.Libro;

public interface LibroRepository extends JpaRepository<Libro, Long>{
    
}
