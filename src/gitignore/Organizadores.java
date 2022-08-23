package gitignore;

import java.time.LocalDate;

public class Organizadores extends Funcionarios implements Mensagem, FuncoesOrganizador {

	public Organizadores() {
		
	}
	
	public Organizadores(String nome, String email, String endereco, String sexo, String telefone,
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
		// TODO Auto-generated method stub
		return "Enviado com sucesso!";
	}
	
	
	public void informarProcessosRegras(Membros email, String texto) {
		System.out.println(mensagem());
		if (texto == null) {
			System.out.println("Falha ao enviar.");
		}
	}
	
	
	
	public void enviarPlanoEstudos (String localArquivo) {
		System.out.println(mensagem());
	}
}
