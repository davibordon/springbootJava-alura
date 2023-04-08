package com.example.api.controller;

import com.example.api.model.paciente.DadosCadastroPaciente;
import com.example.api.model.paciente.Paciente;
import com.example.api.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    @Autowired
    private PacienteRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroPaciente dadosPaciente){
        repository.save(new Paciente(dadosPaciente));
    }
}
