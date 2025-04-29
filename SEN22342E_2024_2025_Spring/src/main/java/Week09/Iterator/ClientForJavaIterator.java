package Week09.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ClientForJavaIterator {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Ahmet");
        names.add("Ak");
        names.add("Kemal1");
        names.add("Kemal2");
        for (String name:names){
            System.out.println(name);
        }
        Iterator<String> iterator=names.iterator();
        while (iterator.hasNext()){
            if (iterator.next().equals("Ahmet"))
                iterator.remove();
        }
        for (String name:names){
            System.out.println(name);
        }
        System.out.println("-----------------------");
        ListIterator<String> listIterator=names.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
        System.out.println("--------------------");
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }
    }
}
