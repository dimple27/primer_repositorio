
package Repositorio;

import java.util.Scanner;

public class Repositorio {

		public static void main(String[] args) {

	    Scanner teclado = new Scanner(System.in);
	    String vocales = "aeiouáéíóúAEIOUÁÉÍÓÚ";	
	    
	    System.out.print("Dime una frase: ");
	    String frase = teclado.nextLine();

	    int cont = 0;
	    for (int i=0; i<frase.length(); i++) { //se hace el bucle y se pregunta si 0 es menor que 10(k es el total de caracteres
			char letra = frase.charAt(i);
			int pos = vocales.indexOf(letra);
			if (pos != -1)
				cont = cont + 1;
	    }
	    
	    System.out.println("He encontrado " + cont + "conson.");
	    teclado.close();
		}

	}	
	

