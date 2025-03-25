/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week04Lab.Example02;

/**
 *
 * @author ali.nizam
 */
public class Client {
    public static void main(String[] args) {
        WebPage page=new Contact(new TranslateTurkish());
        page.sayCurrentLang();
        WebPage page1=new Home(new TranslateEnglish());
        page1.sayCurrentLang();
    }
    
    
}
