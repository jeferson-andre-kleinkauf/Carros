
public class Avaliacao {
   private int nota;
   private String critica;
   private Serie serie;
   
   public Avaliacao() {
	   
   } 
   
   public Avaliacao(int nota, String critica) {
	   this.nota = nota; 
	   this.critica = critica;
	   
   }
   
   public Avaliacao(int nota, String critica, Serie serie) {
	   this.nota = nota; 
	   this.critica = critica;
	   this.serie = serie;
	   
   }

	public int getNota() {
		return nota;
	}
	
	public void setNota(int nota) {
		this.nota = nota;
	}
	
	public String getCritica() {
		return critica;
	}
	
	public void setCritica(String critica) {
		this.critica = critica;
	}
	  
   
}

