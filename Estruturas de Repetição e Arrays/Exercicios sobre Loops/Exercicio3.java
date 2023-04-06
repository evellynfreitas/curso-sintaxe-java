import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int qtd=0;
		int maior=0;
		int media=0;
		
		do {
			System.out.print("Digite um número: ");
			int num = scanner.nextInt();
			qtd++;
			
			media+=num;
			
			if(qtd==1 || num > maior) maior = num;
			
		}while(qtd<5);
		
		media /= 5;
		
		System.out.println("Maior: "+maior);
		System.out.println("Media: "+media);
		scanner.close();
	}

}
