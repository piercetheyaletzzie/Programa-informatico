package com.example.demo.app.users.models;

import javax.persistence.*;

@Entity
@Table(name = "adm_cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cliente_seq_gen")
    @SequenceGenerator(name = "cliente_seq_gen", sequenceName = "cliente_id_seq", allocationSize = 1)
    @Column(name = "id")
    private Integer id;
    @Column(name = "cliente_nombre", columnDefinition = "varchar(40)", nullable = false)
    private String clienteNombre;
    @Column(name = "email", columnDefinition = "varchar(34)", nullable = false, unique = true)
    private String eMail;
    @Column(name = "telefono", columnDefinition = "varchar(15)")
    private String telefono;

    public Cliente() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClienteNombre() {
        return clienteNombre;
    }

    public void setClienteNombre(String clienteNombre) {
        this.clienteNombre = clienteNombre;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}





