
public class TestaValores {
	public static void main(String[] args) {
		int total = 0;
		Conta conta = new Conta(1337, 24226);
		total++;
		
		Conta conta2 = new Conta(2548, 96850);
		Conta conta3 = new Conta(8789, 58952);
		
		System.out.println(Conta.getTotal());
		
	}
}
