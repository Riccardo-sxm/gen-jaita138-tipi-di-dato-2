import java.util.Scanner;

public class AppLibro {

     public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Crea il tuo libro personalizzato");
        
        System.out.println("Titolo");
        String titolo = sc.nextLine();

        System.out.println("Autore");
        String autore = sc.nextLine();

        System.out.println("Genere");
        String genere = sc.nextLine();

        System.out.println("Numero pagine");
        short numPagine = sc.nextShort();

        System.out.println("Numero copie");
        short numCopie = sc.nextShort();
        sc.nextLine();

        System.out.println("Lingua");
        String lingua = sc.nextLine();

        System.out.println("Posizione");
        String posizione = sc.nextLine();

        System.out.println("Anno pubblicazione");
        short annoPubblicazione = sc.nextShort();
        sc.nextLine();

        System.out.println("ISBN");
        String isbn = sc.nextLine();







        sc.close();


        System.out.println("Il libro che hai definito");
        System.out.println("Titolo: " + titolo);
        System.out.println("Autore: " + autore);
        System.out.println("Genere: " + genere);
        System.out.println("Numero pagine: " + numPagine);
        System.out.println("Numero copie: " + numCopie);
        System.out.println("Lingua: " + lingua);
        System.out.println("Posizione: " + posizione);
        System.out.println("Anno pubblicazione: " + annoPubblicazione);
        System.out.println("ISBN: " + isbn);

     }
}