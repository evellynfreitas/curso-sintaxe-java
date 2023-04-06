import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String nome;
		int idade;
		
		while(true) {
			System.out.println("Digite o nome: ");
			nome = scanner.next();
			
			if(nome.equals("0")) 
				break;
			
			System.out.println("Digite a idade");
			idade = scanner.nextInt();
			
			System.out.println(nome+" tem "+idade+" anos");
		}
		
		System.out.println("Fim");

		scanner.close();

	}

}
