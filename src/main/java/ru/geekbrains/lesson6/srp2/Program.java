package ru.geekbrains.lesson6.srp2;

public class Program {


    /**
     * TODO: Переработать структуру приложения Order, приложение должно соответствовать
     *  принципу SRP.
     * @param args
     */
    public static void main(String[] args) {

        Order order = new Order();
        order.inputFromConsole();
        OrderSave orderSave = new OrderSave(order, SaveType.Json);
        orderSave.saveToJson(order);

    }

}
