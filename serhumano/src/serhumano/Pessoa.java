package serhumano;

public class Pessoa {

	 private String nome;
	 private int idade;
	
	public Pessoa() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	public void dormir() {
		System.out.println("a pessoa está dormindo");
	}
	public void andar() {
		System.out.println("pessoa está andando");
	}
	public void falar() {
		System.out.println("pessoa está falando");
	}
}
