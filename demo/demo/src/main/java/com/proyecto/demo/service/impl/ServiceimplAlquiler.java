package com.proyecto.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.proyecto.demo.entity.Alquiler;
import com.proyecto.demo.repository.RepositoryGetNewId;
import com.proyecto.demo.repository.RepositoryAlquiler;
import com.proyecto.demo.service.ServiceAlquiler;
import jakarta.transaction.Transactional;

@Service("alquilerServiceImpl")
@Transactional


public class ServiceimplAlquiler implements ServiceAlquiler {

    @Autowired
    @Qualifier("alquilerRepository")
    private RepositoryAlquiler repositoryAlquiler;

     @Autowired
    @Qualifier("getNewIdRepository")
    private  RepositoryGetNewId RepoId ;

    public  List<Alquiler> listAllAlquiler(){

        
            return (List<Alquiler>) repositoryAlquiler.findAll();
            
    }

    public Optional<Alquiler> findByIdAlquiler( String id) {

        return repositoryAlquiler.findById(id);
    }

    public Alquiler updateAlquiler(Alquiler alquiler) {

        return repositoryAlquiler.save(alquiler);
    }


    public int  removeAlquiler(String id) {

         repositoryAlquiler.deleteById(id);
         return 0;

    }

     public Alquiler  addAlquiler(Alquiler alquiler) {

         
            int id = RepoId.getID().getId();

            Alquiler new_ = new Alquiler();
            new_.setID_Alquileres(id);
            new_.setLector(alquiler.getLector());
            new_.setLibro(alquiler.getLibro());
            new_.setFechaSalida(alquiler.getFechaSalida());
            new_.setFechaEntrada(alquiler.getFechaEntrada());
           
           


         return repositoryAlquiler.save(new_);

    }
  
}
