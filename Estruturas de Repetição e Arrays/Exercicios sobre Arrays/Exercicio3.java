import java.util.Scanner;


public class Exercicio3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		
		int vetor[] = new int[20];
		
		for(int i=0; i<20; i++) {
			System.out.print("Digite um número: ");
			vetor[i]=scanner.nextInt();
		}
		
		System.out.println("\nAgora irei mostrar os números e seus sucessores");
		
		for(int i=0; i<20; i++) {
			System.out.println(vetor[i] + " seu sucessor: " + (vetor[i]+1));
		}
		
		scanner.close();
	}

}
