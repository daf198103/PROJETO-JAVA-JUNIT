package teste;

import agenda.Agenda;
import pessoa.Pessoa;

public class TesteMain {

	public static void main(String[] args) {
		Agenda agenda = new Agenda(1000);
		agenda.armazenaPessoa("David França", 36, 1.71f);
		agenda.armazenaPessoa("Jacks Faria", 30, 1.71f);
		agenda.armazenaPessoa("Paulo França", 33, 1.85f);
		agenda.armazenaPessoa("Tadeu Almeida", 55, 1.59f);
		agenda.armazenaPessoa("Lucio Souza", 18, 1.93f);
		agenda.armazenaPessoa("Ariana Macchiato", 25, 1.71f);
		agenda.armazenaPessoa("Livia Rondini", 19, 1.65f);
		agenda.armazenaPessoa("Paula Américo", 33, 1.75f);
		agenda.armazenaPessoa("Andréia Faria", 36, 1.65f);
		agenda.armazenaPessoa("Janaina Amadeus",26, 1.91f);
		agenda.imprimeAgenda();

	}

}
