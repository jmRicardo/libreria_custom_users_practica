package com.jmr.practica.entities_practica.libreria_custom_users_practica.models;


import lombok.Data;
import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;

@Data
@Table(name = "roles")
@Entity
public class Role implements Serializable {

    @Serial
    private static final long serialVersionUID = -247955993024841646L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, length = 30)
    private String name;
}
