package com.proyecto.demo.repository;
import com.proyecto.demo.entity.Libros;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository("librosRepository")

public interface RepositoryLibros  extends CrudRepository<Libros,String>     {
        // int deleteByIdProyecto(String id);
        // int findBynombre(String nombre);



    
}
