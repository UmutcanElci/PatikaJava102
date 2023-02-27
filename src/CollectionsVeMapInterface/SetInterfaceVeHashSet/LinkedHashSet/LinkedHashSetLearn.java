package CollectionsVeMapInterface.SetInterfaceVeHashSet.LinkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetLearn {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lSet = new LinkedHashSet<>();
        lSet.add(10);
        lSet.add(20);
        lSet.add(10);
        lSet.add(45);

        Iterator<Integer> iterator = lSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
