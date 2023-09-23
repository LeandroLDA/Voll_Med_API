package com.Leandro.API.paciente;

import com.Leandro.API.endereco.Endereco;

public record DadosListagemPaciente(Long id, String nome, Endereco endereco, String telefone, String email) {


    public DadosListagemPaciente(Paciente paciente) {
        this(paciente.getId(), paciente.getNome(), paciente.getEndereco(), paciente.getTelefone(), paciente.getEmail());
    }
}