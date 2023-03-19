package com.example.api.medico;

import com.example.api.endereco.DadosEndereco;

public class DadosCadastroMedico {

    private String nome;
    private String email;
    private String crm;
    private Especialidade especialidade;
    private DadosEndereco endereço;

    public DadosCadastroMedico(String nome, String email, String crm, Especialidade especialidade, DadosEndereco endereço) {
        this.nome = nome;
        this.email = email;
        this.crm = crm;
        this.especialidade = especialidade;
        this.endereço = endereço;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public Especialidade getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }

    public DadosEndereco getEndereço() {
        return endereço;
    }

    public void setEndereço(DadosEndereco endereço) {
        this.endereço = endereço;
    }
}
