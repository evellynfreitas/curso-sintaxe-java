
public class OperadoresRelacionais {

    public static void main(String[] args) {
    	
    	/*Inteiros*/
    	int i1 = 10, i2= 20;
    	
    	System.out.println("Comparação entre inteiros:");
    	System.out.println(i1 == i2);
    	System.out.println(i1 != i2);
    	System.out.println(i1 > i2);
    	System.out.println(i1 < i2);
    	
    	
    	/*Float*/
    	float f1 = 4.5F, f2 = 3.5F;
    	
    	System.out.println("\nComparação entre floats:");
    	System.out.println(f1 == f2);
    	System.out.println(f1 != f2);
    	System.out.println(f1 > f2);
    	System.out.println(f1 < f2);
    	
    	
    	/*Char*/
    	char c1 = 'a', c2='y';
    	
    	System.out.println("\nComparação entre char:");
    	System.out.println(c1 == c2);
    	System.out.println(c1 != c2);
    	System.out.println(c1 > c2);
    	System.out.println(c1 < c2);
    	
    	//Um char ser maior que o outro significa que ele possui uma representação binária maior
    	
    	
    	/*String*/
    	String s1 = "Fulano", s2 = "Fulano";
    	
    	System.out.println("\nComparação entre Strings:");
    	System.out.println(s1 == s2);
    	System.out.println(s1 != s2);

    	//Comparações de maior e menor utilizando Strings resultam em erro!!
    	
    	
    	/*Boolean*/
    	boolean b1 = true, b2 = false;
    	System.out.println("\nComparação entre Booleans:");
    	System.out.println(b1 == b2);
    	System.out.println(b1 != b2);
    	
    	//Comparações de maior e menor utilizando Booleans resultam em erro!!
    	
    	
    	/*Comparando tipos diferentes*/
    	
    	System.out.println("\nComparação entre float e int:");
    	System.out.println(f1 == i1);
    	System.out.println(f1 != i1);
    	System.out.println(f1 > i1);
    	System.out.println(f1 < i1);
    	
    	System.out.println("\nComparação entre char e int:");
    	System.out.println(c1 == i1);
    	System.out.println(c1 != i1);
    	System.out.println(c1 > i1);
    	System.out.println(c1 < i1);
    	
    	System.out.println("\nComparação entre char e float:");
    	System.out.println(c1 == f1);
    	System.out.println(c1 != f1);
    	System.out.println(c1 > f1);
    	System.out.println(c1 < f1);
    	
    	//Comparações utilizando os outro tipos de dado resultaram em erro de lógica
    }
}
