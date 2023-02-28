package CollectionsVeMapInterface.List.LinkedList.Queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueLearn {//Queue kuyruk demek ilk giren ilk alır FİFO(First in First out)

    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();//Polymorphism
        q.add("Mustafa");
        q.add("A");
        q.add("umut");
        q.add("B");

        q.offer("C");//add ile aynı işlevi görüyor tek farkı eğer hata alırsak değeri null olarak ekleyip exception dönüyor
        System.out.println(q.peek());//Queue daki ilk değeri döner
        Iterator<String> iterator = q.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

}
