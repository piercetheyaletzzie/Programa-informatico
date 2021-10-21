package com.example.demo.app.clientes.models;

import javax.persistence.*;

@Entity
@Table(name = "adm_cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cliente_seq_gen")
    @SequenceGenerator(name = "cliente_seq_gen", sequenceName = "cliente_id_seq", allocationSize = 1)
    @Column(name = "cliente_id")
    private Integer clienteId;
    @Column(name = "cliente_nombre", columnDefinition = "varchar(40)", nullable = false)
    private String clienteNombre;
    @Column(name = "email", columnDefinition = "varchar(34)", nullable = false, unique = true)
    private String eMail;
    @Column(name = "telefono", columnDefinition = "varchar(15)")
    private String telefono;

    public Cliente() {
    }

    public Integer getClienteId() {
        return clienteId;
    }

    public void setClienteId(Integer clienteId) {
        this.clienteId = clienteId;
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



