package com.example.api.medico;

import com.example.api.endereco.DadosEndereco;
import com.example.api.endereco.Endereco;
import com.example.api.medico.dto.DadosCadastroMedico;
import lombok.*;

import javax.persistence.*;

@Table(name = "medicos")
@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
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
    @JoinColumn(name = "endereco_id", referencedColumnName = "id")
    private Endereco endereco;

    public Medico(DadosCadastroMedico novoMedico) {
        this.nome = novoMedico.nome();
        this.email = novoMedico.email();
        this.crm = novoMedico.crm();
        this.especialidade = novoMedico.especialidade();
        this.endereco = new Endereco(novoMedico.endereco());
    }
}