package bytebank;

public class Cliente {
	
	private String nome;
	private String cpf;
	private String profissao;
	
	private String getNome() {
		return nome;
	}
	private void setNome(String nome) {
		this.nome = nome;
	}
	private String getCpf() {
		return cpf;
	}
	private void setCpf(String cpf) {
		this.cpf = cpf;
	}
	private String getProfissao() {
		return profissao;
	}
	private void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
}
