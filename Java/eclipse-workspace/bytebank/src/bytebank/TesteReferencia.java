package bytebank;

public class TesteReferencia {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;

		System.out.println("saldo primeira conta " + primeiraConta.saldo);
		
		
		Conta segundaConta = primeiraConta;
		
		System.out.println("saldo segunda conta " + segundaConta.saldo);
		
		segundaConta.saldo += 100;
		
		System.out.println("saldo segunda conta " + segundaConta.saldo);
		
		System.out.println("saldo primeira conta " + primeiraConta.saldo);
	}
}
