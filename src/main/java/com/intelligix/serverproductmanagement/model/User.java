package com.intelligix.serverproductmanagement.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table (name = "user")
public class User {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;

    @Column (name = "name")
    private String name;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Enumerated (EnumType.STRING)
    @Column(name = "role")
    private Role role;

    @Transient
    private String token;
}
