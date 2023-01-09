public class Supervisor implements Pessoa{
    private String nome;
    private float salario;
    private Atendente atendente;

    public Supervisor(String nome, float salario, Atendente atendente) {
        this.nome = nome;
        this.salario = salario;
        this.atendente = atendente;
    }

    public String getNome() {
        return nome;
    }

    public String getSalario() {
        return Float.toString(salario);
    }

    public String getNomeAtendente() {
        return atendente.getNome();
    }

    public String aceitar(Visitor visitor){
        return visitor.exibirSupervisor(this);
    }
}
