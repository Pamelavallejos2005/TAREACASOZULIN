package com.proyecto.demo.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "ALQUILERES")

public class Alquiler {
  @Id
  @Column(name = "ID_Alquileres")
  private int ID_Alquileres;

@ManyToOne(fetch = FetchType.EAGER)
@JoinColumn(name = "IDLECTOR")
private Lectores lector;

@ManyToOne(fetch = FetchType.EAGER)
@JoinColumn(name = "id_Libro")
private Libros libro;

  @Column(name = "FECHASALIDA")
  private Date FechaSalida;

  @Column(name = "FECHAENTRADA")
  private Date FechaEntrada;

}
