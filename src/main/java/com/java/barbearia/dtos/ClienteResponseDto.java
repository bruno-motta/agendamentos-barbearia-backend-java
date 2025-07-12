package com.java.barbearia.dtos;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

//Responsavél por retornar os dados da api
public record ClienteResponseDto(
        UUID idCliente,
        String nomeCliente,
        String emailCliente,
        String telefonfeCliente,
        LocalDateTime dataCadastro

) {
}
