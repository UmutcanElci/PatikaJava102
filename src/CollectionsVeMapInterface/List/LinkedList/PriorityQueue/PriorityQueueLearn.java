package CollectionsVeMapInterface.List.LinkedList.PriorityQueue;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueLearn {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        priorityQueue.add(5);
        priorityQueue.add(562);
        priorityQueue.add(23);
        priorityQueue.add(62);
        
        for (Integer q : priorityQueue){
            System.out.println(q);
        }
    }
}
