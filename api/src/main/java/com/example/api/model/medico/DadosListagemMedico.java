package com.example.api.model.medico;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public final class DadosListagemMedico {
    private String nome;
    private String email;
    private String crm;
    private Especialidade especialidade;


}
