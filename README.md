# es_20-Garage
### Un programma che simula il funzionamento di un garage
#### (Preparazione al compito)

Un Garage del centro di Bari ha a disposizione 15  posti per le auto e 10 posti per le moto.

Per legge è tenuto a registrare, per ogni veicolo ospitato, le seguenti informazioni:
- nome
- marca
- targa
- tipo (auto o moto)

Non vi è l’obbligo di mantenere le informazioni relative ai veicoli dopo che hanno lasciato il garage.

Il costo del parcheggio per le auto è di 2€ all'ora, mentre per le moto é di 1€ al giorno.
<br>Le frazioni di ora vengono arrotondate per eccesso.

Il cliente all'ingresso del garage deve chiedere se può parcheggiare. Il sistema deve rispondere con il numero dei posti disponibili. Se non ci sono posti liberi il sistema comunica il messaggio "Completo".

Si richiede un programma che implementi le seguenti funzionalità:
- Assegnare un posto ad un veicolo in arrivo;
- Liberare un posto occupato e calcolo dell’importo del parcheggio (in input viene fornito il numero di minuti di sosta);
- Ricercare informazioni relative al veicolo che occupa un determinato posto;
- Contare i posti auto e moto occupati in un determinato momento;
- Stampare l'elenco delle auto di una certa marca (in input fornire la marca richiesta).

A. Definire mediante un diagramma UML le classi che consentono di rappresentare la soluzione del problema.

B. Implementare in java le classi progettate.

C. Creare una classe Test per permettere all’utente di esercitare le funzionalità elencate visualizzando eventuali messaggi di errore.
