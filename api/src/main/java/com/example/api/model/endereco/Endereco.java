package com.example.api.model.endereco;

import com.example.api.model.medico.Medico;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "ENDERECO")
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String logradouro;
    private String bairro;
    private String cep;
    private String cidade;
    private String uf;
    private String complemento;
    private String numero;

    public Endereco(DadosEndereco novoEndereco) {
        this.logradouro = novoEndereco.logradouro();
        this.bairro = novoEndereco.bairro();
        this.cep = novoEndereco.cep();
        this.cidade = novoEndereco.cidade();
        this.uf = novoEndereco.uf();
        this.complemento = novoEndereco.complemento();
        this.numero = novoEndereco.numero();
    }

    public void atualizarEndereco(DadosEndereco dados) {
        if (dados.logradouro() != null){
            this.logradouro = dados.logradouro();
        }
        if (dados.bairro() != null){
            this.bairro = dados.bairro();
        }
        if (dados.cep() != null){
            this.cep = dados.cep();
        }
        if (dados.cidade() != null){
            this.cidade = dados.cidade();
        }
        if (dados.uf() != null){
            this.uf = dados.uf();
        }
        if (dados.complemento() != null){
            this.complemento = dados.complemento();
        }
        if (dados.numero() != null){
            this.numero = dados.numero();
        }
    }
}
