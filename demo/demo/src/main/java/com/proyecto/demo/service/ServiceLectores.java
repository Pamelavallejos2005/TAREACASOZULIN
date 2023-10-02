package com.proyecto.demo.service;

import java.util.List;
import java.util.Optional;

import com.proyecto.demo.entity.Lectores;

public interface ServiceLectores {

        public abstract List<Lectores> listAllLectores();
        public abstract Optional<Lectores> findByIdLectores(String id);
        public abstract Lectores updateLectores(Lectores lectores);
        public abstract int removeLectores(String id);
        public abstract Lectores addLectores(Lectores lectores);



    
}
