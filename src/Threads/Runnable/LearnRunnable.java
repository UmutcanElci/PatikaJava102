package Threads.Runnable;

public class LearnRunnable implements Runnable{
    private String name;

    public LearnRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(this.getName() + " Sayacı başladı!");
        for (int i = 0; i<100;i++){
            System.out.println(this.getName()+ " : " + i);
        }
    }
    //Thread sınıfını extend ederek kullanabiliyoruz ama o zaman sınıfımız da bir tane ata sınıfımız olur o yüzden işin içine interfaceler giriyor biz de Runnable  interface ini kullanarak yine Thread oluşturabiliyoruz

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        LearnRunnable c1 = new LearnRunnable("c1");
        LearnRunnable c2 = new LearnRunnable("c2");
        LearnRunnable c3 = new LearnRunnable("c3");

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        Thread t3 = new Thread(c3);

        t1.start();
        t2.start();
        t3.start();
    }
}
