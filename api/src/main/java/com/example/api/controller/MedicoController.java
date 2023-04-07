package com.example.api.controller;

import com.example.api.medico.Medico;
import com.example.api.medico.DadosCadastroMedico;
import com.example.api.repository.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository medicoRepository;

    @GetMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroMedico novoMedico){
        medicoRepository.save(new Medico(novoMedico));
    }
}
