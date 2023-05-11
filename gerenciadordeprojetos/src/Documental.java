
public class Documental extends Serie {
	private String tema;
		
	public Documental(){
		
	}

	public Documental(String titulo,String sinopse, int anoLancamento,String tema,Avaliacao avaliacao) {
		super(titulo,sinopse,anoLancamento,avaliacao);
		this.tema = tema;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}
	public void printInformacoes() {
		System.out.println("Serie Documental ");
	    System.out.println("--------------------------------------");
	    System.out.println("Titulo:" + this.getTitulo());
	    System.out.println("Sinopse:" + this.getSinopse());
	    System.out.println(this.getTema() + " - " + this.getAnoLancamento());
	    System.out.println("Critica");
	    System.out.println(this.getAvaliacao().getCritica());
	    for (int i = 0; i < this.getAvaliacao().getNota(); i++) {
	    	 System.out.print("*");
	    }
	    System.out.println("\n----------------------------------------");
	}

	private int critica() {
		// TODO Auto-generated method stub
		return 0;
	}
}
