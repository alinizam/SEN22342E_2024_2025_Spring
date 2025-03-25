/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week05.ChainOfResponsibility;

/**
 *
 * @author ali.nizam
 */
public class Client {

    public static void main(String[] args) {
        WebHandler chain = new WebHandlerBetween100_500(
                                      new WebHandlerBetween100_500(
                                             new WebHandlerHigherThan500(
                                                     new WebHandlerLessThan100(null)
                                             )
                                      )
        );
        chain.handleRequest(new Request("Something", 50));
    }
}
