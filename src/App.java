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
        boolean [][] mazzo = new boolean [10][4];
        String nomeSeme="";
        int cartaUtente;
         
    
         
        
        do {
        
            do {
                cartaUtente= r.nextInt(10);
                seme=r.nextInt(4);
                
            } while (mazzo[cartaUtente][seme]);
                mazzo[cartaUtente][seme]=true;
                switch (seme) {
                case 0: nomeSeme = "denari";
                    break;
                case 1: nomeSeme = "bastoni";
                break;
                case 2: nomeSeme = "spade";
                break;
                case 3: nomeSeme = "coppe";
                break;
             }
               cartaUtente=cartaUtente+1; 
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

