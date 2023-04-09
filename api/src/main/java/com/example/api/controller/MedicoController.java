package com.example.api.controller;

import com.example.api.model.medico.DadosListagemMedico;
import com.example.api.model.medico.Medico;
import com.example.api.model.medico.DadosCadastroMedico;
import com.example.api.repository.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository medicoRepository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroMedico novoMedico){
        medicoRepository.save(new Medico(novoMedico));
    }

    @GetMapping
    public Page<DadosListagemMedico> listar(Pageable paginacao){
        return medicoRepository.findAll(paginacao).map(DadosListagemMedico::new);
    }
}
