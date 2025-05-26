package com.museo.gestion_entradas.entities;
import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "usuarios")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(unique = true)
    private String username;
    private String password;
    @Column(name = "rol", columnDefinition = "ENUM('ADMIN', 'VENDEDOR','SUPERADMIN')")
    private String rol;

}

