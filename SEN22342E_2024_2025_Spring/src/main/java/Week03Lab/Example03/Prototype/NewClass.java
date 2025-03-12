/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week03Lab.Example03.Prototype;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ali.nizam
 */
class Book implements Cloneable{
    private String title;
    private List<String> authors;

    public String getTitle() {
        return title;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public Book(String title, List<String> authors) {
        this.title = title;
        this.authors = authors;
    }

    @Override
    protected Object clone()  {
        try {
            Book o=(Book)super.clone();
            o.authors=new ArrayList<>(authors);
            return o; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
