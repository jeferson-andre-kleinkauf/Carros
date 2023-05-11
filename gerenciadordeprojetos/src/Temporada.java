
public class Temporada {
	private int numero;
	private int episodios;
	private Dramatica dramatica;
	
	public Temporada() {
	
	}
	public Temporada(int numero,int episodios,Dramatica dramatica){
			this.numero = numero;
			this.episodios = episodios;
			this.dramatica = dramatica;
			}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getEpisodios() {
		return episodios;
	}
	public void setEpisodios(int episodios) {
		this.episodios = episodios;
	}
	public Dramatica getDramatica() {
		return dramatica;
	}
	public void setDramatica(Dramatica dramatica) {
		this.dramatica = dramatica;
	}
	
}
