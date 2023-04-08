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
}
