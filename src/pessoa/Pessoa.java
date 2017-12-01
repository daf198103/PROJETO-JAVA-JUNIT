package pessoa;

public class Pessoa {
	private String nome;
	private int idade;
	private float altura;
	
	public Pessoa(String name, int age, float height){
		this.nome = name;
		this.idade = age;
		this.altura = height;
	}
		
	public String getNome() {
		return nome;
	}
	public int getIdade() {
		return idade;
	}
	public float getAltura() {
		return altura;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	public void imprime(){
		System.out.println("Nome: " + this.getNome() + "\n"+"Idade: "+this.getIdade()+ "\n" + "Altura: " + this.getAltura() + "cm2");
	}

}
