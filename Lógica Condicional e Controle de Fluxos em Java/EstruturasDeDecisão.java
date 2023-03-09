
public class EstruturasDeDecisão {

	public static void nomeDoMesIf(int numero) {
		if(numero == 1) System.out.println("Janeiro");
		else if(numero == 2) System.out.println("Fevereiro");
		else if(numero == 3) System.out.println("Março");
		else if(numero == 4) System.out.println("Abril");
		else if(numero == 5) System.out.println("Maio");
		else if(numero == 6) System.out.println("Junho");
		else if(numero == 7) System.out.println("Julho");
		else if(numero == 8) System.out.println("Agosto");
		else if(numero == 9) System.out.println("Setembro");
		else if(numero == 10) System.out.println("Outubro");
		else if(numero == 11) System.out.println("Novembro");
		else if(numero == 12) System.out.println("Dezembro");
		else System.out.println("Mes invalido");
	}
	
	public static void nomeDoMesSwitch(int numero) {
		
		switch(numero) {
		case 1: System.out.println("Janeiro");break;
		case 2: System.out.println("Fevereiro");break;
		case 3: System.out.println("Março");break;
		case 4: System.out.println("Abril");break;
		case 5: System.out.println("Maio");break;
		case 6: System.out.println("Junho");break;
		case 7: System.out.println("Julho");break;
		case 8: System.out.println("Agosto");break;
		case 9: System.out.println("Setembro");break;
		case 10: System.out.println("Outubro");break;
		case 11: System.out.println("Novembro");break;
		case 12: System.out.println("Dezembro");break;
		default: System.out.println("Mes invalido");break;
		}
		
	}
	
	public static void verificaFerias(int numero) {
		switch(numero) {
		case 1:
		case 7:
		case 12:
			System.out.println("É férias!");break;
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 8:
		case 9:
		case 10:
		case 11:
			System.out.println("Não é férias!");break;
			
		default: System.out.println("Mês indefinido");break;
		}
	}
	
	public static void diaDaSemana(int dia) {
		switch(dia) {
		case 1: System.out.println("DOMINGO");break;
		case 2: System.out.println("SEGUNDA");break;
		case 3: System.out.println("TERÇA");break;
		case 4: System.out.println("QUARTA");break;
		case 5: System.out.println("QUINTA");break;
		case 6: System.out.println("SEXTA");break;
		case 7: System.out.println("SABADO");break;
		default: System.out.println("Dia invalido");break;
		}
	}
	
	public static void verificaFinalDeSemana(int dia) {
		switch(dia) {
		case 1: 
		case 7: System.out.println("FINAL DE SEMANA");break;
		
		case 2: 
		case 3: 
		case 4:
		case 5: 
		case 6: System.out.println("DIA DE SEMANA");break;
		
		default: System.out.println("Dia invalido");break;
		}
	}
	
	public static void main(String[] args) {
		
		int mes = 7;
		nomeDoMesIf(mes);
		nomeDoMesSwitch(mes);
		verificaFerias(mes);
		
		int dia = 5;
		diaDaSemana(dia);
		verificaFinalDeSemana(dia);
	}

}
