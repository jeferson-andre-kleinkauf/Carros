package casa;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fogao fogao1 = new Fogao();
		fogao1.setBocas(5);
		fogao1.setCor("vermelho");
		fogao1.setTamanho(1.4);
		System.out.println("o meu fogao tem: "+ fogao1.getBocas() + " bocas e sua cor: "+ fogao1.getCor() + " tamanho: "+ fogao1.getTamanho());
		
	}

}
