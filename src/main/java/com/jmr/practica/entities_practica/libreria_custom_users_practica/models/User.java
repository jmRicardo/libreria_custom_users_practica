package com.jmr.practica.entities_practica.libreria_custom_users_practica.models;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.List;

public class User implements Serializable {

    @Serial
    private static final long serialVersionUID = 4_002_221_912_401_133_094L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, length = 20)
    private String username;

    @Column(length = 60)
    private String password;

    private Boolean enabled;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(unique = true, length = 100)
    private String email;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "users_with_roles", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"), uniqueConstraints = {
            @UniqueConstraint(columnNames = { "user_id", "role_id" }) })
    private List<Role> roles;

    private Integer attempts;
}
