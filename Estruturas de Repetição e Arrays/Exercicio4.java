import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de números: ");
		int n = scanner.nextInt();
		
		int pares=0;
		int impares=0;
		int qtd=0;
		
		do {
			qtd++;
			System.out.print("Digite um número: ");
			int num = scanner.nextInt();

			if(num%2==0) pares++;
			else impares++;
			
		}while(qtd<n);
		
		
		System.out.println("Pares: "+pares);
		System.out.println("Impares: "+impares);
		scanner.close();
	}

}
