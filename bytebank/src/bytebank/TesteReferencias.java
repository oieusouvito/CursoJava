package bytebank;

public class TesteReferencias {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.saldo = 300;
		
		System.out.println("Saldo da conta: " + conta.saldo);
		
		Conta conta2 = conta;
		
		System.out.println("saldo da segunda conta " + conta2.saldo);
		
		conta2.saldo += 100;
		System.out.println("saldo da segunda conta: " + conta2.saldo);
		
		System.out.println("saldo da primeira conta: " + conta.saldo);
		
		conta2.agencia = 42;
		System.out.println("agora a segunda conta está na agencia 42.");
		
		if(conta == conta2) {
			System.out.println("mesma conta");
		} else {
			System.out.println("contas diferentes");
		}
	}
}
