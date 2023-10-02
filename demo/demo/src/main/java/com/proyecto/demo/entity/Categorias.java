package com.proyecto.demo.entity;



import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import lombok.Data;

import java.util.List;

@Data
@Entity

@Table(name="Categoria")

public class Categorias {

     @Id
    @Column(name = "ID_CATEGORIA")
     private int ID_CATEGORIA;

    @Column(name = "CATEGORIA")
    private String CATEGORIA;

    @OneToMany(cascade=CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "categorias")
    @JsonIgnore
    private List<Libros> libros;

}
