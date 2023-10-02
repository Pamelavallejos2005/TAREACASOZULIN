package com.proyecto.demo.entity;


import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Lectores")
public class Lectores {
    @Id
    @Column(name="DNILector")
  private  int DNILector;

    @Column(name="Nombre")
   private  String Nombre;


    @Column(name="Telefono")
   private  int Telefono;

    @Column(name="Direccion")
   private  String Direccion;

    @Column(name="CODIGOPOSTAL")
    private int CODIGOPOSTAL;

    @Column(name="Observaciones")
   private  String Observaciones;

//   @JsonIgnoreProperties("lector")
// @OneToMany(mappedBy = "lector", cascade = CascadeType.ALL, orphanRemoval = true)
// private List<Alquiler> alquileres;

 @JsonIgnore
    @OneToMany(cascade= CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "lector")
    private List<Alquiler> alquileres;
  

}
