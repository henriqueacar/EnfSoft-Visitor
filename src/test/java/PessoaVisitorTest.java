import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaVisitorTest {
    Atendente atendente;
    Gerente gerente;
    Supervisor supervisor;

    @Test
    void DeveExibirAtendente(){
        atendente = new Atendente("Joao", 1200f);
        atendente.setCliente(new Cliente("Maria"));
        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Atendente{nome=Joao, salario=1200.0, nomeCliente=Maria}", visitor.aceitar(atendente));
    }

    @Test
    void deveExibirSupervisor(){
        atendente = new Atendente("Joao", 1200f);
        supervisor = new Supervisor("Carla", 2500f, atendente);
        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Supervisor{nome=Carla, salario=2500.0, nomeAtendenteSupervisionado=Joao}", visitor.aceitar(supervisor));
    }

    @Test
    void deveExibirGerente(){
        gerente = new Gerente("Andre", 4000f, new Setor("Financeiro"));
        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Gerente{nome=Andre, salario=4000.0, nomeSetorGerenciado=Financeiro}", visitor.aceitar(gerente));
    }

}