package com.proyecto.demo.service;

import java.util.List;
import java.util.Optional;

import com.proyecto.demo.entity.Alquiler;



public interface ServiceAlquiler {

        public abstract List<Alquiler> listAllAlquiler();
        public abstract Optional<Alquiler> findByIdAlquiler(String id);
        public abstract Alquiler updateAlquiler(Alquiler alquiler);
        public abstract int removeAlquiler(String id);
        public abstract Alquiler addAlquiler(Alquiler alquiler);



    
}