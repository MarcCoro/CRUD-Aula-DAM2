import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        exercici1();
    }
    public static void exercici1(){
        Scanner llegir = new Scanner(System.in);
        System.out.println("1. Gestionar professors\n" +
                "2. Gestionar mòduls professionals");
        int opcio1 = llegir.nextInt();
        System.out.println("1. Alta\n" +
                "2. Llistar\n" +
                "3. Actualitzar\n" +
                "4 Eliminar");
        int opcio2 = llegir.nextInt();
    }
}