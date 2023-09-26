package multimedia;
import java.util.Scanner;

public class Juego {
	
	
	
	private static Scanner input = new Scanner (System.in); 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int total = 21;
		
		int usuario = 0;
		
		System.out.println("Vamos a jugar introduce un numero para quitar un palito, solo se pueden quitar de 1 a 4");
		while (total > 1) {
			
			System.out.println("Introduce numero");
			
			usuario = input.nextInt();
			
			
			
			System.out.println("");
			
			switch (usuario) {
			case 1:
				System.out.println("\nYo quito 4\n");
				total=total - 5;
				break;
			
			case 2:
				System.out.println("\nYo quito 3\n");
				total=total - 5;
				break;
				
			case 3:
				System.out.println("\nYo quito 2\n");
				total=total - 5;
				break;
				
			case 4:
				System.out.println("\nYo quito 1\n");
				total=total - 5;
				break;	
			default:
				System.out.println("\nEse valor no es valido, introduce uno de nuevo\n");
				break;
				
			}
			System.out.println("Quedan " + total + " palos\n");
			
			for(int i = 0 ; i < total ; i++) {
				System.out.print("|");
			}
			
			System.out.println("");
		}
		System.out.println("\nHa ganado la maquina");
	}

}
