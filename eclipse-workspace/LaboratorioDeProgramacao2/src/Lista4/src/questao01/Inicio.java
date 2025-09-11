package questao01;

public class Inicio {

	public static void main(String[] args) {
		ContaEncapsulada contaCorrente = new ContaEncapsulada();
		ContaEncapsulada contaPoupanca = new ContaEncapsulada();
		
		System.out.println("--- Conta corrente ---");
		contaCorrente.criarConta();
		contaCorrente.depositar();
		contaCorrente.sacar();
		contaCorrente.exibirDados();

		System.out.println("--- Conta Poupança ---");
		contaPoupanca.criarConta();
		contaPoupanca.depositar();
		contaPoupanca.sacar();
		contaPoupanca.exibirDados();
		
		
	}

}
