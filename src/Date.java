import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Date
{
    public static String StartgetDate()
    {
        return "Start program: " + LocalDate.now() + " " + LocalTime.now().format(DateTimeFormatter.ofPattern("H:mm:ss"));
    }

    public static String FinishgetDate()
    {
        return "Finish program: " + LocalDate.now() + " " + LocalTime.now().format(DateTimeFormatter.ofPattern("H:mm:ss"));
    }
}
