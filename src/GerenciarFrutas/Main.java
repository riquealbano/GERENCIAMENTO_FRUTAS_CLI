package GerenciarFrutas;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		// Iniciando uma variavel para o Scanner.
		// Instanciando o array das frutas.
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> frutas = new ArrayList<>();
		
		// Inicio do teste dos códigos
		while(true) {
			try {
				System.out.println("\n Escolha uma opção:");
				System.out.println("1. Adicionar uma fruta");
				System.out.println("2. Listar todas as frutas");
				System.out.println("3. Modificar uma fruta");
				System.out.println("4. Remover uma fruta");
				System.out.println("5. Sair");
				System.out.println("Opção: ");

				// O número digitado sera escaneado e verificado se tem ligação com algum "case".
				int opcao = scanner.nextInt();
				scanner.nextLine();
				
				// Blocos de opções "cases"
				switch(opcao) {
				// Adiciona uma String ao array das frutas.
				// Retorna que a fruta foi adicionada com sucesso.
				case 1:
					System.out.println("Digite o nome da frutapara adicionar: ");
					String novaFruta = scanner.nextLine();
					frutas.add(novaFruta);
					System.out.println(novaFruta + " foi adicionada.");
					break;
					
				// Printa o array das frutas no console.
				case 2:
					System.out.println("Frutas: " + frutas);
					break;
					
				// Modifica a fruta que seleciona, baseado no valor guardado no array.
				// Ao fim printa tanto o indice e o nome da fruta ja modificada.
				case 3:
				    System.out.print("Digite o índice da fruta que deseja modificar: ");
				    int indiceModificar = scanner.nextInt();
				    scanner.nextLine();
				    if (indiceModificar >= 0 && indiceModificar < frutas.size()) {
				        System.out.print("Digite o novo nome da fruta: ");
				        String frutaModificada = scanner.nextLine();
				        frutas.set(indiceModificar, frutaModificada);
				        System.out.println("Fruta no índice " + indiceModificar + " foi modificada para " + frutaModificada);
				    } else {
				        System.out.println("Índice inválido.");
				    }
				    break;
				   
				// Remove uma fruta do array das frutas, e printa se a operação deu certo ou não.
				case 4:
				    System.out.print("Digite o nome da fruta que deseja remover: ");
				    String frutaRemover = scanner.nextLine();
				    if (frutas.remove(frutaRemover)) {
				        System.out.println(frutaRemover + " foi removida.");
				    } else {
				        System.out.println(frutaRemover + " não foi encontrada.");
				    }
				    break;
				
				// Finaliza o código, sua função scanner.
				case 5:
				    System.out.println("Saindo...");
				    scanner.close();
				    return;
				    
				// Função de exceções do switch
				default:
				    System.out.println("Opção inválida. Tente novamente.");
				}
			// Catch para valores de entrada diferentes do esperado, mostrando ao usuário que deu errado
			} catch (InputMismatchException e) {
				    System.out.println("Entrada inválida. Por favor, digite um número.");
				    scanner.nextLine();
			}
		}
	}
}
