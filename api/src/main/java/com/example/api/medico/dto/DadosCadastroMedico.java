package com.example.api.medico.dto;

import com.example.api.endereco.Endereco;
import com.example.api.medico.Especialidade;

public record DadosCadastroMedico(
        String nome,
        String email,
        String crm,
        Especialidade especialidade,
        Endereco endereco ) {
}
