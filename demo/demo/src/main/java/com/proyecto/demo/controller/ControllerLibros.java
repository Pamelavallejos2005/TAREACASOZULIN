package com.proyecto.demo.controller;
import com.proyecto.demo.entity.Libros;


import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.demo.service.impl.ServiceimplLibros;

@RestController
@RequestMapping("/api/libros")
@CrossOrigin(origins = "*")


public class ControllerLibros {

    @Autowired
    @Qualifier("librosServiceImpl")

    private ServiceimplLibros librosService;

    //Listar Personas
        @GetMapping(path="/list", produces = {"application/json"})
        public List<Libros> listLibros(){

            return librosService.listAllLibros();

        }

         @GetMapping(path="/get/{id}", produces = {"application/json"})
        public Optional<Libros> getLibros(@PathVariable String id){

            return librosService.findByIdLibros(id);

        }

         @PutMapping(path="/editar/{id}", produces = {"application/json"})
        public Libros updLibros(@RequestBody Libros libros ){

            return librosService.updateLibros(libros);

        }

        //Eliminar Persona
        @DeleteMapping(path="/eliminar/{id}")
        public int delLibros(@PathVariable String id ){

            return librosService.removeLibros(id);

        }


        //Añadir Persona
        @PostMapping(path="/agregar", produces = {"application/json"})

        public Libros newLibros(@RequestBody Libros libros ){
            try {
                return librosService.addLibros(libros);
            }catch (Error e){
                System.out.println("el error es:" + e);
            }
            return null;

        }






    
}
