
public class App {

	public static void main(String[] args) {
		ContaBancaria cb1 = new ContaBancaria();
		Correntista ct = new Correntista("Adriana","Porto Alegre");
		cb1.setCc(ct);
		
		ContaBancaria cb2 = new ContaBancaria();
		Correntista ct2 = new Correntista("Amanda","Novo Hamburgo");
		cb2.setCc(ct2);
		
		cb1.depositar(1000.0);
		cb1.transferir(150.0, cb2);
		
		cb1.extrato();
		cb2.extrato();
		
	}

}
