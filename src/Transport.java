import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Transport
{
    private String brand;
    private String ID;
    private Radio radio;

    public String getBrand()
    {
        return brand;
    }

    public String getID() {return ID;}

    public void setID(String value)
    {
        this.ID = value;
    }

    public Radio getRadio()
    {
        return radio;
    }

    public Transport(String brand, String ID, Radio radio)
    {
        this.brand = brand;
        this.ID = ID;
        this.radio = radio;
    }

    public Transport(String brand, int id, Radio radio)
    {
        this.brand = brand;
        this.radio = radio;
    }

    Scanner in = new Scanner(System.in);

    public String toString()
    {
        return "Марка машины: " + this.getBrand() + " Номер: " + this.getID() + " Текущее радио: " + this.getRadio().getStation();
    }

    public void PlayTunes()
    {
        if(this.radio.getPlay() == true)
        {
            System.out.println("Радио включено. Если хотите выключить нажмите 0, в противном случае - 1. Введите число:");

            try {
                switch (in.nextInt()) {
                    case 0:
                        this.radio.setPlay(false);
                        System.out.println("Радио выключено.");
                        break;
                    case 1:
                        System.out.println("Радио продолжает свою работу!");
                        break;
                    default:
                        System.out.println("Ошибка выбора операции.Сделайте выбор и введите номер операции!");
                }

            }
            catch (Exception e)
            {
                System.out.println("Ошибка выбора операции.Сделайте выбор и введите номер операции!");
            }
        }

        else if(!this.radio.getPlay())
        {
            System.out.println("Радио выключено. Если хотите включить нажмите 1, в противном случае - 0");

            try {
                switch (in.nextInt()) {
                    case 0:
                        System.out.println("Радио остается выключенным.");
                        break;
                    case 1:
                        this.radio.setPlay(true);
                        System.out.println("Радио включено!");
                        break;
                    default:
                        System.out.println("Ошибка выбора операции.Сделайте выбор и введите номер операции!");
                }

            }
            catch (Exception e)
            {
                System.out.println("Ошибка выбора операции.Сделайте выбор и введите номер операции!");
            }
        }
    }

    public void Move()
    {
        System.out.println("Машина проехала через пропускной пункт");
    }

    public static ArrayList<Transport> NewArrayList()
    {
        return new ArrayList<Transport>();
    }

    public static void TestArrayList(int count, ArrayList<Transport> transports) throws IOException {
        long _addtime = 0;
        Date.StartgetDate();
        for(int i = 0; i < count; i++)
        {
            long time = System.nanoTime();
            Transport transport = new Transport("ghfdgdf", i+1, new Radio("gfdgdfg", true));
            transports.add(transport);
            long time1 = System.nanoTime() - time;
            _addtime += time1;
            System.out.printf("ADD, ID = " + (i+1) + " " + time1/1_000_000.0 + "ms");
        }
        System.out.println("addTotalTime: " + _addtime/(1000000.0) + " ms");
        System.out.println("addMedianTime: " + _addtime/(1000000.0*count) + " ms");
        Date.FinishgetDate();

    }


}
