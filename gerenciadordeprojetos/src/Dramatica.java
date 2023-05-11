
import java.util.ArrayList;

public class Dramatica extends Serie {
	private String genero;
	
	ArrayList<Temporada> temporadas = new ArrayList<Temporada>();
	
	public Dramatica () {
		
	}
	public Dramatica (String titulo,String sinopse,int anoLancamento, String genero,Avaliacao avaliacao ){
		super (titulo,sinopse, anoLancamento,avaliacao );
		this.genero = genero;
		
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
		
	}
	public ArrayList<Temporada> getTemporadas() {
		return temporadas;
	}
	public void setTemporadas(ArrayList<Temporada> temporadas) {
		this.temporadas = temporadas;
	}
	public void printInformacoes(){
		System.out.println("\n serie Dramatica ");
	    System.out.println("--------------------------------------");
	    System.out.println("Titulo:" + this.getTitulo());
	    System.out.println("Sinopse:" + this.getSinopse());
	    System.out.println(this.getGenero() + " - " + this.getTemporadas().size());
	    System.out.print(this.getAnoLancamento() + " - Nota: ");
	    for (int i = 0; i < this.getAvaliacao().getNota(); i++) {
	    	 System.out.print("*");
	    }
	    System.out.println("\n Critica: \n" + this.getAvaliacao().getCritica());
	    System.out.println("----------------------------------------");
	}
	
	
  
}
