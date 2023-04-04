package com.example.api.medico;

import com.example.api.endereco.DadosEndereco;
import com.example.api.endereco.Endereco;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Table(name = "medicos")
@Entity
@Data
@EqualsAndHashCode(of = "id")
public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String email;
    private String crm;
    @Enumerated(EnumType.STRING)
    private Especialidade especialidade;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "endereco_id")
    private Endereco endereco;
}
