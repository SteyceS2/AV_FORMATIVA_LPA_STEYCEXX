package formativa;

import java.util.Scanner;

public class f3 {

	public static void main(String[] args) {
		 Scanner ler = new Scanner(System.in);
	        
	        System.out.println("Bem-vindo à Calculadora de Operações!");
	        
	        System.out.print("Digite o primeiro valor: ");
	        double valor1 = ler.nextDouble();
	        
	        System.out.print("Digite o segundo valor: ");
	        double valor2 = ler.nextDouble();
	        
	        System.out.println("Escolha a operação desejada:");
	        System.out.println("1. Subtração (-)");
	        System.out.println("2. Multiplicação (*)");
	        System.out.println("3. Adição (+)");
	        System.out.print("Opção: ");
	        int operacao = ler.nextInt();
	        
	        double resultado = 0;
	        
	        switch (operacao) {
	            case 1:
	                resultado = valor1 - valor2;
	                break;
	            case 2:
	                resultado = valor1 * valor2;
	                break;
	            case 3:
	                if (valor2 != 0) {
	                    resultado = valor1 + valor2;
	                } else {
	                    System.out.println("Erro: Divisão por zero!");
	                    return;
	                }
	                break;
	            default:
	                System.out.println("Opção inválida!");
	                return;
	        }
	        
	        System.out.println("O resultado é: " + resultado);
	        
	        ler.close();
	    }
	
        
    }

	


