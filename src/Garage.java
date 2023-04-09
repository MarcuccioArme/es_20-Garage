import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Garage {

    final int nPosti = 25;  //Max numero posti
    final int nAuto = 15;   //Max numero auto
    final int nMoto = 10;   //Max numero moto
    Veicolo posti[] = new Veicolo[nPosti];

    public Garage() {
        /*for (int i=0; i<nPosti; i++) {
            posti[i] = new Veicolo("", "", "", "");
        }*/
    }

    public String LeggiStringa() {

        String strOut;
        Scanner sc = new Scanner(System.in);
        strOut = sc.next();

        return strOut;
    }

    public int CercaPostoAuto() {

        int i;
        boolean Flag = false;

        for (i=0; i<nAuto && !Flag; i++) {

            if (posti[i] == null) {
                Flag = true;
            }

        }

        if (Flag == false) {
            i = -1;
        } else {
            i--;
        }

        return i;
    }

    public int CercaPostoMoto() {

        int i;
        boolean Flag = false;

        for (i=15; i<nPosti && !Flag; i++) {

            if (posti[i] == null) {
                Flag = true;
            }

        }

        if (Flag == false) {
            i = -1;
        } else {
            i--;
        }

        return i;
    }

    public void EntrataVeicolo() {

        Scanner sc = new Scanner(System.in);

        int Scelta;
        int esito;
        do {
            System.out.println("1) Auto");
            System.out.println("2) Moto");
            System.out.println("0) Esci");

            System.out.println("\nInserisci scelta:");
            Scelta = sc.nextInt();

            switch (Scelta) {
                case 1: esito = this.CercaPostoAuto();   //Ingresso automobile
                        if (esito == -1) {
                            System.out.println("Posti auto esauriti.");
                        } else {
                            //Leggere da tastiera i dati dell'auto
                            System.out.println("Inserisci il nome: ");
                            String nome = LeggiStringa();

                            System.out.println("Inserisci la marca: ");
                            String marca = LeggiStringa();

                            System.out.println("Inserisci la targa: ");
                            String targa = LeggiStringa();

                            Date data = null;
                            String dStr = "22/01/2023 10:00";
                            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yy HH:mm");

                            try {
                                data = formato.parse(dStr);
                            } catch (ParseException e) {
                                System.out.println("Formato data non valido.");
                            }

                            Auto a = new Auto(nome, marca, targa, data);
                            posti[esito] = a;

                            System.out.println("L'auto è stata parcheggiata nel posto: "+(esito));
                        }
                    break;

                case 2: esito = this.CercaPostoMoto();   //Ingresso automobile
                    if (esito == -1) {
                        System.out.println("Posti moto esauriti.");
                    } else {
                        //Leggere da tastiera i dati dell'auto
                        System.out.println("Inserisci il nome: ");
                        String nome = LeggiStringa();

                        System.out.println("Inserisci la marca: ");
                        String marca = LeggiStringa();

                        System.out.println("Inserisci la targa: ");
                        String targa = LeggiStringa();

                        Date data = null;
                        String dStr = "22/01/2023 10:00";
                        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yy HH:mm");

                        try {
                            data = formato.parse(dStr);
                        } catch (ParseException e) {
                            System.out.println("Formato data non valido.");
                        }

                        Moto m = new Moto(nome, marca, targa, data);
                        posti[esito] = m;

                        System.out.println("La moto è stata parcheggiata nel posto: "+(esito));
                    }
                    break;
            }

        }while (Scelta != 0);
    }

    public void UscitaVeicolo() {

        String Targa;
        Date dataUscita = new Date();

        System.out.println("\nInserisci la targa: ");
        Targa = LeggiStringa();

        int Posizione = CercaVeicolo(Targa);
        if (Posizione != -1) {

            PagaParcheggio(Posizione, dataUscita);
            posti[Posizione] = null;
        }
        else {
            System.out.println("L'auto non è presente nel garage.");
        }

    }

    public int CercaVeicolo(String trg) {

        int i;
        boolean Flag = false;

        for (i=0; i<nPosti && !Flag; i++) {

            if (posti[i] == null) {
                Flag = false;
            } else if (posti[i].getTarga().equals(trg)) {
                Flag = true;
            }

        }

        if (Flag == false) {
            i = -1;
        } else {
            i--;
        }

        return i;
    }

    public void PagaParcheggio(int posizione, Date dataUscita) {

        double prezzo;

        if (posizione >= 0 || posizione >= nAuto) {
            prezzo = posti[posizione].CalcolaCosto(dataUscita);
        } else {
            prezzo = posti[posizione].CalcolaCosto(dataUscita);
        }

    }

    public void CercaInformazioni() {

        Scanner sc = new Scanner(System.in);

        int posizione;
        System.out.println("Inserisci la posizione da cercare: ");
        posizione = sc.nextInt();

        boolean Flag = false;

        for (int i = 0; i < nPosti && Flag == false; i++) {
            if (posti[i] != null && i == posizione) {
                Flag = true;
                System.out.println("Informazioni sul veicolo:");
                System.out.println("Nome: " + posti[i].getNome());
                System.out.println("Marca: " + posti[i].getMarca());
                System.out.println("Targa: " + posti[i].getTarga());
                break;
            }
        }

        if (Flag == false) {
            System.out.println("Veicolo non trovato.");
        }

    }

    public void ContaPosti() {

        int Auto = 0;
        int Moto = 0;

        for (int i = 0; i < nAuto; i++) {
            if (posti[i] == null) {

            } else {
                Auto++;
            }
        }

        for (int i = 15; i < nPosti; i++) {
            if (posti[i] == null) {

            } else {
                Moto++;
            }
        }

        System.out.println("I posti auto occupati sono: "+Auto);
        System.out.println("I posti moto occupati sono: "+Moto);

    }

    public void StampaElenco() {
        String Marca;
        System.out.println("\nInserisci la marca da cercare: ");
        Marca = LeggiStringa();

        boolean Flag = false;

        for (int i=0; i<nAuto; i++) {
            if (posti[i] == null) {

            } else if (posti[i].getMarca().equals(Marca)) {
                System.out.println("\nVeicolo trovato:");
                System.out.println("Nome: " + posti[i].getNome());
                System.out.println("Marca: " + posti[i].getMarca());
                System.out.println("Targa: " + posti[i].getTarga());
                System.out.println("Posto parcheggio: " + i);

                Flag = true;
            }
        }

        if (Flag == false) {
            System.out.println("Veicolo non trovato.");
        }
    }
}