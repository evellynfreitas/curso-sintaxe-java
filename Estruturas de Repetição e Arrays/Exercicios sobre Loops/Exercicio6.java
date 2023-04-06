import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Escolha um número: ");
		int num = scanner.nextInt();
		
		int fatorial = 1;
		
		for(int i = num; i>=1; i--) {
			fatorial *= i;
		}
		
		System.out.println("O fatorial de "+num+" é: "+fatorial);
		scanner.close();
	}

}
