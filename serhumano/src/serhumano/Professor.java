package serhumano;

public class Professor extends Adulto {
	String especializacao;
	String disciplina;
	public Professor() {
		super();
	}
	public String getEspecializacao() {
		return especializacao;
	}
	public void setEspecializacao(String especializacao) {
		this.especializacao = especializacao;
	}
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	public void planejar() {
		System.out.println("o Professor está planejando");
	}
	public void lecionar() {
		System.out.println("o Professor está lecionando");
	}
	public void coordenar() {
		System.out.println("o Professor está coordenando");
	}
	
}
	
