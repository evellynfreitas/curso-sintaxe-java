import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Escolha um número e veja sua tabuada: ");
		int num = scanner.nextInt();
		
		
		for(int i = 1; i<=10; i++) {
			int res = i * num;
			System.out.println(num + "x" + i + " = " + res);
		}
		scanner.close();
	}

}
