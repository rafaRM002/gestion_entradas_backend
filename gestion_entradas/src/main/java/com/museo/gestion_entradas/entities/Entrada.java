package com.museo.gestion_entradas.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "entrada")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Entrada {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id_entrada;

    private String nombre;
    private String descripcion;
    private String tipo;
    private Double precio;
    private Date fecha;

}
