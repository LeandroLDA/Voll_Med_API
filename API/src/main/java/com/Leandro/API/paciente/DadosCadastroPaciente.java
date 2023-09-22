package com.Leandro.API.paciente;

import com.Leandro.API.endereco.DadosEndereco;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;


public record DadosCadastroPaciente(
       @NotBlank
       String nome,
       @NotBlank
       String telefone,
       @Email
       String email,
       @NotNull
       TipoPlano tipoplano,
       @NotBlank
       DadosEndereco endereco) {
}
