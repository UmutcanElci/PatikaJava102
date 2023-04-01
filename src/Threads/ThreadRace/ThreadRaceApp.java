package Threads.ThreadRace;

import java.util.ArrayList;
import java.util.List;
//Multi Threading
public class ThreadRaceApp implements Runnable{
    List<Integer> evenList = new ArrayList<>();
    List<Integer> oddList = new ArrayList<>();
    List<Integer> numbers1 = new ArrayList<>();
    List<Integer> numbers2 = new ArrayList<>();
    List<Integer> numbers3 = new ArrayList<>();
    List<Integer> numbers4= new ArrayList<>();

    @Override
    public void run() {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i<10001;i++){
            list.add(i);
        }

        for (int j = 0; j<10001;j++){
            if (j<list.size()/4){
                numbers1.add(j);
            } else if (j<list.size()/2) {
                numbers2.add(j);
            } else if (j<list.size()*3/4) {
                numbers3.add(j);
            }else {
                numbers4.add(j);
            }
        }

        if (Thread.currentThread().getName().equals(("Thread-0"))){
            for (Integer nums : numbers1){
                evenOrOdd(nums);
            }
        }
        if (Thread.currentThread().getName().equals(("Thread-1"))){
            for (Integer nums : numbers2){
                evenOrOdd(nums);
            }
        }
        if (Thread.currentThread().getName().equals(("Thread-2"))){
            for (Integer nums : numbers3){
                evenOrOdd(nums);
            }
        }
        if (Thread.currentThread().getName().equals(("Thread-3"))){
            for (Integer nums : numbers4){
                evenOrOdd(nums);
            }
        }
    }

    synchronized void evenOrOdd(int num){
        if (num%2 == 0){
            evenList.add(num);
        }else {
            oddList.add(num);
        }
    }

    public static void main(String[] args) {

        Thread t1 = new Thread(new ThreadRaceApp());//Thread-0
        Thread t2 = new Thread(new ThreadRaceApp());//Thread-1
        Thread t3 = new Thread(new ThreadRaceApp());//Thread-2
        Thread t4 = new Thread(new ThreadRaceApp());//Thread-3

        t1.start();
        t2.start();
        t3.start();
        t4.start();


    }
}
