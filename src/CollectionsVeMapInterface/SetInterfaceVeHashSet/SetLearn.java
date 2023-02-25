package CollectionsVeMapInterface.SetInterfaceVeHashSet;

import java.util.HashSet;

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

        for (Integer i : hSet){
            System.out.println(i);
        }//Listeler rasgele gelir sıralı gelmezler (ama sıralanabilir 'HASH!')

    }
}
