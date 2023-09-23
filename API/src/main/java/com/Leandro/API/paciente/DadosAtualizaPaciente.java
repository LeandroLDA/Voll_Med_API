package com.Leandro.API.paciente;

import com.Leandro.API.endereco.DadosEndereco;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizaPaciente(

        @NotNull
        Long id,

        String nome,

        String telefone,

        DadosEndereco endereco
) {
}
