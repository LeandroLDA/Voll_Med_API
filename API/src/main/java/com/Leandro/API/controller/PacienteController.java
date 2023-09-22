package com.Leandro.API.controller;



import com.Leandro.API.medico.DadosListagemMedico;
import com.Leandro.API.paciente.DadosCadastroPaciente;
import com.Leandro.API.paciente.DadosListagemPaciente;
import com.Leandro.API.paciente.Paciente;
import com.Leandro.API.paciente.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/paciente")

public class PacienteController {

    @Autowired
    PacienteRepository repository;

    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroPaciente dados){

        repository.save(new Paciente(dados));

    }
    @GetMapping
    public Page<DadosListagemPaciente> listar (@PageableDefault(size=10, sort = {"nome"}) Pageable paginacao) {
        return repository.findAll(paginacao).map(DadosListagemPaciente::new);
    }

}
