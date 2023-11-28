package pastelaria.model;

public class Pastel extends Receita{

	private String tamanho;

	public Pastel(String nome, String modoPreparo, String tempoPreparo, int id, String tamanho, float preco) {
		super(nome, modoPreparo, tempoPreparo, id,preco);
		this.tamanho = tamanho;
	}



	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	public void visualizar() {
		super.visualizar();
		System.out.println("     o tamanho e: " + this.getTamanho() +"                       ");
		
	}


}
