
public class Gerente extends Funcionario implements Autenticavel {
	
	private int senha;
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
	

	public double getBonificacao() {
		 System.out.println("Chamando o método de bonificação do Gerente.");
		 return super.getSalario();
	}
	
	public int getSenha() {
		return senha;
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
}
