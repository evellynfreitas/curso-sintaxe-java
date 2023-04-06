import java.util.Scanner;


public class Exercicio1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int vetor[] = new int[5];
		
		for(int i = 0; i <vetor.length; i++) {
			System.out.print("Digite um número: ");
			vetor[i]= scanner.nextInt();
		}
		
		System.out.println("\nVetor invertido ");
		
		for(int i = vetor.length-1; i >=0; i--) {
			System.out.print(vetor[i]+ " ");
		}
		
		scanner.close();
	}

}
