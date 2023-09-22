package com.Leandro.API.paciente;


import com.Leandro.API.endereco.Endereco;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table (name = "pacientes")
@Entity(name = "paciente")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")

public class Paciente {

    @Id    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String telefone;
    private String email;
    @Enumerated(EnumType.STRING)
    private TipoPlano tipoplano;
    @Embedded
    private Endereco endereco;

    public Paciente(DadosCadastroPaciente dados) {

        this.nome = dados.nome();
        this.telefone = dados.telefone();
        this.email = dados.email();
        this.tipoplano =  dados.tipoplano();
        this.endereco = new Endereco(dados.endereco());
    }
}
