package com.Leandro.API.medico;

import com.Leandro.API.endereco.DadosEndereco;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizaMedico(
        @NotNull
        Long id,

        String nome,

        String telefone,

        DadosEndereco endereco //verifcar as regras das anotaçoes de validação.
        //Caso o DTO de cadastro for diferente do DTo de atualização devemos criar outro DTO
) {


}
