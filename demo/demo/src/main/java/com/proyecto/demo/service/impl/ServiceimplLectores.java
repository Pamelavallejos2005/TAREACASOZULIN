package com.proyecto.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.proyecto.demo.entity.Lectores;
import com.proyecto.demo.repository.RepositoryGetNewId;
import com.proyecto.demo.repository.RepositoryLectores;
import com.proyecto.demo.service.ServiceLectores;

import jakarta.transaction.Transactional;

@Service("lectoresServiceImpl")
@Transactional


public class ServiceimplLectores implements ServiceLectores {

    @Autowired
    @Qualifier("lectoresRepository")
    private RepositoryLectores repositoryLectores;

     @Autowired
    @Qualifier("getNewIdRepository")
    private  RepositoryGetNewId RepoId ;

    public List<Lectores> listAllLectores(){

        
            return (List<Lectores>) repositoryLectores.findAll();
    }

    public Optional<Lectores> findByIdLectores( String id) {

        return repositoryLectores.findById(id);
    }

    public Lectores updateLectores(Lectores lectores) {

        return repositoryLectores.save(lectores);
    }


    public int  removeLectores(String id) {

         repositoryLectores.deleteById(id);
         return 0;

    }

     public Lectores  addLectores(Lectores lectores) {

         
            int id = RepoId.getID().getId();

            Lectores new_ = new Lectores();
            new_.setDNILector(id);;
            new_.setNombre(lectores.getNombre());
            new_.setTelefono(lectores.getTelefono());
            new_.setDireccion(lectores.getDireccion());
            new_.setCODIGOPOSTAL(lectores.getCODIGOPOSTAL());
            new_.setObservaciones(lectores.getObservaciones());
            
         return repositoryLectores.save(new_);

    }
  
}
