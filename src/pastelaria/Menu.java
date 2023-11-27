package pastelaria;

import java.io.IOException;
import java.security.Timestamp;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Optional;
import java.util.Scanner;
import java.util.Timer;

import pastelaria.model.Cliente;
import pastelaria.model.Pastel;
import pastelaria.model.Pedido;
import pastelaria.util.Cores;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		Date dataDeInscricao = new Date();
		
		Cliente cliente1 = new Cliente("cleito","rua dos cleito",dataDeInscricao,123);
		Cliente cliente2 = new Cliente("cleito","rua dos cleito","1140597863",dataDeInscricao,123);
		
		cliente1.visualizar();
		cliente2.visualizar();

		Pedido pedido1 = new Pedido("pastel","rua dos cleito","teste", 20.00f,1);
		Pedido pedido2 = new Pedido("tapioca","rua dos cleito","teste", 10.00f,2);
		
		pedido1.visualizar();
		pedido2.visualizar();
		
		Pastel pastel1 = new Pastel("frango","pega o frango","3 horas", "grande");
		Pastel pastel2 = new Pastel("carne","pega a carne","1 horas", "grande");
		
		pastel1.visualizar();
		pastel2.visualizar();
		
		int opcao, numero, agencia, tipo, numeroDestino;
		//String titular, dt_niver, nome;
		//float saldo, limite, valor;

		while (true) {

			System.out.println(Cores.TEXT_CYAN_BRIGHT + Cores.ANSI_BLACK_BACKGROUND
					+ "****************************************");
			System.out.println("                                    	");
			System.out.println("         Pastelaria da pam   	    	");
			System.out.println("                                    	");
			System.out.println("****************************************");
			System.out.println("                                    	");
			System.out.println("         1 - cardapio               	");
			System.out.println("         2 - pedidos           	    	");
			System.out.println("         3 - clientes         	    	");
			System.out.println("         4 - cadastrar cliente      	");
			System.out.println("         5 - fazer pedido           	");
			System.out.println("    	 6 - adicionar item no cardapio ");
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
				keyPress();
				break;
			case 2:
				System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT + Cores.ANSI_BLACK_BACKGROUND);
				System.out.println("pedidos\n\n");
				keyPress();
				break;
			case 3:
				System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT + Cores.ANSI_BLACK_BACKGROUND);
				System.out.println("clientes\n\n");
				keyPress();
				break;
			case 4:
				System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT + Cores.ANSI_BLACK_BACKGROUND);
				System.out.println("faca seu pedido\n\n");
				keyPress();
				break;
			case 5:
				System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT + Cores.ANSI_BLACK_BACKGROUND);
				System.out.println("faca seu pedido\n\n");
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
