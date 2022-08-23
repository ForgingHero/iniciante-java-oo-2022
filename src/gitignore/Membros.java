package gitignore;

import java.time.LocalDate;

public class Membros {

	private String nome, email, endereco, sexo, telefone;
	private LocalDate dataNascimento;

	protected Membros() {

	}

	public Membros(String nome, String email, String endereco, String sexo, String telefone, LocalDate dataNascimento) {
		this.nome = nome;
		this.email = email;
		this.endereco = endereco;
		this.sexo = sexo;
		this.telefone = telefone;
		this.dataNascimento = dataNascimento;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

}
