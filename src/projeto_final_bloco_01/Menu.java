package projeto_final_bloco_01;

import java.io.IOException;
import java.util.Optional;
import java.util.Scanner;

import projeto_final_bloco_01.util.Cores;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);

		int opcao, numero, agencia, tipo, numeroDestino;
		//String titular, dt_niver, nome;
		//float saldo, limite, valor;

		while (true) {

			System.out.println(Cores.TEXT_CYAN_BRIGHT + Cores.ANSI_BLACK_BACKGROUND
					+ "************************************");
			System.out.println("                                    ");
			System.out.println("         Pastelaria da pam   	    ");
			System.out.println("                                    ");
			System.out.println("************************************");
			System.out.println("                                    ");
			System.out.println("         1 - cardapio               ");
			System.out.println("         2 - pedidos           	    ");
			System.out.println("         3 - clientes         	    ");
			System.out.println("         4 - fazer pedido           ");
			System.out.println("         0 - encerar programa       ");
			System.out.println("                                    ");
			System.out.println("************************************");
			System.out.println("Entre com a opção desejada:         ");
			System.out.println("                                    " + Cores.TEXT_RESET);

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
