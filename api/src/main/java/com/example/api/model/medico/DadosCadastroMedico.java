package com.example.api.model.medico;

import com.example.api.model.endereco.DadosEndereco;
import com.example.api.model.endereco.Endereco;
import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Getter
@Setter
public class DadosCadastroMedico{
    @NotBlank
    private String nome;
    @Email
    @NotBlank
    private String email;
    @NotBlank
    private String telefone;
    @NotBlank
    @Pattern(regexp = "\\d{4,6}")
    private String crm;
    @NotNull
    private Especialidade especialidade;
    @NotNull
    @Valid
    private DadosEndereco endereco;

}
