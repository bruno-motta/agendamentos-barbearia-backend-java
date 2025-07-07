package com.java.barbearia.controllers;

import com.java.barbearia.models.ClienteModel;
import com.java.barbearia.services.ClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.service.annotation.PutExchange;

import java.util.UUID;

@RestController
@RequestMapping("/clientes")
@RequiredArgsConstructor
public class ClienteController {

    private final ClienteService clienteService;

    @PostMapping
    public ResponseEntity<Void> salvarCliente(@RequestBody ClienteModel cliente){
        clienteService.criarCliente(cliente);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/email")
    public ResponseEntity<ClienteModel> buscarClienteEmail(@RequestParam String email){
        return ResponseEntity.ok(clienteService.buscarClientePorEmail(email));
    }

    @DeleteMapping("email")
    public ResponseEntity<Void> deletarClienteEmail(@RequestParam String email){
        clienteService.deletarCleientePorEmail(email);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<ClienteModel> atualizarCliente(@PathVariable UUID id,
                                                         @RequestBody ClienteModel cliente)
    {
        ClienteModel clienteAtualizado = clienteService.atualizarCliente(
                id,
                cliente.getEmailCliente(),
                cliente.getTelefoneCliente()
        );

        return ResponseEntity.ok(clienteAtualizado);
    }

}
