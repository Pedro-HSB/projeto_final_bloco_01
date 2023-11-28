package pastelaria.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Optional;

import pastelaria.model.NotaFiscal;
import pastelaria.model.Receita;
import pastelaria.model.User;


public class PastelariaController {
	
	int id = 0;
	
	private ArrayList<User> listaUser = new ArrayList<User>();
	private ArrayList<Receita> listaReceita = new ArrayList<Receita>();
	private ArrayList<NotaFiscal> listaNotaFiscal = new ArrayList<NotaFiscal>();
	
	
	//listar todos
	public void cardapio() {
		for (var cardapios : listaReceita) {
			cardapios.visualizar();
		}
	};
	
	public void cardapioPedido() {
		for (var cardapios : listaReceita) {
			cardapios.pedido();
		}
	};
	
	public void pedidos() {
		for (var pedido : listaNotaFiscal) {
			pedido.visualizar();
			System.out.println(pedido);
		}
		
	};
	
	public void clientes() {
		for (var cliente : listaUser) {
			cliente.visualizar();
		}
		
	};
	
	
	
	//cadastro
	public void cadastarUser(User user) {
		
		
		listaUser.add(user);
		System.out.println(" o cliente foi criada com sucesso");
		
	};
	public void cadastarReceita(Receita receita) {
		
		listaReceita.add(receita);
		System.out.println(" a receita foi criada com sucesso");
		
	};
	public void cadastarNotaFiscal(NotaFiscal notaFiscal) {
		
		
		listaNotaFiscal.add(notaFiscal);
		System.out.println(" a pedido foi feito com sucesso");
		
	};
	
	
	//update de todos
	public void atualizarUser(User user) {
		
		Optional<User> userNew = buscarUserNaCollection(user.getCpf());
		
		if (userNew.isPresent()) {
			listaUser.set(listaUser.indexOf(userNew.get()), user);
			System.out.println("O cliente foi atualizada com sucesso!");
		}
		else
			System.out.println("O cliente não foi encontrada!");
		
	};
	public void atualizarReceita(Receita receita) {
		
		Optional<Receita> receitaNew = buscarReceitaNaCollection(receita.getId());

		if (receitaNew.isPresent()) {
			listaReceita.set(listaReceita.indexOf(receitaNew.get()), receita);
			System.out.println("a receita foi atualizada com sucesso!");
		}
		else
			System.out.println("O receita não foi encontrada!");
		
	};
	public void atualizarNotaFiscal(NotaFiscal notaFiscal) {
		
		Optional<NotaFiscal> notaFiscalNew = buscarNotaFiscalNaCollection(notaFiscal.getId());
		
		
		if (notaFiscalNew.isPresent()) {
			listaNotaFiscal.set(listaNotaFiscal.indexOf(notaFiscalNew.get()), notaFiscal);
			System.out.println("o pedido foi atualizada com sucesso!");
		}
		else
			System.out.println("O pedido não foi encontrada!");
		
	};
	
	
	//excluir todos
	public void deletarUser(int numero) {
		
		Optional<User> user = buscarUserNaCollection(numero);
		
		if (listaUser.remove(user.get()) == true)
			System.out.println("O cliente foi excluída com sucesso!");
		else
			System.out.println("O cliente não foi encontrada!");

	};
	
	public void deletarReceita(int id) {
		
		Optional<Receita> receitaNew = buscarReceitaNaCollection(id);
		
		if (listaReceita.remove(receitaNew.get()) == true)
			System.out.println("receita foi excluída com sucesso!");
		else
			System.out.println("receitanão foi encontrada!");

	};
	
	public void deletarNotaFiscal(int id) {
		
		Optional<NotaFiscal> notaFiscalNew = buscarNotaFiscalNaCollection(id);
		
		if (listaNotaFiscal.remove(notaFiscalNew.get()) == true)
			System.out.println("pedido foi finalizado com sucesso!");
		else
			System.out.println("pedido não foi encontrada!");

	};
	
	
	public int gerarId() {
		return ++id;
	}

	public int gerarReceita() {
		return ++id;
	}
	
	public int gerarpedido() {
		return ++id;
	}
	
	public float preco(int id) {
		
		Optional<Receita> receitaNew = buscarReceitaNaCollection(id);

		if (receitaNew.isPresent()) {
			return receitaNew.get().preco();
		}
		else
			System.out.println(" não foi encontrada!");
		return id;
	};
	
	
	public Optional<User> buscarUserNaCollection(int numero) {

		for (var conta : listaUser) {
			if (conta.getCpf() == numero)
				return Optional.ofNullable(conta);
		}

		return Optional.empty();
	}
	
	public Optional<Receita> buscarReceitaNaCollection(int id) {

		for (var receita : listaReceita) {
			if (receita.getId() == id)
				return Optional.ofNullable(receita);
		}

		return Optional.empty();
	}

	
	public Optional<NotaFiscal> buscarNotaFiscalNaCollection(int id) {

		for (var notaFiscal : listaNotaFiscal) {
			if (notaFiscal.getId() == id)
				return Optional.ofNullable(notaFiscal);
		}

		return Optional.empty();
	}
}
