package com.proyecto.demo.service;

import java.util.List;
import java.util.Optional;

import com.proyecto.demo.entity.Libros;

public interface ServiceLibros {

        public abstract List<Libros> listAllLibros();
        public abstract Optional<Libros> findByIdLibros(String id);
        public abstract Libros updateLibros(Libros proyecto);
        public abstract int removeLibros(String id);
        public abstract Libros addLibros(Libros proyecto);



    
}
