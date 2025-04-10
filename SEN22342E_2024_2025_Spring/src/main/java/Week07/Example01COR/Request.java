/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week07.Example01COR;

/**
 *
 * @author ali.nizam
 */
public class Request {

  String context;
  int code;
  int day;

    public Request(int day) {
        this.day = day;
    }
  

  public Request(String context, int code) {
    this.context = context;
    this.code = code;
  }

}