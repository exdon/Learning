
public class TestaContaComExcecaoChecked {

	public static void main(String[] args) {
		Conta c = new Conta();
		try {
			c.deposita();
		} catch(Exception ex) { //catch generico
			System.out.println("tratamento.....");
		}
		

	}

}
