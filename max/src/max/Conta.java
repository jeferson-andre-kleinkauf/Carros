package max;

public class Conta {
	
	private int numero;
	private double saldo;
	
	public Conta() {
		
	}

	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void depositar(double valor) {
		saldo = saldo + valor;
	}
	public void transferir(double valor, Conta destino) {
		if (saldo >= valor) {
			saldo = saldo - valor;
			destino.depositar(valor);
		} else System.out.println("valor indisponível");	
		}
}

