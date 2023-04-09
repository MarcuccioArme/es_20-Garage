import java.util.Date;
import java.util.Scanner;

public class Moto extends Veicolo {

    final float CostoOrario = 1.0f; //A ore

    public Moto(String nome, String marca, String targa, Date data) {
        super(nome, marca, targa, data);
    }

    @Override
    public double CalcolaCosto(Date dataUscita) {

        Scanner sc = new Scanner(System.in);

        double prezzo;
        double oraArrivo, oraAttuale, tempoTrascorso;
        double contante, resto;

        oraArrivo = this.dataIngresso.getTime();
        oraAttuale = dataUscita.getTime();
        tempoTrascorso = oraAttuale-oraArrivo;

        double numOre = tempoTrascorso/3600000;
        numOre = Math.ceil(numOre);
        int Ore = (int)numOre;

        prezzo = Ore * CostoOrario;
        System.out.println("\nIl costo del parcheggio è di: "+prezzo);

        do {

            System.out.println("Inserisci il contante: ");
            contante = sc.nextDouble();

            if (contante < prezzo) {
                System.out.println("\nIl contante non è sufficiente!");
            }

        } while (contante < prezzo);

        if (contante == prezzo) {
            System.out.println("\nIl posto è stato pagato");
        } else {
            resto = contante - prezzo;
            System.out.println("\nIl posto è stato pagato");
            System.out.println("Il resto è di: "+resto);
        }

        return prezzo;
    }

}