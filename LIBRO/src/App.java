import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dammi un valore intero");
        int userValue = sc.nextInt();

        System.out.println("Hai inserito: " + userValue);

        System.out.println("Dammi un colore");
        String colore = sc.nextLine();

        System.out.println("Hai inserito: " + colore)



        sc.close();


    }
}
