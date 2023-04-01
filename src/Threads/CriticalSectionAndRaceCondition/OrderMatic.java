package Threads.CriticalSectionAndRaceCondition;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/*
Bir iş parçacığı kaynağı kullanıyorken diğerleri onu beklemelidirler. İşte birden fazla iş parçacığının kullandığı bu paylaşımlı
ortak alanlara “Critical Sections” adı verilmektedir. Buna en güzel örnek bir değişkenin değerinin değiştirilmesidir. Çünkü, değişkenin değerinin değişmesi demek hafıza bölgesinde
bir değişim yapmak demektir. Böyle ortak bir kaynağı kullanan Thread’ler okuma ve yazma yaparken bu “Critical Section”’a sırayla erişmeleri gerekir.


 */
public class OrderMatic implements Runnable{
    private int orderNo;
    private final Object LOCK = new Object();
    public OrderMatic() {
        this.orderNo = 1;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        synchronized (LOCK) {//Threadlerin sekron olmasına yani değerlerinin tekrar etmesine engel olur!
            System.out.println(Thread.currentThread().getName() + " - Order No:" + this.getOrderNo());
            this.orderNo++;
        }

    }

    public int getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }


    public static void main(String[] args) throws InterruptedException {
     OrderMatic orderMatic = new OrderMatic();
        List<Thread> threads = new ArrayList<>();

        for (int i = 0; i<100 ;i++){
            Thread t = new Thread(orderMatic);
            threads.add(t);
            t.start();//İşlemler sırayla çalışıyor fakat threadler üst üste binebiliyor yani aynı değerleri alabiliyolar-- Örnek müşteriler aynı anda aynı eşyayı satın aldı bu farklı thread üzerinden aynı değeri dönebiliyor vebiz bunu istemiyoruz

        }


    }
}
