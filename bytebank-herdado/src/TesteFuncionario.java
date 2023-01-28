
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario vito = new Funcionario();
		vito.setNome("Victor Araujo");
		vito.setCpf("123.456.789-10");
		vito.setSalario(1130.0);
		
		System.out.println(vito.getNome());
		System.out.println(vito.getCpf());
		System.out.println(vito.getSalario());
		System.out.println(vito.getBonificacao());
	}

}
