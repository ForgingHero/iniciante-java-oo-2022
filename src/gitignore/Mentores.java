package gitignore;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Mentores extends Funcionarios implements Mensagem, FuncoesMentor {

	public Mentores () {
		
	}
	
	public Mentores(String nome, String email, String endereco, String sexo, String telefone,
			LocalDate dataNascimento) {
		this.setNome(nome);
		this.setEmail(email);
		this.setEndereco(endereco);
		this.setSexo(sexo);
		this.setTelefone(telefone);
		this.setDataNascimento(dataNascimento);
	}
	
	@Override
	public String mensagem() {
		return "ENVIADO.";
	}

	public void tirarDuvidaParticular(Aprendizes nome, String mensagemAjuda) {
		System.out.println(mensagem());
	}

	public void tirarDuvidaGrupo(String mensagemAjuda) {
		System.out.println(mensagem());
	}

	public void criarDesafio(String desafio) {
		System.out.println("Desafio criado");
	}

	public void postarDesafioGithub() {
		System.out.println(mensagem());
	}

	public void apresentarSolucaoDesafio (LocalDateTime dataSolucao) {
		criarEvento(dataSolucao);
		System.out.println("Marcado!");
		}
}
