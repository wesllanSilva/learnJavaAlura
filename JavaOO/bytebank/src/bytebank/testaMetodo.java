package bytebank;

public class testaMetodo {
	public static void main(String[] args) {
		Conta contaDoPedro = new Conta();
		
		contaDoPedro.saldo = 10;
		contaDoPedro.deposita(100);
		
		System.out.println("Saldo da conta do Pedro é: R$" + contaDoPedro.saldo);
		contaDoPedro.saca(50);
		System.out.println("agora saldo da conta do Pedro é: R$" + contaDoPedro.saldo);
		
		Conta contaDoCarlos = new Conta();
		contaDoPedro.transfere(25, contaDoCarlos);
		System.out.println("Saldo da conta do Carlos é: R$" + contaDoCarlos.saldo);

	}
}
