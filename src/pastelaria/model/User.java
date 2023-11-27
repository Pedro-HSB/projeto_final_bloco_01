package pastelaria.model;

public abstract class User {
	
	

	private String endereco;
	private String contato;
	private int cpf;
	private int cnpj;
	
	public User(String endereco,int cpf) {
		super();
		this.endereco = endereco;
		this.cpf = cpf;
	}
	
	public User(String endereco,String contato,int cnpj) {
		super();
		this.endereco = endereco;
		this.contato = contato;
		this.cnpj = cnpj;
	}
	
	public String getContato() {
		return contato;
	}
	
	public void setContato(String contato) {
		this.contato = contato;
	}
	
	public int getCpf() {
		return cpf;
	}
	
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	public int getCnpj() {
		return cnpj;
	}
	
	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public void visualizar() {
		System.out.println("\n\n***************************************");
		System.out.println("dados da nota fiscal");
		System.out.println("***************************************");
		System.out.println("Número do cnpj: " + this.cnpj);
		System.out.println("numero e/ou email de contato: " + this.contato);
		System.out.println("Número do cpf: " + cpf);
		System.out.println("endereco: " + this.endereco);
	}
}
