

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileLoader {


    public static List<Orders> loadFile(String fileName) {
        ArrayList<Orders> listOfOrders = new ArrayList();
        Path pathToFile = Paths.get(fileName);
        try {

            BufferedReader br = Files.newBufferedReader(pathToFile);

            String line = br.readLine();


            while (line != null) {

                String[] attributes = line.split(",");

                if (checkOrders(attributes) == true) {
                    Orders order = createObject(attributes);

                    if (order != null) {
                        listOfOrders.add(order);
                    }
                }

                line = br.readLine();
            }


        } catch (IOException e) {
            System.out.println("Format error occured.");
            e.printStackTrace();
        }
        return listOfOrders;
    }


    public static Orders createObject(String[] metaData) {
        try {
            int client_ID = Integer.parseInt(metaData[0]);
            int request_ID = Integer.parseInt(metaData[1]);
            String name = metaData[2];
            int quantity = Integer.parseInt(metaData[3]);
            double price = Double.parseDouble(metaData[4]);
            return new Orders(client_ID, request_ID, name, quantity, price);
        } catch (NumberFormatException e) {
            System.out.println("Plik zawiera zamówienie w złym formacie(createOrders)!");
            return null;
        }

    }

    private static boolean checkOrders(String[] metaData) {

            if (metaData[0].matches("[0-9]{1,6}")
                    &&
                    metaData[1].matches("[0-9]{1,999}")
                    &&
                    metaData[2].matches("[0-9A-Z a-z]{0,255}")
                    &&
                    metaData[3].matches("[0-9]{1,9999}")
                    &&
                    metaData[4].matches("[0-9]{0,999}[.][0-9]{2}")
                    )
            {
                return true;
            }
            else {
                System.out.println("Zamowienie zawiera nieprawidłowy format (checkOrders).");
                return false;
             }

    }





}











