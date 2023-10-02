package com.proyecto.demo.controller;
import com.proyecto.demo.entity.Alquiler;


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

import com.proyecto.demo.service.impl.ServiceimplAlquiler;


@RestController
@RequestMapping("/api/alquiler")
@CrossOrigin(origins = "*")


public class ControllerAlquiler {

        @Autowired
        @Qualifier("alquilerServiceImpl")

        private ServiceimplAlquiler alquilerService;

    //Listar Personas
        @GetMapping(path="/list", produces = {"application/json"})
        public List<Alquiler> listActividad(){

            return alquilerService.listAllAlquiler();

        }

         @GetMapping(path="/get/{id}", produces = {"application/json"})
        public Optional<Alquiler> getActividad(@PathVariable String id){

            return alquilerService.findByIdAlquiler(id);

        }


        //Actuaizar Persona
         @PutMapping(path="/editar", produces = {"application/json"})
        public Alquiler updProyecto(@RequestBody Alquiler alquiler ){

            return alquilerService.updateAlquiler(alquiler);

        }

        //Eliminar Persona

        @DeleteMapping(path="/eliminar/{id}")
        public int delAlquiler(@PathVariable String id ){

            return alquilerService.removeAlquiler(id);

        }

        //Añadir Persona

        @PostMapping(path="/agregar", produces = {"application/json"})
        public Alquiler newProyecto(@RequestBody Alquiler alquiler ){

            return alquilerService.addAlquiler(alquiler);

        }






    
}
