package dz6;

public class Program {
    public static void main(String[] args) {
        SaveToFile saveToFile = new SaveToFile();
        System.out.println("Введите заказ:");
        Order order = new OrderCreator().orderCrator();
        saveToFile.saveToJson(order);
    }

    

}
