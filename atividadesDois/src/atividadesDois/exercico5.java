package atividadesDois;

import java.util.Scanner;

public class exercico5 {

	public static void main(String[] args) {

		int op,un,n1,n2,n3,n4,n5,n6,total;
		
		n1 = 10;
		n2 = 15;
		n3 = 18;
		n4 = 12;
		n5 = 8;
		n6 = 13;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n\t\tMenu");
		System.out.println("\n1 - Cachorro Quente - R$10,00");
		System.out.println("\n2 - X-Salada - R$15,00");
		System.out.println("\n3 - X-Bacon - R$18,00");
		System.out.println("\n4 - Bauru - R$12,00");
		System.out.println("\n5 - Refrigerante - R$8,00");
		System.out.println("\n6 - Suco de Laranja - R$13,00");
		
		System.out.println("\nDigite o número do seu pedido: ");
		op = leia.nextInt();
		System.out.println("\nDigite a quantidade do seu pedido: ");
		un = leia.nextInt();
		
		System.out.println("\n\t\tPedido Finalizado");
		
		switch(op) {
		
		case 1:
			total = n1*un;
			System.out.println("\n"+un+" unidades de Cachorro Quente\n\nTotal: R$"+total+",00");
			break;
			
		case 2:
			total = n2*un;
			System.out.println("\n"+un+" unidades de X-Salada\n\nTotal: R$"+total+",00");
			break;
			
		case 3:
			total = n3*un;
			System.out.println("\n"+un+" unidades de X-Bacon\n\nTotal: R$"+total+",00");
			break;
			
		case 4:
			total = n4*un;
			System.out.println("\n"+un+" unidades de Bauru\n\nTotal: R$"+total+",00");
			break;
			
		case 5:
			total = n5*un;
			System.out.println("\n"+un+" unidades de Refrigerante\n\nTotal: R$"+total+",00");
			break;
			
		default:
			total = n6*un;
			System.out.println("\n"+un+" unidades de Suco de Laranja: R$"+total+",00");
			break;
		}
		
		
	}

}
