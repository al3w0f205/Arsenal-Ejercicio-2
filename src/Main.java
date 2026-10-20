import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("===== ARSENAL =====");

        Arma a1 = new Arma();
        Arma a2 = new Arma("Mjolnir");
        Arma a3 = new Arma("Escudo", 40);
        Arma a4 = new Arma("Arco", "A distancia");
        Arma a5 = new Arma(85, "Stormbreaker");
        a1.mostrar();
        a2.mostrar();
        a3.mostrar();
        a4.mostrar();
        a5.mostrar();

        // Datos del teclado para el constructor principal (prueba la validacion)
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre del arma: ");
        String nombre = sc.nextLine();
        System.out.print("Tipo: ");
        String tipo = sc.nextLine();
        System.out.print("Daño: ");
        int dano = sc.nextInt();

        Arma a6 = new Arma(nombre, tipo, dano);
        a6.mostrar();

        sc.close();
    }
}