import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class OrdersReader  {


    public static void ordersReader(ArrayList orders1) {

        boolean close = false;
        while(close != true) {


            Scanner scan = new Scanner(System.in);
            System.out.println("Lista Metod:" + "\n" + "1) Podaj łączną ilość zamówień" + "\n" +
                    "2) Wyświetl wszystkie zamówienia" + "\n" + "3) Podaj ilość zamówień klienta " +
                    "\n" + "4) Podaj łączną kwotę zamówień" + "\n" + "5) Podaj łączną kwotę zamówień klienta" +
                    "\n" + "6) Podaj listę zamówień do klienta o wskazanym identyfikatorze" + "\n" +
                    "7) Podaj średnią wartość zamówień" + "\n" +
                    "8) Podaj średnią wartość zamówienia do klienta o wskazanym identyfikatorze" + "\n"+
                    "9) ZAMKNIJ PROGRAM");
            int list = scan.nextInt();


            switch (list) {

                case 1:
                    int size = orders1.size();
                    System.out.println("Łączną ilość zamówień to :" + size);
                    break;

                case 2:

                    for (Object o : orders1) {
                        String[] ordersTable = o.toString().split(" ");
                        System.out.println("Orders{" +
                                "client_ID=" + ordersTable[0] +
                                ", request_ID=" + ordersTable[1] +
                                ", name='" + ordersTable[2] +
                                ", quantity=" + ordersTable[3] +
                                ", price=" + ordersTable[4] +
                                '}');
                    }
                    break;

                case 3:
                    int idCounter = 0;

                    System.out.println("Podaj ID klienta: ");
                    int clientIdNumber = scan.nextInt();

                    for (Object o : orders1) {

                        String[] ordersTable = o.toString().split(" ");
                        System.out.println(Arrays.toString(ordersTable));
                        int cIdString = Integer.parseInt(ordersTable[0]);
                        if (cIdString == clientIdNumber) {
                            idCounter++;
                        }
                    }
                    System.out.println("Suma zamówień klienta o Id:" + clientIdNumber + " to:" + idCounter);

                    break;
                case 4:
                    double priceSum = 0;
                    for (Object o : orders1) {
                        String[] ordersTable = o.toString().split(" ");
                        double priceOrder = Double.parseDouble(ordersTable[4]);
                        priceSum += priceOrder;
                    }
                    System.out.println("Łączna kwota zamówienia to:" + priceSum);
                    break;
                case 5:
                    double priceCounter = 0;

                    System.out.println("Podaj ID klienta: ");
                    int clientIdNumber1 = scan.nextInt();

                    for (Object o : orders1) {
                        String[] ordersTable = o.toString().split(" ");
                        int cIdString = Integer.parseInt(ordersTable[0]);
                        if (cIdString == clientIdNumber1) {
                            double priceOrder = Double.parseDouble(ordersTable[4]);
                            priceCounter += priceOrder;
                        }
                    }
                    System.out.println("Suma kosztów z zamówień klienta o Id:" + clientIdNumber1 + " to:" + priceCounter);
                    break;
                case 6:
                    int idCounter1 = 0;

                    System.out.println("Podaj ID klienta: ");
                    int clientIdNumber2 = scan.nextInt();
                    System.out.println("Lista zamówień klienta o Id:" + clientIdNumber2 + " to:");
                    for (Object o : orders1) {
                        String[] ordersTable = o.toString().split(" ");
                        int cIdString = Integer.parseInt(ordersTable[0]);
                        if (cIdString == clientIdNumber2) {
                            System.out.println(Arrays.toString(ordersTable));
                        }
                    }
                    break;

                case 7:
                    double priceAverage = 0;
                    int iCounter = 0;
                    for (Object o : orders1) {
                        String[] ordersTable = o.toString().split(" ");
                        double cIdString = Double.parseDouble(ordersTable[4]);
                        priceAverage += cIdString;
                        iCounter++;
                    }
                    ;
                    System.out.println("Średnia wartość zamówień to:" + priceAverage / iCounter);
                    break;
                case 8:
                    double priceCounterAverage = 0;
                    int iCounterAverage = 0;

                    System.out.println("Podaj ID klienta: ");
                    int clientIdNumber3 = scan.nextInt();

                    for (Object o : orders1) {
                        String[] ordersTable = o.toString().split(" ");
                        int cIdString = Integer.parseInt(ordersTable[0]);
                        if (cIdString == clientIdNumber3) {
                            double priceOrder = Double.parseDouble(ordersTable[4]);
                            priceCounterAverage += priceOrder;
                            iCounterAverage++;
                        }
                    }
                    System.out.println("Średnia kosztów z zamówień klienta o Id:" + clientIdNumber3 + " to:" + priceCounterAverage / iCounterAverage);
                    break;
                case 9:
                    close = true;
                    break;


                default:
                    System.out.println("Nie ma takiej pozycji na liscie.");

            }
        }
    }
}




