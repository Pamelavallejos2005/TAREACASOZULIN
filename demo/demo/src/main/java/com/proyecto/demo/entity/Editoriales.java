package com.proyecto.demo.entity;



import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "EDITORIAL")
public class Editoriales {
    @Id
    @Column(name = "ID_EDITORIAL")
    private int ID_EDITORIAL;

    @Column(name="EDITORIAL")
    private  String EDITORIAL;

    @OneToMany(cascade=CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "editoriales")
    @JsonIgnore
    private List<Libros> libros;


}
