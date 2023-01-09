public class Atendente implements Pessoa{
    private String nome;
    private float salario;
    private Cliente cliente;

    public Atendente(String nome, float salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getNome() {
        return nome;
    }

    public String getSalario() {
        return Float.toString(salario);
    }

    public String getNomeCliente() {
        return cliente.getNome();
    }

    public String aceitar(Visitor visitor){
        return visitor.exibirAtendente(this);
    }

}
