package com.example.propuestacultura.models;

import jakarta.persistence.*;

@Entity
@Table(name = "tbl_tipos_usuarios")
public class TiposUsuarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false)
    private Integer id;

    @Column(name = "nombre")
    private String name;

    public TiposUsuarios() {
    }

    public TiposUsuarios(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
