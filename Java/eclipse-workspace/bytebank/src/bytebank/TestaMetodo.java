package bytebank;

public class TestaMetodo {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.saldo = 100;
		
		conta.deposita(50);
		
		System.out.println(conta.saldo);
		
		boolean conseguiuRetirar = conta.saca(20);
		
		System.out.println(conta.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaMarcela = new Conta();
		contaMarcela.deposita(1000);
		
		boolean sucessoTransferencia = contaMarcela.transfere(300, conta);
		
		if(sucessoTransferencia) {
			System.out.println("transferencia feita com sucesso");
		} else {
			System.out.println("faltou dinheiro");
		}
		
		System.out.println(contaMarcela.saldo);
		System.out.println(conta.saldo);

	}

}
