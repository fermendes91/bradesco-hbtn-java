import java.util.ArrayList;

import atividades.*;

public class Workflow {
	
	private ArrayList<Atividade> atividades = new ArrayList<>();
	
	public void registrarAtividade(Atividade atividade) {
		this.atividades.add(atividade);
	}

	public ArrayList<Atividade> getAtividades() {
		return atividades;
	}

}
