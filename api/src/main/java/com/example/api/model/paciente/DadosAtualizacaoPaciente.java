package com.example.api.model.paciente;

import com.example.api.model.endereco.DadosEndereco;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class DadosAtualizacaoPaciente {

    @NotNull
    private Integer id;
    private String nome;
    private String telefone;
    private DadosEndereco endereco;
}
