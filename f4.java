package formativa;

import java.util.Random;

public class f4 {

	public static void main(String[] args) {
		  System.out.println("Bem-vindo ao jogo de Bingo!");
	        
	        Random random = new Random();
	        
	        System.out.println("Os números sorteados são:");
	        for (int i = 0; i < 20; i++) {
	            int numeroSorteado = random.nextInt(101); // Gera um número aleatório de 0 a 100
	            System.out.print(numeroSorteado);
	            if (i < 19) {
	                System.out.print(", ");
	            }
	        }
	    }
	
	}


