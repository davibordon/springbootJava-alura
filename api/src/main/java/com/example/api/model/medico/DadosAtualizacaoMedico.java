package com.example.api.model.medico;

import com.example.api.model.endereco.DadosEndereco;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class DadosAtualizacaoMedico {
    @NotNull
    private Integer id;
    private String nome;
    private String telefone;
    private DadosEndereco endereco;



}
