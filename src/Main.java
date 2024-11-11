import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        //in questo caso può essere utilizzato il metodo LONG per stampare in console quanto l'esercizio ci chiede
        String dataString = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        System.out.println("Formato data richiesto: " + dataString);

    }
}