package MovimentoCodar;

import java.time.LocalDate;

public class Aprendizes extends Membros implements Mensagem {

	public Aprendizes(String nome, String email, String endereco, String sexo, String telefone,
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
		return "Enviado com sucesso.";
	}

	public void fazerAulasAlura() {
		System.out.println("Aulas concluidas.");
	}

	public void compartilharResultadosGrupo(String resultados) {
		System.out.println(mensagem());
	}

	public void participarEventos() {
		System.out.println("Entrada concluida");
	}

	public void tirarDuvidaMentor(Mentores nome, String duvida) {
		System.out.println(mensagem());
	}

	public void tirarDuvidaOrganizador(Organizadores nome, String duvida) {
		System.out.println(mensagem());
	}

}
