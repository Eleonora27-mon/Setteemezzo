import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    Random r=new Random();
    System.out.println("\nBenvenuto al gioco Sette & Mezzo\n");

        String pescaCarta = "no";
        double punteggioUtente = 0;

        do {
            int cartaUtente = r.nextInt(10) + 1;
            // punteggioUtente = punteggioUtente + cartaUtente;
            if (cartaUtente >= 8) {
                punteggioUtente = punteggioUtente + 0.5;
            } else {
                punteggioUtente = punteggioUtente + cartaUtente;
            }
            System.out.println("\nHai pescato la carta " + cartaUtente);
            System.out.println("Punteggio corrente " + punteggioUtente);

            pescaCarta = "no";
            if (punteggioUtente <= 7.5) {
                System.out.println("Vuoi pescare un'altra carta?");
                pescaCarta = sc.nextLine();
            }

        } while (pescaCarta.equalsIgnoreCase("si"));

        if (punteggioUtente > 7.5) {
            System.out.println("Hai sballato");

        }

        sc.close();




    


    }
}
