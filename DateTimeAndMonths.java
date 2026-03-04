import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DateTimeAndMonths {

    public static void main(String[] args) {

       
        LocalDateTime dateTime = LocalDateTime.now();

       
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        
        System.out.println("Formatted Date & Time:");
        System.out.println(dateTime.format(formatter));


        
        System.out.println("\nMonths and number of days (Non-Leap Year):");

        for (Month month : Month.values()) {
            System.out.println(month + " : " + month.length(false) + " days");
        }
    }
}
