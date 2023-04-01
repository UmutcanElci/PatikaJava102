package Threads.SleepAndStop;

public class CounterEx implements Runnable{
    private String name;

    public CounterEx(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(this.getName() + " Çalışıyor!");
        for (int i = 0; i<100; i++){
            System.out.println(i);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new CounterEx("c1"));
        t1.start();
    }
}
