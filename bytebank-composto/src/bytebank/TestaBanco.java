package bytebank;

public class TestaBanco {
	
	public static void main(String[] args) {
		Cliente victor = new Cliente();
		victor.nome = "Victor Araujo";
		victor.cpf = "052.616.341-05";
		victor.profissao = "Desenvolvedor";
		
		Conta contaVictor = new Conta();
		contaVictor.deposita(100);
		
		contaVictor.titular = victor;
		System.out.println(contaVictor.titular.nome);
	}
}
