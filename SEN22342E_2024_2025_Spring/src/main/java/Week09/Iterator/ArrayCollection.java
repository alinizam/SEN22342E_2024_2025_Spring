package Week09.Iterator;


public class ArrayCollection  {
    String array[]={"Ahmet", "Mehmet","Fatma"};

    class ArrayIterator implements IArrayIterator{
        int index=0;
        @Override
        public boolean hasNext() {
            return index<array.length;
        }
        @Override
        public Object next() {
            if (!hasNext()) return null;
            return array[index++];
        }
    }


}
