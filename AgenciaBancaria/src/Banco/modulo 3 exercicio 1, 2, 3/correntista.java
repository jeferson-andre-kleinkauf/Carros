package Banco;

public class correntista {
	String nome;
	String endereco;
	private Conta C;
	
	public  correntista() {
		
	}
	public correntista (String nome, String endereco) {
		this.nome = nome;
		this.endereco = endereco;
	}
	public correntista (String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public Conta getC() {
		return C;
	}
	public void setC(Conta c) {
		C = c;
	}
	
}
