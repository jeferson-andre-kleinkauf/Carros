package hamburgueria;
import java.util.ArrayList;
public class Cardapio {
	ArrayList<Hamburguer> hamburgueres = new ArrayList<Hamburguer>();
	
	public Cardapio() {
		
	}

	public ArrayList<Hamburguer> getHamburgueres() {
		return hamburgueres;
	}

	public void setHamburgueres(ArrayList<Hamburguer> hamburgueres) {
		this.hamburgueres = hamburgueres;
	}
	
	public void printcardapio() {
		System.out.println("");
	
		System.out.print("\n cardapio");
		System.out.print("\n --------------------------");
		int x = hamburgueres.size();
		Hamburguer c;
		
		for (int contador = 0; contador < x; contador ++) {
			c = hamburgueres.get(contador);
			System.out.println("\n Hamburguer: " + c.getNome());
			System.out.println("Preço: " + c.getPreco());
		}
		System.out.printf("\n --------------------------");
	}
}
