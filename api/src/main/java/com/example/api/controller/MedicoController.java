package com.example.api.controller;

import com.example.api.model.medico.DadosAtualizacaoMedico;
import com.example.api.model.medico.DadosListagemMedico;
import com.example.api.model.medico.Medico;
import com.example.api.model.medico.DadosCadastroMedico;
import com.example.api.repository.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository medicoRepository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroMedico novoMedico) {
        medicoRepository.save(new Medico(novoMedico));
    }

    @GetMapping
    public Page<DadosListagemMedico> listar(@PageableDefault(size = 10, page = 0, sort = {"nome"}) Pageable paginacao) {
        return medicoRepository.findAllByAtivoTrue(paginacao).map(DadosListagemMedico::new);
    }

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid DadosAtualizacaoMedico medicoAtualizado) {
        Medico medico = medicoRepository.getReferenceById(medicoAtualizado.getId());
        medico.atualizarInformacoes(medicoAtualizado);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void excluir(@PathVariable Integer id) {
        Medico medico = medicoRepository.getReferenceById(id);
        medico.excluir();
    }
}
