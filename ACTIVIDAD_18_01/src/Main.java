import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int seleccionador = 1;
		Muniemon m1 = new Muniemon();
		
		Scanner sc = new Scanner(System.in);
	do {
		System.out.println("-------------CREACION DE UN MUNIEMON----------------");
		System.out.println("1. Dar de alta al Muniemon");
		System.out.println("2. Mostrar Muniemon");
		System.out.println("3. Salir del programa");
		System.out.println("----------------------------------------------------");
		seleccionador = sc.nextInt();
		
		if (seleccionador == 1) {
			System.out.println("----------------INTRODUCCION DE DATOS-----------------");
			System.out.println("Introduce el nombre del Muniemon : " );
			m1.setNombre(sc.next());
			System.out.println("Introduce el ataque del Muniemon : ");
			m1.setAtaque(sc.nextInt());
			System.out.println("Introduce la defensa del Muniemon : ");
			m1.setDefensa(sc.nextInt());
			System.out.println("Introduce los puntos de vida del Muniemon : ");
			m1.setHp(sc.nextInt());
			System.out.println("Introduce el tipo del Muniemon : ");
			System.out.println("1-FUEGO | 2-AGUA | 3-PLANTA | 4-TIERRA");
			System.out.println("------------------------------------------------");
			int tipo_opcion = sc.nextInt();
			switch (tipo_opcion) {
			case 1: {
				m1.setTipo(tipo.FUEGO);
			}
			case 2: {
				m1.setTipo(tipo.AGUA);
			}
			case 3: {
				m1.setTipo(tipo.PLANTA);
			}
			case 4: {
				m1.setTipo(tipo.TIERRA);
				break;
			}
			default: {
				System.out.println("Numero introducido no valido.");
			}
			}
		}
		
		if (seleccionador == 2) {
			System.out.println("--------------------DATOS---------------------");
			System.out.println("El nombre del Muniemon es : " + m1.getNombre());
			System.out.println("El ataque del Muniemon es : " + m1.getAtaque());
			System.out.println("La defensa del Muniemon es : " + m1.getDefensa());
			System.out.println("Los puntos de vida del Muniemon son : " + m1.getHp());
			System.out.println("El Muniemon es de tipo " + m1.getTipo());
			System.out.println("------------------------------------------------");

		}
		
		if (seleccionador == 3) {
			System.out.println("Fin del programa");
			break;
		}
		
	} while (seleccionador >0 && seleccionador <=3);
	
	
		
	}


	}


