
public class OperadoresLogicos {
    public static void main(String[] args) {
    	
    	/*Operandos Lógicos*/
    	boolean b1=true, b2=false;
    	
    	System.out.println("Utilizando operandos lógicos");
    	System.out.println(b1&&b2);
    	System.out.println(b1||b2);
    	System.out.println(b1^b2);
    	System.out.println(!b1);
    	System.out.println(b1&&b2||b1);
    	System.out.println(b1&&b2||!b1);
    	
    	
    	/*Expressões Lógicas*/
    	int a=1,b=2,c=3;
    	System.out.println("\nUtilizando expressões lógicos");
    	System.out.println(a<b && b<c);
    	System.out.println(a+b==3 || c==0);
    	System.out.println(a+b==3 && c==0);
    	
    	String nome="Carlos";
    	int idade = 15;
    	
    	System.out.println(nome=="Carlos" && idade > 18);
    	System.out.println(nome=="Carlos" || idade > 18);
    	System.out.println(nome=="Carlos" ^ idade == 15);

    	
    }
}
