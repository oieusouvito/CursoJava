
public class ControleBonificacao {
	
	private double soma;
	
	//polimorfismo
	public void registra(Funcionario f) {  
		
		double boni = f.getBonificacao();
		this.soma += boni;
	}
	
	public double getSoma() {
		return soma;
	}
}
