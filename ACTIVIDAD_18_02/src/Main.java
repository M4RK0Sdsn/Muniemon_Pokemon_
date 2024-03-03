import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Muniemon muniemon1 = new Muniemon();
        Muniemon muniemon2 = new Muniemon();
        Scanner sc = new Scanner(System.in);
        int seleccionador;

        do {
            System.out.println("-------------- MUNIEMON --------------");
            System.out.println("1. Dar de alta primer Muniemon");
            System.out.println("2. Dar de alta segundo Muniemon");
            System.out.println("3. Mostrar primer Muniemon");
            System.out.println("4. Mostrar segundo Muniemon");
            System.out.println("5. Atacar primer Muniemon a segundo Muniemon");
            System.out.println("6. Atacar segundo Muniemon a primer Muniemon");
            System.out.println("7. Salir del programa");
            System.out.println("---------------------------------------");
            System.out.print("Seleccione una opción: ");
            seleccionador = sc.nextInt();

            switch (seleccionador) {
                case 1:
                    crearMuniemon(sc, muniemon1);
                    break;
                case 2:
                    crearMuniemon(sc, muniemon2);
                    break;
                case 3:
                    mostrarMuniemon(muniemon1);
                    break;
                case 4:
                    mostrarMuniemon(muniemon2);
                    break;
                case 5:
                    atacarMuniemon(muniemon1, muniemon2);
                    break;
                case 6:
                    atacarMuniemon(muniemon2, muniemon1);
                    break;
                case 7:
                    System.out.println("Fin del programa");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (seleccionador != 7);
    }

    public static void crearMuniemon(Scanner sc, Muniemon muniemon) {
        System.out.println("------------- CREACION DE UN MUNIEMON -------------");
        System.out.print("Introduce el nombre del Muniemon: ");
        muniemon.setNombre(sc.next());
        System.out.print("Introduce el ataque del Muniemon: ");
        muniemon.setAtaque(sc.nextInt());
        System.out.print("Introduce la defensa del Muniemon: ");
        muniemon.setDefensa(sc.nextInt());
        System.out.print("Introduce los puntos de vida del Muniemon: ");
        muniemon.setHp(sc.nextInt());
        System.out.println("---------------------------------------------------");
    }

    public static void mostrarMuniemon(Muniemon muniemon) {
        System.out.println("-------------------- DATOS ----------------------");
        System.out.println("Nombre: " + muniemon.getNombre());
        System.out.println("Ataque: " + muniemon.getAtaque());
        System.out.println("Defensa: " + muniemon.getDefensa());
        System.out.println("Puntos de vida: " + muniemon.getHp());
        if (muniemon.estaMuerto()) {
            System.out.println("El Muniemon está muerto.");
        }
        System.out.println("--------------------------------------------------");
    }

    public static void atacarMuniemon(Muniemon atacante, Muniemon objetivo) {
        if (atacante.estaMuerto()) {
            System.out.println("El Muniemon atacante está muerto y no puede atacar.");
        } else if (objetivo.estaMuerto()) {
            System.out.println("El Muniemon objetivo está muerto y no puede ser atacado.");
        } else {
            System.out.println("------------- ATACAR MUNIEMON -------------");
            System.out.println(atacante.getNombre() + " ataca a " + objetivo.getNombre() + "!");
            atacante.atacar(objetivo);
            int vidaRestante = objetivo.getHp();
            System.out.println("Vida restante de " + objetivo.getNombre() + ": " + vidaRestante);
            System.out.println("-------------------------------------------");
        }
    }
}