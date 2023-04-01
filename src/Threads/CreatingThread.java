package Threads;

public class CreatingThread extends Thread {
    public static void main(String[] args) {
        //O an çalışan thread in ismi
        System.out.println(Thread.currentThread().getName());
        /*
        Bu maliyetli nesneler ilk başta belli bir miktarda yaratılır ve hazır durumda olacak şekilde havuza konulur.
        Thread ihtiyacı olanlar bu havuzdan bir Thread’i kullanır ve sisteme geri iade eder. Böylece, performans kazancı yanı sıra kaynak kullanımı da iyi bir hale getirilir.
         */

        Thread thread = new Thread();
        thread.start();
        
        /*
        Böylece, iş parçacığımız işini bitirene kadar çalışmaya devam edecektir. Fakat, yukarıdaki örnekte iş parçacığının çalıştıracağı bir kod parçası vermedik. Bunu verebilmenin iki yolu vardır.
“Thread” sınıfından kalıtım alan bir alt sınıf yaratıp, onun “run” fonksiyonunu override (ezme) etmek gerekir.
“Runnable” interface’den kalıtım alan bir alt sınıf yaratmak ve “run” fonksiyonunu override etmek, ardından “Thread” sınıfının kurucusuna nesne olarak göndermek.
         */


    }
}
