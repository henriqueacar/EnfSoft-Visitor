public class Gerente implements Pessoa{
    private String nome;
    private float salario;
    private Setor setor;

    public Gerente(String nome, float salario, Setor setor) {
        this.nome = nome;
        this.salario = salario;
        this.setor = setor;
    }

    public String getNome() {
        return nome;
    }

    public String getSalario() {
        return Float.toString(salario);
    }

    public String getNomeSetor() {
        return setor.getNome();
    }

    public String aceitar(Visitor visitor){
        return visitor.exibirGerente(this);
    }
}
