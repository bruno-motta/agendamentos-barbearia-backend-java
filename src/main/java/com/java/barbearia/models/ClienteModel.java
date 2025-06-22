package com.java.barbearia.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "cliente_Tb")
public class ClienteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_cliente",nullable = false, length = 254)
    private UUID idCliente;

    @Column(name = "nome_cliente",nullable = false, length = 100)
    private String nomeCliente;


    @Column(name = "telefone_cliente", nullable = true, unique = true, length = 15)
    private String telefoneCliente;

    @Column(name = "email_cliente",unique = true, nullable = false, length = 254)
    private String emailCliente;

    @Column(name = "data_cadastro",nullable = false)
    private LocalDateTime dataCadastro = LocalDateTime.now();


    public UUID getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(UUID idCliente) {
        this.idCliente = idCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getTelefoneCliente() {
        return telefoneCliente;
    }

    public void setTelefoneCliente(String telefoneCliente) {
        this.telefoneCliente = telefoneCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public LocalDateTime getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDateTime dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
}
