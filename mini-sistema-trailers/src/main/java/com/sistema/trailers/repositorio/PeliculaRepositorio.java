package com.sistema.trailers.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistema.trailers.modelo.Pelicula;

public interface PeliculaRepositorio extends JpaRepository<Pelicula, Integer>{

}
