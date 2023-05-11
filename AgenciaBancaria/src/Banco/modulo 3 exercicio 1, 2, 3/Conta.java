package Banco;

public class Conta {
	//Atributos
	       protected int numero;
	       protected double saldo;
	       private correntista cor;
	       //construtor padr�o
	       public Conta(){    
	       }
	       //metodos
	       public int getNumero() {
	             return numero;
	       }
	       public void setNumero(int numero) {
	             this.numero = numero;
	       }
	       public double getSaldo() {
	             return saldo;
	       }
	       
	       
		//m�todo retirar
	       public void retirar(double valor) {
	    	   if (saldo >= valor) {
	    		   saldo = saldo - valor;
	    	   } else System.out.println("valor indisponivel!");
	       }
	       public void depositar(double valor){
	             saldo = saldo + valor;
	       }
	       public void transferir(double valor, Conta destino){
	             if(saldo>=valor){
	                    saldo = saldo - valor;
	                    destino.depositar(valor);
	             }else System.out.printf("Valor indispon�vel!\n");
	       }
		public correntista getCor() {
			return cor;
		}
		public void setCor(correntista cor) {
			this.cor = cor;
		}
	       
	       
	}

