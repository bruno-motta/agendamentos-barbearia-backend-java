package com.java.barbearia.dtos;

import jakarta.validation.constraints.*;

import java.time.LocalDateTime;

//Requisição= Envio
public record ClienteRequestDto(

        @NotBlank(message = "Nome deve ser colocado")
        String nomeCliente,

        @Email
        @NotBlank(message = "O Email não pode ficar em branco!")
        String emailCliente,

        @NotBlank(message = "O número de telefone não pode ficar em branco!")
        @Size(max = 15, message = "O telefone não pode ter mais de 15 caracteres")
        String telefoneCliente
) {
}
