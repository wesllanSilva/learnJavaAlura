package bytebank;

public class testaMetodo {
	public static void main(String[] args) {
		Conta contaDoPedro = new Conta();
		
		contaDoPedro.saldo = 10;
		contaDoPedro.deposita(100);
		
		System.out.println(contaDoPedro.saldo);
		contaDoPedro.saca(50);
		System.out.println(contaDoPedro.saldo);

	}
}
