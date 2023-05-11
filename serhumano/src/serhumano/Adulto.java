package serhumano;

public class Adulto extends Pessoa {
	private String cpf;
	private int rg;
	public Adulto() {
		super();
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getRg() {
		return rg;
	}
	public void setRg(int rg) {
		this.rg = rg;
	}
	public void dirigir() {
		System.out.println("o Adulto está dirigindo");
	}
	public void beber() {
		System.out.println("o Adulto está bebendo");
	}
	public void pagar() {
		System.out.println("o Adulto está pagando");
	}
	
	
}
