package com.example.api.medico;

import com.example.api.endereco.Endereco;

public record DadosCadastroMedico(
        String nome,
        String email,
        String crm,
        Especialidade especialidade,
        Endereco endereco ) {
}
