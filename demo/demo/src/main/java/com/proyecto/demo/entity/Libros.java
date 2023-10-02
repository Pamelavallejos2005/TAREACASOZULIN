package com.proyecto.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Data
@Entity
@Table(name = "LIBROS")
public class Libros {

    @Id
    @Column(name = "ASIN_ID")
    private int ASIN_ID;

    @Column(name = "TITULO")
    private String TITULO;

    @Column(name = "FECHA_LANZAMIENTO")
    private Date FECHA_LANZAMIENTO;

    @ManyToOne
    @JoinColumn(name="ID_AUTOR", nullable = false)
    private Autores autores;

    @ManyToOne
    @JoinColumn(name="ID_CATEGORIA", nullable = false)
    private Categorias categorias;

    @ManyToOne
    @JoinColumn(name="ID_EDITORIAL", nullable = false)
    private Editoriales editoriales;

    @Column(name = "IDIOMA")
    private String IDIOMA;

    @Column(name = "PAGINAS")
    private int PAGINAS;

    @Column(name = "PORTADA")
    private String PORTADA;

    @Column(name = "DESCRIPCION")
    private String DESCRIPCION;

    @OneToMany (cascade=CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "libro")
    @JsonIgnore
    private List<Alquiler> alquileres;

}
