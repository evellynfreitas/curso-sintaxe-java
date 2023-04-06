import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite uma nota entre 0 e 10:");
		int nota = scanner.nextInt();
		
		while(nota>10 || nota < 0) {
			System.out.println("Nota Inválida! Digite uma nota entre 0 e 10:");
			nota = scanner.nextInt();
		}
		
		System.out.println("Fim!");

		scanner.close();

	}

}
