public class Orders {


    int client_ID;
    int request_ID;
    String name;
    int quantity;
    double price;


    public Orders(int client_ID, int request_ID, String name, int quantity, double price) {
            this.client_ID = client_ID;
            this.request_ID = request_ID;
            this.name = name;
            this.quantity = quantity;
            this.price = price;

    }

    public int getClient_ID() {
        return client_ID;
    }

    public void setClient_ID(int client_ID) {
        this.client_ID = client_ID;
    }

    public int getRequest_ID() {
        return request_ID;
    }

    public void setRequest_ID(int request_ID) {
        this.request_ID = request_ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return  client_ID + " "+  request_ID + " " +  name + " " + quantity + " " + price ;
    }

    }


