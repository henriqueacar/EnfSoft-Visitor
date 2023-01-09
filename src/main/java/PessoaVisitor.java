public class PessoaVisitor implements Visitor{

    public String aceitar(Pessoa pessoa){
        return pessoa.aceitar(this);
    }

    @Override
    public String exibirAtendente(Atendente atendente) {
        return "Atendente{"+
                "nome=" + atendente.getNome() +
                ", salario=" + atendente.getSalario() +
                ", nomeCliente=" + atendente.getNomeCliente() +
                "}";
    }

    @Override
    public String exibirSupervisor(Supervisor supervisor) {
        return "Supervisor{" +
                "nome=" + supervisor.getNome() +
                ", salario=" + supervisor.getSalario() +
                ", nomeAtendenteSupervisionado=" + supervisor.getNomeAtendente() +
                "}";
    }

    @Override
    public String exibirGerente(Gerente gerente) {
        return "Gerente{" +
                "nome=" + gerente.getNome() +
                ", salario=" + gerente.getSalario() +
                ", nomeSetorGerenciado=" + gerente.getNomeSetor() +
                "}";
    }
}
