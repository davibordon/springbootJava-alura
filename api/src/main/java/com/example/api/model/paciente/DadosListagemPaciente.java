package com.example.api.model.paciente;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DadosListagemPaciente {

    private Integer id;
    private String nome;
    private String teleone;
    private String email;

    public DadosListagemPaciente(Paciente paciente) {
        this.id = paciente.getId();
        this.nome = paciente.getNome();
        this.teleone = paciente.getTelefone();
        this.email = paciente.getEmail();
    }
}
