
public class Serie {
	private String titulo;
	private String sinopse;
	private int anoLancamento;
	private Avaliacao avaliacao;
	
	public Serie(){ 
		
	}
	
	public Serie(String titulo,String sinopse,int anoLancamento) { 
		this.titulo = titulo;
		this.sinopse = sinopse;
		this.anoLancamento = anoLancamento;
		
	}
	public Serie(String titulo,String sinopse,int anoLancamento, Avaliacao avaliacao ) { 
		this.titulo = titulo;
		this.sinopse = sinopse;
		this.anoLancamento = anoLancamento;
		this.avaliacao = avaliacao; 
		
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getSinopse() {
		return sinopse;
	}

	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}

	public int getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	public Avaliacao getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(Avaliacao avaliacao) {
		this.avaliacao = avaliacao;
	}
	
	public void printInformacoes() {
	    System.out.println("--------------------------------------");
	    System.out.println("Titulo: " + this.titulo);
	    System.out.println("Sinopse:" + this.sinopse);
	    System.out.print(this.anoLancamento + " - Nota: ");
	    for (int i = 0; i < this.avaliacao.getNota(); i++) {
	    	 System.out.print("*");
	    }
	    System.out.println("\n Critica: \n" + this.avaliacao.getCritica());
	    System.out.println("----------------------------------------");
	}
	

	
}
