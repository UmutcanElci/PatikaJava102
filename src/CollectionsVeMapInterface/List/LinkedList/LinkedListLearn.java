package CollectionsVeMapInterface.List.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListLearn {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("Mustafa");
        list.add("umut");
        list.add("102");
        list.add("Java");
        list.remove("umut");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
