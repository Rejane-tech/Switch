package Projeto;
//switch
import java.util.Scanner;

public class Linguagem {
	public static void main (String []args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Escolha uma linguagem : Java ou C ");
	String Linguagem  = sc.next();
	
	switch (Linguagem) {
	case "Java":
		System.out.println (" Melhor escolha! Esta linguagem é Orientada a Objetos");
		break;
	
	case "C": 
		System.out.println (" Esta linguagem é estruturada ");
        break;
		
	default:
		System.out.println ("Linguagem desconhecida");
	}
	sc.close();
	}
	
}
