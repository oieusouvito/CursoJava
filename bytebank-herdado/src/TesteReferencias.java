
public class TesteReferencias {
	
	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setNome("Rafa");
		String nome = g1.getNome();
		g1.setSalario(5000.0);
		
		
		System.out.println(nome);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		
		System.out.println(controle.getSoma());
	}
	
}
