package JavaExercicios.Modulo9LacoCondicionalIfSwitch;

import java.util.Scanner;

public class Ex01MaiorMenor {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int n1, n2, n3, tot1;
		
		System.out.println("\nDigite o número A:");
		n1 = leia.nextInt();
		
		System.out.println("\nDigite o número B:");
		n2 = leia.nextInt();
		
		System.out.println("\nDigite o número C:");
		n3 = leia.nextInt();
		
		tot1 = n1 + n2;
		
		if(tot1>n3) {
			System.out.println("\n"+n1+" + "+n2+" = "+tot1+" >"+n3+"\nA soma de A + B é maior do que C");
		} else if(tot1<n3) {
			System.out.println("\n"+n1+" + "+n2+" = "+tot1+" < "+n3+"\nA soma de A + B é menor do que C");
		} else {
			System.out.println("\n"+n1+" + "+n2+" = "+tot1+" = "+n3+"\nA soma de A + B é igual a C");
		}
		
	}

}
