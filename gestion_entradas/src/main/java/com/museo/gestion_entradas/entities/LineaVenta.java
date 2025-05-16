package com.museo.gestion_entradas.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
@Entity
@Table(name = "lineas_venta")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LineaVenta {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        private int id;

        @ManyToOne
        @JoinColumn(name = "venta_id", nullable = false)
        private Ventas venta;

        @ManyToOne
        @JoinColumn(name = "producto_id", nullable = false)
        private Producto producto;

        @ManyToOne
        @JoinColumn(name = "entrada_id", nullable = false)
        private Entrada entrada;

        private BigInteger cantidad;

        @Column(precision = 10, scale = 2)
        private BigDecimal subtotal;

    }