import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        Files.SaveToFile("arraylist10.txt", 10, false, new ArrayList<Transport>());
        Files.SaveToFile("arraylist100.txt", 100, false, new ArrayList<Transport>());
        Files.SaveToFile("arraylist1000.txt", 1000, false, new ArrayList<Transport>());
        Files.SaveToFile("arraylist10000.txt", 10000, false, new ArrayList<Transport>());
        Files.SaveToFile("arraylist100000.txt", 100000, false, new ArrayList<Transport>());

        Files.SaveToFile("linked-list10.txt", 10, false, new LinkedList<Transport>());
        Files.SaveToFile("linked-list100.txt", 100, false, new LinkedList<Transport>());
        Files.SaveToFile("linked-list1000.txt", 1000, false, new LinkedList<Transport>());
        Files.SaveToFile("linked-list10000.txt", 10000, false, new LinkedList<Transport>());
        Files.SaveToFile("linked-list100000.txt", 100000, false, new LinkedList<Transport>());

    }
}