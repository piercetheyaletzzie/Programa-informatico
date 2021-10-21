package com.example.demo.app.herramientas.models;

import javax.persistence.*;

@Entity
@Table(name = "adm_herramienta")
public class Herramienta {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "herramienta_seq_gen")
    @SequenceGenerator(name = "herramienta_seq_gen", sequenceName = "herramienta_id_seq", allocationSize = 1)
    @Column(name = "herramienta_id")
    private Integer herramientaId;
    @Column(name = "herramienta_nombre", columnDefinition = "varchar(40)", nullable = false, unique = true)
    private String herramientaNombre;
    @Column(name = "herramienta_tipo", columnDefinition = "varchar(20)", nullable = false, unique = true)
    private String herramientaTipo;


    public Integer getHerramientaId() {
        return herramientaId;
    }

    public void setHerramientaId(Integer herramientaId) {
        this.herramientaId = herramientaId;
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
