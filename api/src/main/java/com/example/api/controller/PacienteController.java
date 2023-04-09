package com.example.api.controller;

import com.example.api.model.paciente.DadosAtualizacaoPaciente;
import com.example.api.model.paciente.DadosListagemPaciente;
import com.example.api.model.paciente.DadosCadastroPaciente;
import com.example.api.model.paciente.Paciente;
import com.example.api.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    @Autowired
    private PacienteRepository pacienteRepository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroPaciente dadosPaciente){
        pacienteRepository.save(new Paciente(dadosPaciente));
    }

    @GetMapping
    public Page<DadosListagemPaciente> listar(@PageableDefault(size = 10, page = 0, sort = {"nome"}) Pageable paginacao) {
        return pacienteRepository.findAllByAtivoTrue(paginacao).map(DadosListagemPaciente::new);
    }

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody DadosAtualizacaoPaciente pacienteAtualizado){
        Paciente paciente = pacienteRepository.getReferenceById(pacienteAtualizado.getId());
        paciente.atualizarInformacoes(pacienteAtualizado);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void deletar(@PathVariable Integer id){
        Paciente paciente = pacienteRepository.getReferenceById(id);
        paciente.excluir();
    }
}
