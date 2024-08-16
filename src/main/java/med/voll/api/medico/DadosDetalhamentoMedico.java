package med.voll.api.medico;

import jakarta.persistence.Entity;
import med.voll.api.endereco.Endereco;

public record DadosDetalhamentoMedico(Long id, String nome, String email, String crm, String telefone,Especialidade especialidade, Endereco endereco) {

    public DadosDetalhamentoMedico(Medico medico){
        this(medico.getID(), medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getTelefone(), medico.getEspecialidade(), medico.getEndereco());
    }

}
