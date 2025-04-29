package Week09.Iterator;

public class ClientForMyIterator {
    public static void main(String[] args) {
        ArrayCollection arrayCollection=new ArrayCollection();
        IArrayIterator iterator=arrayCollection.new ArrayIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
