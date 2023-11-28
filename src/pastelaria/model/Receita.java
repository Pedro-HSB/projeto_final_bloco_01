package pastelaria.model;

public abstract class Receita {
	
	private String nome;
	private String modoPreparo;
	private String tempoPreparo;
	private int id;
	private float preco;
	
	
	public Receita(String nome, String modoPreparo, String tempoPreparo, int id, float preco) {
		super();
		this.nome = nome;
		this.modoPreparo = modoPreparo;
		this.tempoPreparo = tempoPreparo;
		this.id = id;
		this.preco = preco;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	
	public void visualizar() {
		System.out.println("\n\n***************************************");
		System.out.println("             dados da receita              ");
		System.out.println("*******************************************");
		System.out.println("     o nome da receita e: " + this.getNome()+"                  ");
		System.out.println("     modo de preparo: " + this.getModoPreparo()+"                  ");
		System.out.println("     tempo de preparo: " + this.getTempoPreparo()+"                  ");
		System.out.println("     id do pedido: " + this.getId()+"                  ");
		System.out.println("     o preco e: " + this.getPreco()+"                  ");
		
	}
	public float preco() {
		return getPreco();
		
	}
	public void pedido() {
		System.out.println("\n\n***************************************");
		System.out.println("             dados da receita              ");
		System.out.println("*******************************************");
		System.out.println("   numero para pedido: " + this.getId()+"                  ");
		System.out.println("   pastel de: " + this.getNome()+"                  ");
		System.out.println("   o preco e: " + this.getPreco()+"                  ");

		
	}
}
