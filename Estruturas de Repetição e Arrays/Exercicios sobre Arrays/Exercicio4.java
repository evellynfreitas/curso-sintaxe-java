import java.util.Scanner;
import java.util.Random;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random geradorNumeros = new Random();
		
		int matriz[][] = new int[4][4];
		
		for(int x = 0; x < 4; x++) {
			for (int y = 0; y < 4; y++) {
				matriz[x][y] = geradorNumeros.nextInt(9);
			}
		}
		
		int menor=matriz[0][0];
		int menorX=0;
		int menorY=0;
		
		for(int x = 0; x < 4; x++) {
			for (int y = 0; y < 4; y++) {
				System.out.print(matriz[x][y]+" ");
				
				if(matriz[x][y] < menor) {
					menor=matriz[x][y];
					menorX=x;
					menorY=y;
				}
			}
			System.out.println();
		}
		
		System.out.println("Menor número: "+ menor);
		System.out.println("Ele está na posição ("+ menorX+","+menorY+")");
		
		scanner.close();
	}

}
