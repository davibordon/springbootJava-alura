package com.example.api.controller;

import com.example.api.medico.DadosCadastroMedico;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @GetMapping
    public void cadastrar(@RequestBody DadosCadastroMedico novoMedico){
        System.out.println(novoMedico);
    }
}
