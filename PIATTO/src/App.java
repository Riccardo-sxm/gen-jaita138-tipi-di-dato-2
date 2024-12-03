import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Descrivi il piatto forte del tuo ristorante");
        
        System.out.println("Nome");
        String nome = sc.nextLine();

        System.out.println("Descrizione");
        String descrizione = sc.nextLine();

        System.out.println("Prezzo");
        Double prezzo = sc.nextDouble();

        System.out.println("Disponibile");
        boolean disponibile = sc.nextBoolean();
        sc.nextLine();

        System.out.println("Tipologia");
        String tipologia = sc.nextLine();
        

        System.out.println("Allergeni");
        String allergeni = sc.nextLine();

        System.out.println("Foto");
        String foto = sc.nextLine();

        System.out.println("Calorie");
        short calorie = sc.nextShort();
        sc.nextLine();

        System.out.println("Variazioni");
        String variazioni = sc.nextLine();

        sc.close();


        System.out.println("Il piatto che hai descritto");
        System.out.println("Nome: " + nome);
        System.out.println("Descrizione: " + descrizione);
        System.out.println("Prezzo: " + prezzo + " euro");
        System.out.println("Disponibile: " + disponibile);
        System.out.println("Tipologia: " + tipologia);
        System.out.println("Allergeni: " + allergeni);
        System.out.println("Foto: " + foto);
        System.out.println("Calorie: " + calorie);
        System.out.println("Variazioni: " + variazioni);

    }
}
