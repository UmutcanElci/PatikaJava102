package CollectionsVeMapInterface.List.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListLearn {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();//Sıralı bir yapıya sahiptir boyutunu kendisi 10 olarak ayarlar eğer fazla bir değer girilirse boyutunu 2 katına çıkartır
        list.add(10);
        list.add(1);
        list.add(4);
        list.add(6);
        list.add(null);
        //System.out.println(list);
        Iterator<Integer> iterator = list.iterator();
        list.set(3,15);
        list.remove(0);
        System.out.println(list.indexOf(4));
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
