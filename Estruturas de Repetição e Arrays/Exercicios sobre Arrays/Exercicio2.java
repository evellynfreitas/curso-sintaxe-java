import java.util.Scanner;


public class Exercicio2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		char vetor[] = new char[6];
		int consoantes=0;
		
		for(int i = 0; i <vetor.length; i++) {
			
			System.out.print("Digite uma letra: ");
			vetor[i]= scanner.next().charAt(0);
			
			if(vetor[i] != 'a' && vetor[i] != 'e' && vetor[i] != 'i' && vetor[i] != 'o' && vetor[i] != 'u')
				consoantes++;
		}
		
		
		System.out.println("Foram digitadas "+consoantes+" consoantes");
		
		for(int i = 0; i <vetor.length; i++) {
		
			if(vetor[i] != 'a' && vetor[i] != 'e' && vetor[i] != 'i' && vetor[i] != 'o' && vetor[i] != 'u')
				System.out.print(vetor[i]+ " ");
		}
		
		scanner.close();
	}

}
