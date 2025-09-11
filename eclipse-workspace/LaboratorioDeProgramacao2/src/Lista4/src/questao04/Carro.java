package questao04;

public class Carro {
	private String marca;
	private String modelo;
	private int anoDeFabricacao;
	private String tipoDeCombustivel;
	private Pessoa dono;

	Carro(String marca, String modelo, int anoDeFabricacao, String tipoDeCombustivel, Pessoa dono){
		this.marca = marca;
		this.modelo = modelo;
		this.anoDeFabricacao = anoDeFabricacao;
		this.tipoDeCombustivel = tipoDeCombustivel;
		this.dono = dono;
	}
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAnoDeFabricacao() {
		return anoDeFabricacao;
	}

	public void setAnoDeFabricacao(int anoDeFabricacao) {
		this.anoDeFabricacao = anoDeFabricacao;
	}

	public String getTipoDeCombustivel() {
		return tipoDeCombustivel;
	}

	public void setTipoDeCombustivel(String tipoDeCombustivel) {
		this.tipoDeCombustivel = tipoDeCombustivel;
	}
	
	public void ligar() {
		System.out.println("Carro ligando...");
	}
	
	public void frear() {
		System.out.println("Carro freando...");
	}
	
	public void desligar() {
		System.out.println("Carro desligando...");
	}
	
	@Override
	public String toString(){
		return "Carro [Marca=" + marca + ", modelo=" + modelo + ", ano de fabricação=" + anoDeFabricacao + ", tipo de combustível=" + tipoDeCombustivel + ", dono=" + dono + "]";
	}
	
	
}
