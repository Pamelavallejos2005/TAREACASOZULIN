package com.proyecto.demo.repository;
import com.proyecto.demo.entity.Lectores;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository("lectoresRepository")

public interface RepositoryLectores extends CrudRepository<Lectores,String>     {
        



    
}
