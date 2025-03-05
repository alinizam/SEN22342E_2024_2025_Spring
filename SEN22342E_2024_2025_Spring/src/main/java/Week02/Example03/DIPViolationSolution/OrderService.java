/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week02.Example03.DIPViolationSolution;

/**
 *
 * @author ali.nizam
 */
class OrderService {
    private IDatabase database;

    public OrderService(IDatabase database) {
        this.database=database; 
    }

    public void placeOrder(String order) {
        System.out.println("Placing order: " + order);
        database.saveOrder(order);
    }
}
