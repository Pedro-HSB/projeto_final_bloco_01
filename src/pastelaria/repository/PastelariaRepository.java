package pastelaria.repository;

import java.util.Date;

import pastelaria.model.User;

public interface PastelariaRepository {
	
	public void cardapio();
	public void pedidos();
	public void clientes();
	public void cadastar(User user);
	public void atualizar(User user);
	public void deletar(int numero);
	public void fazerPedido(String servico, String destinatário,String emissor, float valor, int id);
	public void criarReceita(String descricao,String nome);
	
	

}
