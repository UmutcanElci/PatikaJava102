package CollectionsVeMapInterface.List.Vector;

import java.util.Iterator;
import java.util.Vector;

public class VectorLearn {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Umut");
        vector.add("Ozan");
        vector.add("124");
        vector.add("A");

        vector.add(2,"Bolu");
        vector.remove(2);
        System.out.println(vector.get(3));
        System.out.println(vector.capacity());//default capacity 10

        Iterator<String> iterator = vector.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
