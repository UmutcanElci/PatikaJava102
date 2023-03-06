package CollectionsVeMapInterface.SetInterfaceVeHashSet;

import java.util.HashSet;
import java.util.Iterator;

public class SetLearn {
    //Set ınterface i collection interface inden kalıtım alır, aynı elemanların veri kümesi içerisinde tekrar bulunmasına izin vermez!
    //int arr = 1,3,3,4,5,6,6 convert to  Set = 1,3,4,5,6

    //Mesela algoritma sorularında tekrar eden verileri silmek için kullanılabilir
    public static void main(String[] args) {
       HashSet<Integer> hSet =new HashSet<>();//Boyutu veri eklendikce genişler
        hSet.add(12);
        hSet.add(15);
        hSet.add(35);
        hSet.add(71);

        System.out.println(hSet.isEmpty());
        System.out.println(hSet.contains(12));
        System.out.println(hSet.size());
        //Hash in değerleri hep değiştiğinden verilere index ile ulaşılamaz
        //Silme arama vb.. işlemler için direk değerin kendisi aranır indexi aranamaz
        System.out.println(hSet.remove(71));
        for (Integer i : hSet){
            System.out.println(i);
        }//Listeler rasgele gelir sıralı gelmezler (ama sıralanabilir 'HASH!')

        System.out.println("----------------------------");
        System.out.println("Iterator");

        Iterator<Integer> iterator = hSet.iterator();//Iterator da veriler üzerinden gezinmemizi sağlar şu an için bu yeterli
        while (iterator.hasNext()){//Başta 0 değeri vardır diğer değere bakar eğer boş değilse ona geçer
            System.out.println(iterator.next());//hasNext methodu ile bir döngüle girer
        }

    }
}
