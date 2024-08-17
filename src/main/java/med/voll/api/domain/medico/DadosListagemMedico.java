package med.voll.api.domain.medico;

public record DadosListagemMedico(Long id,String nome, String email, String crm, Especialidade especialidade) {

    public DadosListagemMedico(Medico medico){
        this(medico.getID(), medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());
    }

}
