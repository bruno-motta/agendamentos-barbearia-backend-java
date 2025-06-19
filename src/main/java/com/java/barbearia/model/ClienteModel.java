package com.java.barbearia.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "cliente_Tb")
public class ClienteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id_cliente;

    @Column(nullable = false)
    private String nome_cliente;


    @Column(unique = true)
    private String telefone_cliente;

    @Column(unique = true, nullable = false)
    private String email_cliente;


    private LocalDateTime data_cadastro = LocalDateTime.now();


    public UUID getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(UUID id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNome_cliente() {
        return nome_cliente;
    }

    public void setNome_cliente(String nome_cliente) {
        this.nome_cliente = nome_cliente;
    }

    public String getTelefone_cliente() {
        return telefone_cliente;
    }

    public void setTelefone_cliente(String telefone_cliente) {
        this.telefone_cliente = telefone_cliente;
    }

    public String getEmailc_cliente() {
        return email_cliente;
    }

    public void setEmailc_cliente(String emailc_cliente) {
        this.email_cliente = emailc_cliente;
    }

    public LocalDateTime getData_cadastro() {
        return data_cadastro;
    }

    public void setData_cadastro(LocalDateTime data_cadastro) {
        this.data_cadastro = data_cadastro;
    }
}
