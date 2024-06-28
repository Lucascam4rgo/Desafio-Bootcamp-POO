package bootcamp;

import java.time.LocalDate;

public class Mentoria extends Conteudo{

	private LocalDate dataMentoria;
	
	public Mentoria() {
		
	}

	public LocalDate getDataMentoria() {
		return dataMentoria;
	}



	public void setDataMentoria(LocalDate dataMentoria) {
		this.dataMentoria = dataMentoria;
	}


	@Override
	public String toString() {
		return "Mentoria [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", dataMentoria=" + dataMentoria + "]";
	}

	@Override
	public double calcularXp() {
		return XP_PADRAO + 20d;
	}
	
}
