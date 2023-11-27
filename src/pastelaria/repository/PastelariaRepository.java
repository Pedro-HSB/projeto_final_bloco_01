package pastelaria.repository;

import java.util.Date;

public interface PastelariaRepository {
	
	public void cardapio();
	public void pedidos();
	public void clientes();
	public void cadastar(String nome, String endereco,Date dataCriacao, int cpf);
	public void cadastar(String nome, String endereco, String contato,Date dataCriacao,int cnpj);
	public void fazerPedido(String servico, String destinatário,String emissor, float valor, int id);
	public void criarReceita(String descricao,String nome);
	
	

}
