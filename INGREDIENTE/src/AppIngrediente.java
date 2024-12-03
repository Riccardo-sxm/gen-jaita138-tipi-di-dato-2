import java.util.Scanner;

public class AppIngrediente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Descrivi l'ingrediente");
        
        System.out.println("Nome");
        String nome = sc.nextLine();

        System.out.println("Descrizione");
        String descrizione = sc.nextLine();

        System.out.println("Costo");
        Double costo = sc.nextDouble();

        System.out.println("Disponibilità");
        boolean disponibile = sc.nextBoolean();

        System.out.println("Tipologia");
        Byte tipologia = sc.nextByte();
        sc.nextLine();

        System.out.println("Allergeni");
        String allergeni = sc.nextLine();

        System.out.println("Modalità di conservazione");
        String modConservazione = sc.nextLine();

        System.out.println("Foto");
        String foto = sc.nextLine();

        
        System.out.println("Questo è l'ingrediente che hai descritto");
        System.out.println("Nome: " + nome);
        System.out.println("Descrizione: " + descrizione);
        System.out.println("Costo: " + costo + " euro");
        System.out.println("Disponibilità: " + disponibile);
        System.out.println("Tipologia: " + tipologia);
        System.out.println("Allergeni: " + allergeni);
        System.out.println("Modalità di conservazione: " + modConservazione);
        System.out.println("Foto: " + foto);


        sc.close();

    }
}
