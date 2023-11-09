package JavaExercicios.Modulo9LacoCondicionalIfSwitch;

import java.util.Scanner;

public class Ex4Animais {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nVertebrado ou invertebrado?");
		String coluna = leia.nextLine();
		
		// Se for vertebrado
		
		if (coluna.equalsIgnoreCase("vertebrado")) {
			System.out.println("\nAve ou mamífero?");
			String classe = leia.nextLine();
			
			// Se for ave
			
			if (classe.equalsIgnoreCase("ave")) {
			 System.out.println("\nCarnívoro ou Onívoro??");
			 String comida = leia.nextLine();
			 
			 if (comida.equalsIgnoreCase("carnívoro")) {
				 System.out.println("\nÁguia");
			 } else {
				 System.out.println("\nPomba");
			   }
			 
			// Se for mamífero
			 
			} else {
				System.out.println("\nOnívoro ou Herbívoro?");
				 String comida = leia.nextLine();
				 
				 if (comida.equalsIgnoreCase("onívoro")) {
					 System.out.println("\nHomem");
			} else { 
				 System.out.println("\nVaca");
			}
		  }	
	    } else {
			
		// Se for invertebrado	
			
	    	System.out.println("\nInseto ou anelídeo?");
	    	String classe = leia.nextLine();
			
			// Se for inseto
			
			if (classe.equalsIgnoreCase("inseto")) {
				
				 System.out.println("\nHematófago ou Herbívoro?");
				 String comida = leia.nextLine();
				 
				 if (comida.equalsIgnoreCase("hematófago")) {
					 System.out.println("\nPulga");
				 } else {
					 System.out.println("\nLagarta");
				   }
				 
			// Se for anelídeo
				 
			} else {
				
				System.out.println("\nHematófago ou Onívoro?");
				String comida = leia.nextLine();
				 
				 if (comida.equalsIgnoreCase("hematófago")) {
					 System.out.println("\nSanguessuga");
				 } else {
					 System.out.println("\nMinhoca");
			     }	
			}
	     }

      }
}
