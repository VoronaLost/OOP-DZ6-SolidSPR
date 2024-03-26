package dz6;

public class OrderCreator {
    public Order orderCrator(){
        Prompt prompt = new Prompt();
        String clientName = prompt.prompt("Client name: ");
        String product = prompt.prompt("Product: ");
        int qnt = Integer.parseInt(prompt.prompt("Quantity: "));
        int price = Integer.parseInt(prompt.prompt("Price: "));
        return new Order(clientName, product, qnt, price);

    }
}
