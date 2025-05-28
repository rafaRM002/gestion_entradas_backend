package com.museo.gestion_entradas.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "entradas")
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
    private Double precio;
    private Date fecha;
    @ManyToOne
    @JoinColumn(name = "tipo_id", nullable = false)
    private Tipo tipo;
    @ManyToOne
    @JoinColumn(name = "establecimiento_id", nullable = false)
    private Establecimiento establecimiento;

}
