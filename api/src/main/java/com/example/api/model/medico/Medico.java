package com.example.api.model.medico;

import com.example.api.model.endereco.Endereco;
import lombok.*;

import javax.persistence.*;

@Table(name = "MEDICOS")
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
    private String telefone;
    private String crm;
    @Enumerated(EnumType.STRING)
    private Especialidade especialidade;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "endereco_id", referencedColumnName = "id")
    public Endereco endereco;

    private Boolean ativo;

    public Medico(DadosCadastroMedico novoMedico) {
        this.ativo = true;
        this.nome = novoMedico.getNome();
        this.email = novoMedico.getEmail();
        this.telefone = novoMedico.getTelefone();
        this.crm = novoMedico.getCrm();
        this.especialidade = novoMedico.getEspecialidade();
        this.endereco = new Endereco(novoMedico.getEndereco());
    }


    public void atualizarInformacoes(DadosAtualizacaoMedico medicoAtualizado) {
        if (medicoAtualizado.getNome() != null){
            this.nome = medicoAtualizado.getNome();
        }
        if (medicoAtualizado.getTelefone() != null){
            this.telefone = medicoAtualizado.getTelefone();
        }
        if (medicoAtualizado.getEndereco() != null){
            this.endereco.atualizarEndereco(medicoAtualizado.getEndereco());
        }

    }

    public void excluir() {
        this.ativo = false;
    }
}
