package Junit;
import agenda.Agenda;
import pessoa.Pessoa;
import teste.TesteMain;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(value = Parameterized.class)
public class ParameterizedTest {

	public String nome;
    public int idade;
    public float altura;
    Agenda ag = new Agenda(10);
    

        public ParameterizedTest(String name, int age,float heights) {
        this.nome = name;
        this.idade = age;
        this.altura = heights;
    }
    
    
    @Parameters(name = "{index}: armazenaPessoa({0},{1},{2}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"Amanda",28,1.77f},
                {"David",36,1.71f}
        });
    }
    
    @Test
    public void Teste() {
    	ag.armazenaPessoa(nome,idade,altura);
    	ag.armazenaPessoa(nome, idade, altura);
    	assertThat(ag.getPosicao(),is(2));
    }
}
