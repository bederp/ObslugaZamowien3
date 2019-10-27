
import java.time.ZonedDateTime;
import java.util.ArrayList;


public class ObslugaZamowien3 {
    public static void main(String[] args) {

        ArrayList<Orders> listOfOrdersFinal = (ArrayList<Orders>) FileLoader.loadFile("file.csv");
        OrdersReader.ordersReader(listOfOrdersFinal);





    }
    }



