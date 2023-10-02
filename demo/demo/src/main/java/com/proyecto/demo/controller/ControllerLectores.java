package com.proyecto.demo.controller;
import com.proyecto.demo.entity.Lectores;


import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

import com.proyecto.demo.service.impl.ServiceimplLectores;

@RestController
@RequestMapping("/api/lectores")
@CrossOrigin(origins = "*")


public class ControllerLectores {

    @Autowired
    @Qualifier("lectoresServiceImpl")

    private ServiceimplLectores lectoresService;


    //Listar Personas
    @GetMapping(path = "/list", produces = {"application/json"})
    public List<Lectores> listEditorial() {

        return lectoresService.listAllLectores();

    }

    @GetMapping(path = "/get/{id}", produces = {"application/json"})
    public Optional<Lectores> getLectores(@PathVariable String id) {

        return lectoresService.findByIdLectores(id);

    }

    //Actuaizar Persona
    @PutMapping(path = "/editar", produces = {"application/json"})
    public Lectores updLibros(@RequestBody Lectores lectores) {

        return lectoresService.updateLectores(lectores);

    }

    //Eliminar Persona
    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Void> delLectores(@PathVariable String id) {
        int result = lectoresService.removeLectores(id);
        if (result == 1) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT); // Devuelve 204 No Content si se eliminó con éxito
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND); // Devuelve 404 Not Found si no se encontró el elemento
        }
    }

    //Añadir Persona
        @PostMapping(path="/agregar", produces = {"application/json"})
        public Lectores newLectores(@RequestBody Lectores lectores ){

            return lectoresService.addLectores(lectores);

        }






    
}
