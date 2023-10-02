package com.proyecto.demo.entity;



import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import lombok.Data;

import java.util.List;

@Data
@Entity

@Table(name="Autores")

public class Autores {

     @Id
    @Column(name = "ID_AUTOR")
    private int ID_AUTOR;

    @Column(name = "AUTOR")
    private String AUTOR;

    @OneToMany(cascade=CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "autores")
    @JsonIgnore
    private List<Libros> libros







            ;


}
