import java.util.Scanner;

public class TestGarage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Garage europa = new Garage();

        int Scelta;

        do {

            System.out.println("\n1) Assegnare un posto ad un veicolo in arrivo");
            System.out.println("2) Liberare un posto occupato e calcolo dell'importo del parcheggio");
            System.out.println("3) Ricercare informazioni relative al veicolo che occupa un determinato posto");
            System.out.println("4) Contare i posti auto e moto occupati in un determinato momento");
            System.out.println("5) Stampare l'elenco delle auto di una certa marca");
            System.out.println("0) Esci");

            System.out.println("\nInserisci scelta:");
            Scelta = sc.nextInt();

            switch(Scelta) {
                case 1: europa.EntrataVeicolo();
                    break;

                case 2: europa.UscitaVeicolo();
                    break;

                case 3: europa.CercaInformazioni();
                break;

                case 4: europa.ContaPosti();
                    break;

                case 5: europa.StampaElenco();
                    break;

                case 0: System.out.println("\nArrivederci!");
                    break;
            }

        } while(Scelta != 0);

    }
}