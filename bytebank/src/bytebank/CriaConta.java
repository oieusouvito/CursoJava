package bytebank;

public class CriaConta {

	public static void main(String[] args) {
		Conta primeriaConta = new Conta();
		primeriaConta.saldo = 200;
		System.out.println(primeriaConta.saldo);
		
		primeriaConta.saldo += 100;
		System.out.println(primeriaConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		
		System.out.println("primeira conta tem: " + primeriaConta.saldo);
		System.out.println("Segunda conta tem: " + segundaConta.saldo);
	}
}

