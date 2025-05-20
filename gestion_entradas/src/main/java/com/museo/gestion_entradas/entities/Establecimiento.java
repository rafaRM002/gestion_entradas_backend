package com.museo.gestion_entradas.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "establecimento")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Establecimiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    private String nombre;
    @ManyToOne
    @JoinColumn(name = "comercio_id", nullable = false)
    private Comercio comercio;

}
