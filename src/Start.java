import java.util.Scanner;

public class Start {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int hora = 0;
		int minutos = 0;
		int segundos = 0;
 
		Scanner entradaDatos = new Scanner(System.in);
 
		System.out.print("Introduzca la hora:");
		hora = entradaDatos.nextInt();
 
		System.out.print("Introduzca los minutos:");
		minutos = entradaDatos.nextInt();
 
		System.out.print("Introduzca los segundos:");
		segundos = entradaDatos.nextInt();
 
		if ((hora >= 0 && hora <= 23) && (minutos >= 0 && minutos <= 59) && (segundos >= 0 && segundos <= 59)) {
 
			System.out.println ("La hora es correcta");
 
		} else 
			
			System.out.println("La hora NO es correcta");
 
	}

}
