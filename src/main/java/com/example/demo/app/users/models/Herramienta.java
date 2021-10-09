package com.example.demo.app.users.models;

import javax.persistence.*;

@Entity
@Table(name = "adm_herramienta")
public class Herramienta {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "herramienta_seq_gen")
    @SequenceGenerator(name = "herramienta_seq_gen", sequenceName = "herramienta_id_seq", allocationSize = 1)
    @Column(name = "id")
    private Integer id;
    @Column(name = "herramienta_nombre", columnDefinition = "varchar(40)", nullable = false, unique = true)
    private String herramientaNombre;
    @Column(name = "herramienta_tipo", columnDefinition = "varchar(20)", nullable = false, unique = true)
    private String herramientaTipo;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHerramientaNombre() {
        return herramientaNombre;
    }

    public void setHerramientaNombre(String herramienta) {
        this.herramientaNombre = herramienta;
    }

    public String getHerramientaTipo() {
        return herramientaTipo;
    }

    public void setHerramientaTipo(String tipo) {
        this.herramientaTipo = tipo;
    }

}
