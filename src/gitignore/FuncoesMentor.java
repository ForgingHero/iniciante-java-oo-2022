package gitignore;

import java.time.LocalDateTime;

public interface FuncoesMentor {

	public void tirarDuvidaParticular(Aprendizes nome, String mensagemAjuda);

	public void tirarDuvidaGrupo(String mensagemAjuda);

	public void criarDesafio(String desafio);

	public void postarDesafioGithub();

	public void apresentarSolucaoDesafio (LocalDateTime dataSolucao);
}
