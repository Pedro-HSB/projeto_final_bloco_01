package pastelaria;

import java.io.IOException;
import java.util.Date;
import java.util.Optional;
import java.util.Scanner;

import pastelaria.controller.PastelariaController;
import pastelaria.model.Cliente;
import pastelaria.model.NotaFiscal;
import pastelaria.model.Pastel;
import pastelaria.model.Pedido;
import pastelaria.model.Receita;
import pastelaria.model.User;
import pastelaria.util.Cores;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		Date dataDeInscricao = new Date();
		
		PastelariaController user = new PastelariaController();
		PastelariaController receita = new PastelariaController();
		PastelariaController notaFiscal = new PastelariaController();
		
		int opcao,id,qtd = 0,pastel = 0,cpf,cnpj,teste;
		float valor = 0,preco;
		String nome, modoPreparo, tempoPreparo,tamanho,servico = null,destino,contato,endereco,tipo;

		while (true) {

			System.out.println(Cores.TEXT_CYAN_BRIGHT + Cores.ANSI_BLACK_BACKGROUND
					+ "\n\n****************************************");
			System.out.println("                                    	");
			System.out.println("         Pastelaria da pam   	    	");
			System.out.println("                                    	");
			System.out.println("****************************************");
			System.out.println("                                    	");
			System.out.println("         1 - cardapio                   ");
			System.out.println("         2 - todos os pedidos          	");
			System.out.println("         3 - todos os clientes         	");
			System.out.println("         4 - criar receita              ");
			System.out.println("         5 - fazer pedidos              ");
			System.out.println("         6 - cadastrar cliente          ");
			System.out.println("         7 - atualizar dados cliente    ");
			System.out.println("         8 - atualizar dados pedido     ");
			System.out.println("         9 - atualizar dados receita    ");
			System.out.println("         10 - excluir cliente           ");
			System.out.println("         11 - finalizar pedido          ");
			System.out.println("         12 - excluir receita           ");
			System.out.println("         0 - encerar programa       	");
			System.out.println("                                    	");
			System.out.println("****************************************");
			System.out.println("Entre com a opção desejada:         	");
			System.out.println("                                    	" + Cores.TEXT_RESET);

			opcao = leia.nextInt();

			if (opcao == 0) {
				System.out.print(Cores.TEXT_CYAN_BRIGHT + Cores.ANSI_BLACK_BACKGROUND + "\n"
						+ " 		Obrigado pela preferencia		");
				sobre();
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT + Cores.ANSI_BLACK_BACKGROUND);
				System.out.println("cardapio\n\n");
				receita.cardapio();
				keyPress();
				break;
			case 2:
				System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT + Cores.ANSI_BLACK_BACKGROUND);
				System.out.println("pedidos\n\n");
				notaFiscal.pedidos();
				keyPress();
				break;
			case 3:
				System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT + Cores.ANSI_BLACK_BACKGROUND);
				System.out.println("clientes\n\n");
				user.clientes();
				keyPress();
				break;
			case 4:
				System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT + Cores.ANSI_BLACK_BACKGROUND);
				System.out.println("criando receita\n");
				
				System.out.println("digite o nome da receita");
				leia.skip("\\R");
				nome=leia.nextLine();
				
				System.out.println("qual o modo de preparo");
				modoPreparo=leia.nextLine();
				
				System.out.println("qual o tempo de preparo");
				tempoPreparo=leia.nextLine();
				
				System.out.println("qual o tamanho do pastel");
				tamanho=leia.nextLine();
				
				System.out.println("qual o valor do pastel");
				preco=leia.nextFloat();
				
				receita.cadastarReceita(new Pastel(nome,modoPreparo,tempoPreparo,receita.gerarReceita(),tamanho,preco));				
				keyPress();
				break;
			case 5:
				System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT + Cores.ANSI_BLACK_BACKGROUND);
				System.out.println("faca seu pedido\n\n");
				
				System.out.println("	digite o servico:	");
				System.out.println("	1	-	pastel");
				System.out.println("	2	-	refrigerante");
				System.out.println("	3	-	caldo de cana");
				opcao=leia.nextInt();
				switch (opcao) {
				case 1: 
					servico="pastel";
					receita.cardapioPedido();
					
					System.out.println("digite o numero do pastel que voce deseja");
					pastel=leia.nextInt();
					
					System.out.println("quantos pasteis");
					qtd=leia.nextInt();
					
					break;
				case 2: 
					servico="refrigerante";
					valor=6.0f;
					break;
				case 3: 
					servico="caldo de cana";
					valor=5.0f;
					
					break;
				
				default:
					System.out.println("valor invalido");
				}
				
				System.out.println("qual o endereco de entrega");
				leia.skip("\\R");
				destino=leia.nextLine();
				
				notaFiscal.cadastarNotaFiscal((new Pedido(servico,destino,(receita.preco(pastel)*qtd),receita.gerarpedido(),receita.gerarpedido())));
				keyPress();
				break;
			case 6:
				System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT + Cores.ANSI_BLACK_BACKGROUND);
				System.out.println("faca seu pedido\n\n");
				
				System.out.println("socio ou cliente");
				System.out.println("	1	-	socio");
				System.out.println("	2	-	cliente");
				opcao=leia.nextInt();
				if(opcao == 2) {
					tipo = "socio";
					System.out.println("digite o nome do cliente");
					leia.skip("\\R");
					nome=leia.nextLine();
					
					System.out.println("qual o endereco");
					endereco=leia.nextLine();
					
					System.out.println("seu cpf");
					cpf=leia.nextInt();
					
					user.cadastarUser(new Cliente(nome,endereco,dataDeInscricao,cpf,user.gerarId()));
				}
				else {
					tipo = "cliente";
					System.out.println("digite o nome do cliente");
					leia.skip("\\R");
					nome=leia.nextLine();
					
					System.out.println("qual o endereco");
					endereco=leia.nextLine();
					
					System.out.println("qual o numero e/ou email de contato");
					contato=leia.nextLine();
					
					System.out.println("seu cnpj");
					cnpj=leia.nextInt();
					user.cadastarUser(new Cliente(nome,endereco,contato,dataDeInscricao,cnpj,user.gerarId()));
				}
				keyPress();
				break;
			case 7:
				System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT + Cores.ANSI_BLACK_BACKGROUND);
				System.out.println("atualizando dados do cliente...\n\n");
				
				System.out.println("Digite o cpf ou cnpj do cliente: ");
				id = leia.nextInt();
				
				Optional<User>  userup = user.buscarUserNaCollection(id);
				
				if(userup.isPresent()) {
					
					System.out.println("digite o nome do cliente");
					leia.skip("\\R");
					nome=leia.nextLine();
					
					System.out.println("qual o endereco");
					endereco=leia.nextLine();
					
					cpf = userup.get().getCpf();
					id = userup.get().getId();
					
					user.atualizarUser(new Cliente(nome,endereco,dataDeInscricao,cpf,id));
					
				}else
					System.out.println("o cliente Não foi encontrada!");

				keyPress();
				break;
			case 8:
				System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT + Cores.ANSI_BLACK_BACKGROUND);
				System.out.println("atualizando dados do pedido...\n\n");
				
				System.out.println("Digite o id do pedido: ");
				id = leia.nextInt();
				
				Optional<NotaFiscal>  notaFiscalup = notaFiscal.buscarNotaFiscalNaCollection(id);
				
				if(notaFiscalup.isPresent()) {
					
					System.out.println("	digite o servico:	");
					System.out.println("	1	-	pastel");
					System.out.println("	2	-	refrigerante");
					System.out.println("	3	-	caldo de cana");
					opcao=leia.nextInt();
					switch (opcao) {
					case 1: 
						servico="pastel";
						receita.cardapioPedido();
						
						System.out.println("digite o numero do pastel que voce deseja");
						pastel=leia.nextInt();
						
						System.out.println("quantos pasteis");
						qtd=leia.nextInt();
						
						break;
					case 2: 
						servico="refrigerante";
						valor=6.0f;
						break;
					case 3: 
						servico="caldo de cana";
						valor=5.0f;
						
						break;
					
					default:
						System.out.println("valor invalido");
					}
					
					System.out.println("qual o endereco de entrega");
					leia.skip("\\R");
					destino=leia.nextLine();
					notaFiscal.atualizarNotaFiscal((new Pedido(servico,destino,(receita.preco(pastel)*qtd),id,id)));
					
				}else
					System.out.println("o cliente Não foi encontrada!");

				keyPress();
				break;
			case 9:
				id=0;
				System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT + Cores.ANSI_BLACK_BACKGROUND);
				System.out.println("atualizando dados do receita...\n\n");
				
				System.out.println("Digite o id da receita: ");
				id = leia.nextInt();
				
				Optional<Receita> receitaup = receita.buscarReceitaNaCollection(id);
				
				if(receitaup.isPresent()) {
					
					System.out.println("digite o nome da receita");
					leia.skip("\\R");
					nome=leia.nextLine();
					
					System.out.println("qual o modo de preparo");
					modoPreparo=leia.nextLine();
					
					System.out.println("qual o tempo de preparo");
					tempoPreparo=leia.nextLine();
					
					System.out.println("qual o tamanho do pastel");
					tamanho=leia.nextLine();
					
					System.out.println("qual o valor do pastel");
					preco=leia.nextFloat();
					
					receita.atualizarReceita(new Pastel(nome,modoPreparo,tempoPreparo,id,tamanho,preco));
					
				}else
					System.out.println("o cliente Não foi encontrada!");

				keyPress();
				break;
			case 10:
				System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT + Cores.ANSI_BLACK_BACKGROUND);
				System.out.println("excluindo cliente...\n\n");
				
				System.out.println("Digite o cpf ou cnpj do cliente: ");
				cpf = leia.nextInt();
				
				user.deletarUser(cpf);
				
				keyPress();
				break;
			case 11:
				System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT + Cores.ANSI_BLACK_BACKGROUND);
				System.out.println("finalizando pedido...\n\n");
				
				System.out.println("Digite o numero do pedido: ");
				id = leia.nextInt();
				
				notaFiscal.deletarNotaFiscal(id);
				
				keyPress();
				break;
			case 12:
				System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT + Cores.ANSI_BLACK_BACKGROUND);
				System.out.println("excluindo receita...\n\n");
				
				System.out.println("Digite o id da receita: ");
				id = leia.nextInt();
				
				receita.deletarReceita(id);
				
				keyPress();
				break;
			default:
				System.out.println(Cores.TEXT_RED_BOLD + Cores.ANSI_BLACK_BACKGROUND + "\nOpção Inválida!\n" + Cores.TEXT_RESET);
				keyPress();
				break;
			}
		}

	}

	public static void keyPress() {

		try {

			System.out.println("\n\nPressione a tecla Enter para continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla inválida!");

		}
	}

	public static void sobre() {
		System.out.println(Cores.TEXT_CYAN_BRIGHT+ Cores.ANSI_BLACK_BACKGROUND);
		System.out.println("********************************************************");
		System.out.println("		Pastelaria da pam			");
		System.out.println("		Projeto Desenvolvido por:		");
		System.out.println("		pedro henrique santos bernardo		");
		System.out.println("********************************************************");
		System.out.println(Cores.TEXT_RESET);
	}

}
