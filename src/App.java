import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    Random r=new Random();
    System.out.println("\nBenvenuto al gioco Sette & Mezzo\n");

        String pescaCarta = "no";
        double punteggioUtente = 0;
        int seme;
        
        String nomeSeme = "";
    
         
        
        do {
            int cartaUtente = r.nextInt(10) + 1;
            seme=r.nextInt(4)+1;
            switch (seme) {
                case 1: nomeSeme = "denari";
                    break;
                case 2: nomeSeme = "bastoni";
                break;
                case 3: nomeSeme = "spade";
                break;
                case 4: nomeSeme = "coppe";
                break;
             }
                
            // punteggioUtente = punteggioUtente + cartaUtente;
            if (cartaUtente >= 8) {
                punteggioUtente = punteggioUtente + 0.5;
            } else {
                punteggioUtente = punteggioUtente + cartaUtente;
            }
            System.out.println("\nHai pescato la carta " + cartaUtente + " di " + nomeSeme);
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

