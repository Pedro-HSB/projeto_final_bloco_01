package pastelaria.model;

import java.util.Date;

public class Cliente extends User{

	private String nome;
	private Date dataCriacao;
	
	
	public Cliente(String nome, String endereco,Date dataCriacao, int cpf) {
		super(endereco, cpf);
		this.nome=nome;
		this.dataCriacao=dataCriacao;
		// TODO Auto-generated constructor stub
	}
	public Cliente(String nome, String endereco, String contato,Date dataCriacao,int cnpj) {
		super(endereco, contato,cnpj);
		this.nome=nome;
		this.dataCriacao=dataCriacao;
		// TODO Auto-generated constructor stub
	}
	public void visualizar() {
		super.visualizar();
		System.out.println("nome do cliente: " + this.getNome());
		System.out.println("data de cadastro: " + this.getDataCriacao());
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataCriacao() {
		return dataCriacao;
	}
	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
}
