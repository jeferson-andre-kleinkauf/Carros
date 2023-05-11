package Banco;
import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		
		String nome, endereco;
		int numero;
		
		System.out.println("informe seu nome");
		nome = read.nextLine();
		System.out.println("informe seu endereco");
		endereco = read.nextLine();
		System.out.println("informe o numero da conta");
		numero = read.nextInt();
		
		Conta c1 = new Conta();
		c1.setNumero(numero);
		correntista cor1 = new correntista (nome, endereco);
		c1.setCor(cor1);
		cor1.setC(c1);
		System.out.println(c1.getCor() + " na conta: " +c1.getNumero() + " tem " + c1.getSaldo() + " reais. ");
		System.out.println(cor1.getNome() + " na conta: " + cor1.getC().getNumero() + " tem " + cor1.getC().getSaldo() + "reais. ");
		
	}

}
