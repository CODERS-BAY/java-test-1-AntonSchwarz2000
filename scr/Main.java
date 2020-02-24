import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Primzahl-Checker
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean prim = true;
        for (int i = 2; i < number; ++i) {

            if (number % i == 0) {
                prim = false;
            }
        }
        if (prim) {
            System.out.println("das ist eine Primzahl");
        }

        if (!prim) {
            System.out.println("das ist keine Primzahl");
        }
    }
}
// Römische Zahlen
// => keine Lösung

// Programmauswertung
// 2
// 2.4
// 19

// Datentypen
// int ist eine primitiver Datentyp. Integer dagegen ist eine Klasse
// andere Datentypen: int, boolean, string, double
