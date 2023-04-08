package com.example.api.model.paciente;

import com.example.api.model.endereco.Endereco;
import lombok.*;

import javax.persistence.*;

@Table(name = "PACIENTE")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String email;
    private String telefone;
    private String cpf;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "endereco_id")
    private Endereco endereco;

    public Paciente(DadosCadastroPaciente dadosPaciente) {
        this.nome = dadosPaciente.getNome();
        this.email = dadosPaciente.getEmail();
        this.telefone = dadosPaciente.getTelefone();
        this.endereco = new Endereco(dadosPaciente.getEndereco());
    }
}
