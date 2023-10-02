package com.proyecto.demo.repository;
import com.proyecto.demo.entity.Alquiler;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository("alquilerRepository")

public interface RepositoryAlquiler extends CrudRepository<Alquiler,String>     {
        



    
}
