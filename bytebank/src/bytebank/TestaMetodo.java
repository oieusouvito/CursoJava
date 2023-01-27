package bytebank;

public class TestaMetodo {
	
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.saldo = 100;
		conta.deposita(500);
		
		System.out.println(conta.saldo);
		
		boolean conseguiuRetirar = conta.saca(50);
		System.out.println(conta.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta conta2 = new Conta();
		conta2.saldo = 1000;
		
		conta2.transfere(300, conta);
		
		System.out.println(conta2.saldo);
		System.out.println(conta.saldo);
	}
}
