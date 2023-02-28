package CollectionsVeMapInterface.MapInterfaceVeHashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapLearn {
    public static void main(String[] args) {
        Map<String,String> country = new HashMap<>();

        country.put("TR","Türkiye");//(Key,Value)
        country.put("GR","Almanya");
        country.put("EN","İngiltere");

        //System.out.println(country.get("TR"));//Get bizden key i ister ve value döner

        for (String key : country.keySet()){//Key değerlerini dönmek için keySet methodunu kullanırız
            System.out.println(key);
        }

        System.out.println("\n------------------------ \n");

        for (String value : country.values()){
            System.out.println(value);
        }//values ile de sadece values değerleri ile çalışırız


    }//MAPLER SIRALI DEĞİLDİR
}
