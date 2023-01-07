import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Witaj! Grasz teraz w grę o nazawie: 'Find a number'.");
        System.out.println("Zasady gry są proste, Aby wygrać musisz odgadnąć liczbę wylosowaną przez komputer, gdy wpiszesz " +
                "jaką kolwiek liczbę program mówi czy wylosowana liczba jest wieksza czy mniejsza. ");
        boolean itsTrue = true;
        while (itsTrue) {
            System.out.print("Wpisz liczbę:");
            int number = scanner.nextInt();
            if (number != numberToGuess && number < numberToGuess){
                System.out.println("Wylosowana liczba jest większa"+" ↑");
            } else if (number != numberToGuess && number > numberToGuess) {
                System.out.println("Wylosowana liczba jest mniejsza"+" ↓");
            }else if (number == numberToGuess){
                System.out.println("Gratuluję wygrałeś! wylosowana liczba to: " + numberToGuess);
                break;
            }
        }
    }
}