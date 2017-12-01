package agenda;

import pessoa.Pessoa;

/*void armazenaPessoa(String nome, int idade, float altura); 
	•  void removePessoa(String nome); 
	•  int buscaPessoa(String nome); // informa em que posição da agenda está a pessoa 
	•  void imprimeAgenda(); // imprime os dados de todas as pessoas da agenda 
	•  void  imprimePessoa(int  index);  //  imprime  os  dados  da  pessoa  que  está  na 
	posição “i” da agenda. 
	Observação: O construtor da classe deve definir a quantidade de elementos
	 * */
	public class Agenda {
		
		Pessoa[] pessoa;
		int posicao;
		
		public Agenda(int qtd){
			pessoa = new Pessoa[qtd];
			posicao = 0;
		}
		
		
		public void armazenaPessoa(String nome, int idade, float altura){
			Pessoa nova = new Pessoa(nome,idade,altura);
			pessoa[posicao] = nova;
			posicao++;
			
		}
		
		public void removePessoa(String nome) {
			int pos;
			
			pos = buscaPessoa(nome);
			
			if(pos == -1) {
				System.out.println("Não foi localizado!");
			}else {
				
				for (int i=pos; i<pessoa.length - 1;i++) {
					pessoa[i] = pessoa[i+1];
				}
				posicao--;
				
			}		
		}
		
		public int buscaPessoa(String nome) {      
			
			for (int i=0; i<posicao;i++) {
				if(pessoa[i].getNome().equals(nome)){
					return i;	
				}
			}
			
			return -1;
			
		}
		
		public void imprimeAgenda() {
			System.out.println("\nAgenda \n");
			for (int i=0;i<posicao;i++) {
				pessoa[i].imprime();
				System.out.println("\n");
			}
		}
		
		public void imprimePessoa(int index) {
			pessoa[index].imprime();
		}
		
		public int getPosicao(){
			return this.posicao;
		}
		
		
		
		
}
