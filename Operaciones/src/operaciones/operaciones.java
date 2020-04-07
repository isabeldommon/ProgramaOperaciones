package operaciones;

import java.util.*;


public class operaciones {
	public static void main(String[] args){
		Scanner input= new Scanner (System.in);
		
		dividir(input);
		
	}

	public static void dividir(Scanner input) {
		try{
			System.out.println("Introduzca el dividendo: ");
			int n1 = input.nextInt();
			System.out.println("Introduzca el divisor: ");
			int n2 = input.nextInt();
			int division = n1/n2;
			System.out.println("El resultado de la division es: ");
			System.out.println(division);

		}
		
		catch(Exception e){
			System.out.println("Pruebe de nuevo, por favor");
		}
	}

}
