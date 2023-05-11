
public class Conta {
	
   private int numero; //Atributos - O que a coisa pode 
   private double saldo;
   private int senha;
   
   public Conta(){ //construtor       
   }
   
   public Conta(int numero, double saldo) { //Outro tipo de contrutor
	   this.numero = numero;
	   this.saldo = saldo;
   }

	public int getNumero() { // Gerado com botão direito 
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
       
       
}


