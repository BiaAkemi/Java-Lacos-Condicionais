package JavaExercicios.Modulo9LacoCondicionalIfSwitch;

import java.util.Scanner;

public class Ex07Calculadora {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		float n1, n2, tot;
		int op;
		
		System.out.println("\nDigite o 1º número: ");
		n1 = leia.nextFloat();
		
		System.out.println("\nDigite o 2º número:");
		n2 = leia.nextFloat();
		
		System.out.println("\nOperação: ");
		op = leia.nextInt();
		
		switch(op) { 
		
		case 1:
			tot = n1 + n2;
			System.out.println("\n"+n1+" + "+n2+" = "+tot);
			break;
			
		case 2:
			tot = n1 - n2;
			System.out.println("\n"+n1+" - "+n2+" = "+tot);
			break;
			
		case 3:
			tot = n1 * n2;
			System.out.println("\n"+n1+" * "+n2+" = "+tot);
			break;
			
		case 4:
			tot = n1 / n2;
			System.out.println("\n"+n1+" / "+n2+" = "+tot);
			break;
		
		default:
			System.out.println("Operação Inválida!");
			
		}
	}

}
