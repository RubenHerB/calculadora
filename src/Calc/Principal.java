package Calc;
import java.util.Scanner;
public class Principal {

	public static boolean con() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Deseas realizar otra operacion? (S|N)");
		char c=Character.toUpperCase(sc.next().charAt(0));
		while(c!='S' && c!='N') {
			System.out.print("ERROR! Deseas realizar otra operacion? (S|N)");
			c=Character.toUpperCase(sc.next().charAt(0));
		}
		sc.close();
		if (c=='S') {
			return true;
		}else {
			return false;
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operacion op=new Operacion();
		Scanner sc=new Scanner(System.in);
		int s;
		do {
			System.out.print("Introduce el primer numero: ");
			op.setA(sc.nextDouble());
			System.out.print("Introduce el segundo numero: ");
			op.setB(sc.nextDouble());
			System.out.print("Que operacion deseas realizar? (1-suma|2-resta|3-multiplicacion|4-resta) ");
			s=sc.nextInt();
			while(s<1||s>4) {
				System.out.print("ERROR! Que operacion deseas realizar? (1-suma|2-resta|3-multiplicacion|4-resta) ");
				s=sc.nextInt();
			}
			
			switch(s) {
			case 1:
				System.out.print("El resultado es "+op.suma());
				break;
			case 2:
				System.out.print("El resultado es "+op.resta());
				break;
			case 3:
				System.out.print("El resultado es "+op.multiplicacion());
				break;
			case 4:
				System.out.print("El resultado es "+op.division());
				break;
			}
	}while(con());
		sc.close();
}
}

