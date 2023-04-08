package com.example.api.model.medico;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
public class DadosListagemMedico {
    private String nome;
    private String email;
    private String crm;
    private Especialidade especialidade;

    public DadosListagemMedico(Medico medico) {
        this.nome = medico.getNome();
        this.email = medico.getEmail();
        this.crm = medico.getCrm();
        this.especialidade = medico.getEspecialidade();
    }
}
