import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AppCliente {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Descrivi il tuo cliente preferito");

        System.out.println("Nome");
        String nome = sc.nextLine();

        System.out.println("Cognome");
        String cognome = sc.nextLine();

        System.out.println("Data di Nascita");
        String dataNascitaStr = sc.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataNascita = LocalDate.parse(dataNascitaStr, formatter);

        System.out.println("Numero di Telefono");
        String nTelefono =sc.nextLine();

        System.out.println("Note");
        String note = sc.nextLine();

        System.out.println("E-mail");
        String email = sc.nextLine();

        System.out.println("Password");
        String password = sc.nextLine();

        System.out.println("Username");
        String username = sc.nextLine();

        System.out.println("Data e ora di iscrizione");
        String dataOraIscrizioneStr = sc.nextLine();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime dataOraIscrizione = LocalDateTime.parse(dataOraIscrizioneStr, dateTimeFormatter);

        sc.close();

        System.out.println("Nome: " + nome);
        System.out.println("Cognome: " + cognome);
        System.out.println("Data di Nascita: " + dataNascita);
        System.out.println("Numero di telefono: " + nTelefono);
        System.out.println("Note: " + note);
        System.out.println("E-mail: " + email);
        System.out.println("Password: " + password);
        System.out.println("Username: " + username);
        System.out.println("Data e ora di iscrizione: " + dataOraIscrizione);



    }
}
