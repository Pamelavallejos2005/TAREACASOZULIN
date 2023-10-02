package com.proyecto.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data



public class NuevaTabla {


    @Id
    private int id;
    
}
