
public class Operadores {

	public static void main(String[] args) {
		int a, b, c;
		
		// Concatenação de Strings
		
		String concatenacao1 = 1+1+1+"1"; System.out.println(concatenacao1);
		String concatenacao2 = 1+1+"1"+1; System.out.println(concatenacao2);
		String concatenacao3 = 1+"1"+1+1; System.out.println(concatenacao3);
		String concatenacao4 = "1"+1+1+1; System.out.println(concatenacao4);
		String concatenacao5 = "1"+(1+1+1); System.out.println(concatenacao5);

		
		// Negação de variáveis Booleanas
		
		boolean valido = true;
		System.out.println(!valido); // não muda o valor da variável, só do que será mostrado na tela
		
		valido = !valido; 
		System.out.println(valido);
		
		
		// Soma
		
		a = b = 0;
		
		System.out.println(a++); // primeiro printa e depois soma
		System.out.println(++b); // primeiro soma e depois printa
		
		c = a + b;
		System.out.println(c);
		
		a = b = 0;
		a = a+2; // a=2
		b += 2;  // b=2
		
		
		// Subtracao;
		c = -5;
		System.out.println(-c); // multiplica o número por -1
		System.out.println(c);  // c continua -5, essa operação acima não muda o valor da variável, só do que vai ser impresso na tela
	
		c=1; 
		c--;
		System.out.println(c);
		
		a = b = 2;
		a = a-1;   // a = 1
		b -= 1;    // b = 1
		c = a - b; // c = 0
		
		
		// Multiplicação
		
		a = a*10;   // a = 10
		b *= 10;    // b = 10
		c = a * b;  // c = 100
		
		
		// Divisão
		
		a = a/5;    // a = 2
		b /= 5;     // b = 2
		c = a / b;  // c = 1
		
		
		// Módulo
		c = 10 % 8; // c = 2
		c = 15 % 5; // c = 0
		
		
		// Operadores Relacionais
		a = 1; b = 2;
		
		if(a == b) System.out.println("A é igual a B");
		if(a != b) System.out.println("A é diferente de B");
		if(a > b) System.out.println("A é maior que B");
		if(a < b) System.out.println("B é maior que A");
		
		
		// Operador Ternário
		
		boolean resultado1, resultado2;
		
		if(a==b) resultado1 = true;
		else resultado1 = false;
		
		resultado2 = a==b ? true : false;
		
		System.out.println(resultado1);
		System.out.println(resultado2);
		
		
		// Operadores Lógicos
		
		boolean condicao1 = false;
		boolean condicao2 = true;
		
		if(condicao1 && condicao2) System.out.println("Ambas as condições são verdadeiras");
		else if(condicao1 || condicao2) System.out.println("Pelo menos uma das condições são verdadeiras");
		else System.out.println("Nenhuma das condições é verdadeira");

	}
}
