package animal_kingdom.massai;

import animal_kingdom.OrderStatus;

public class Order {

    OrderStatus status;
    int orderId;

    public Order(int id,OrderStatus status){
        this.orderId=id;
        this.status=status;
    }

public  void printStatus(){
    System.out.println("orderid : "+orderId+" is "+status);
}

}
