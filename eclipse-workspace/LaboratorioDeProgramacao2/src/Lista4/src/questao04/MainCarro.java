package questao04;

public class MainCarro {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		p1.nomeDaPessoa();
		
		Carro c1 = new Carro("Volkswagen", "Gol", 2022, "Flex", p1);
		p1.setCarro(c1);
		
		System.out.println(c1);
		p1.ligarCarro();
		p1.frearCarro();
		p1.desligarCarro();
		
	}

}
