package TV;
import java.util.Scanner;
public class Cliente {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Televisao tv = new Televisao();
		int escolha;
		
		System.out.println("Menu da Televisao");
		System.out.println("1- Ligar");
		System.out.println("2- Aumentar volume");
		System.out.println("3- Diminuir volume");
		System.out.println("4- Aumentar canal");
		System.out.println("5- Diminuir canal");
		System.out.println("6- Mudar canal");
		System.out.println("7- Ver informações da TV");
		System.out.println("8- Desligar\n");
		
		do {
			System.out.print("Digite sua escolha: ");
			escolha = teclado.nextInt();
			
			switch(escolha) {
			
			case 1:
				tv.ligar();
				break;
			case 2:
				tv.aumentarVolume();
				break;
			case 3:
				tv.diminuirVolume();
				break;
			case 4:
				tv.aumentarCanal();
				break;
			case 5:
				tv.diminuirCanal();
				break;
			case 6:
				System.out.print("Digite o canal: ");
				tv.mudarCanal(teclado.nextInt());
				break;
			case 7:
				System.out.println("Canal: "+ tv.getCanal());
				System.out.println("Volume: "+ tv.getVolume());
				break;
			case 8:
				tv.desligar();
				break;
			}
		}while(escolha!=8);
		
		teclado.close();

	}

}
