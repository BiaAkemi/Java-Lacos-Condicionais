package JavaExercicios.Modulo9LacoCondicionalIfSwitch;

import java.util.Scanner;

public class Ex05MenuLanchonete {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int op, quantidade, total;
		
		System.out.println("\n\tLanchonete Família 69:");
		System.out.println("\n1 - Cachorro Quente | R$10,00");
		System.out.println("\n2 - X-Salada        | R$15,00");
		System.out.println("\n3 - X-Bacon         | R$18,00");
		System.out.println("\n4 - Bauru           | R$12,00");
		System.out.println("\n5 - Refrigerante    | R$08,00");
		System.out.println("\n6 - Suco de laranja | R$13,00");
		System.out.println("\n\tEscolha o código de produto:");
		op = leia.nextInt();
		
		switch(op) {
		
		case 1:
			System.out.println("\nInsira a quantidade:");
			quantidade = leia.nextInt();
			total = quantidade*10;
			System.out.println("\nProduto: "+quantidade+" Cachorro(s) Quente(s)"+"\nValor total: R$"+total+",00");
			break;
			
		case 2:
			System.out.println("\nInsira a quantidade:");
			quantidade = leia.nextInt();
			total = quantidade*15;
			System.out.println("\nProduto: "+quantidade+" X-Salada(s)"+"\nValor total: R$"+total+",00");
			break;	
			
		case 3:
			System.out.println("\nInsira a quantidade:");
			quantidade = leia.nextInt();
			total = quantidade*18;
			System.out.println("\nProduto: "+quantidade+" X-Bacon(s)"+"\nValor total: R$"+total+",00");
			break;
			
		case 4:
			System.out.println("\nInsira a quantidade:");
			quantidade = leia.nextInt();
			total = quantidade*12;
			System.out.println("\nProduto: "+quantidade+" Bauru(s)"+"\nValor total: R$"+total+",00");
			break;
			
		case 5:
			System.out.println("\nInsira a quantidade:");
			quantidade = leia.nextInt();
			total = quantidade*8;
			System.out.println("\nProduto: "+quantidade+" Refrigerante(s)"+"\nValor total: R$"+total+",00");
			break;
		
		case 6:
			System.out.println("\nInsira a quantidade:");
			quantidade = leia.nextInt();
			total = quantidade*13;
			System.out.println("\nProduto: "+quantidade+" Suco de laranja(s)"+"\nValor total: R$"+total+",00");
			break;
			
		default:
			System.out.println("\nEscolha uma código válido!");
		}
	}

}
