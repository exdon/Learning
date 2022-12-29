
public class TestaConversao {

	public static void main(String[] args) {
		double salario = 1270.50;
		int valor = (int) salario; //casting transforma um double em int
		System.out.println(valor);
		
		int ate32Bits = 20000000;
		long numeroGrande = 3242325265622l;
		short numeroPequeno = 2131;
		byte soAte127 = 127;

	}

}
