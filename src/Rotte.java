import java.util.Scanner;

public class Rotte {
    public static void main(String[] args) {
        System.out.print("Har du en rotte svar: ja eller nej");

        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();

        if (answer.equalsIgnoreCase(" ja")) {
            System.out.println("Du har en rotte!");
        } else if (answer.equalsIgnoreCase(" nej")) {
            System.out.println("Du har ikke en rotte!");
        } else {
            System.out.println("Ugyldigt svar. Skriv 'ja' eller 'nej'.");
        }
    }
}