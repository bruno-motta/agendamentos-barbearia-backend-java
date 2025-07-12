package com.java.barbearia.mappers;

import com.java.barbearia.dtos.ClienteRequestDto;
import com.java.barbearia.dtos.ClienteResponseDto;
import com.java.barbearia.models.ClienteModel;

public class ClienteMapper {

    //Seta: Mostra
    public static ClienteModel toModel(ClienteRequestDto dto){
        ClienteModel model = new ClienteModel();
        model.setNomeCliente(dto.nomeCliente());
        model.setEmailCliente(dto.emailCliente());
        model.setTelefoneCliente(dto.telefoneCliente());
        return model;
    }

    //Obtém
    public static ClienteResponseDto toResponse(ClienteModel model){
        return new ClienteResponseDto(
                model.getIdCliente(),
                model.getNomeCliente(),
                model.getEmailCliente(),
                model.getTelefoneCliente(),
                model.getDataCadastro()
        );
    }

}
