package pastelaria.model;

public abstract class Receita {
	
	private String nome;
	private String modoPreparo;
	private String tempoPreparo;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getModoPreparo() {
		return modoPreparo;
	}
	public void setModoPreparo(String modoPreparo) {
		this.modoPreparo = modoPreparo;
	}
	public String getTempoPreparo() {
		return tempoPreparo;
	}
	public void setTempoPreparo(String tempoPreparo) {
		this.tempoPreparo = tempoPreparo;
	}
	public Receita(String nome, String modoPreparo, String timeStamp) {
		super();
		this.nome = nome;
		this.modoPreparo = modoPreparo;
		this.tempoPreparo = timeStamp;
	}
	
	public void visualizar() {
		System.out.println("\n\n***************************************");
		System.out.println("dados da receita");
		System.out.println("***************************************");
		System.out.println("o nome da receita e: " + this.getNome());
		System.out.println("modo de preparo: " + this.getModoPreparo());
		System.out.println("tempo de preparo: " + this.getTempoPreparo());
		
	}

}
