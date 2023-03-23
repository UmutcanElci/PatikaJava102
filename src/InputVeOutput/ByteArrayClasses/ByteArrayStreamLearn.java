package InputVeOutput.ByteArrayClasses;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayStreamLearn {
    public static void main(String[] args) {
        //Bir dizi girdi verisini bayt cinsiden okumak için kullanılabilir.Güvenlik işlemler itemelide kullanılırmış.
        byte[] arr = {1,2,3,4,5,23,124};
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(arr);
        System.out.println(byteArrayInputStream.read());

        System.out.println("----------------");

        String data = "Java 102 ByteStream";
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bytes = data.getBytes();
        try {
            byteArrayOutputStream.write(bytes);
            String newData =  byteArrayOutputStream.toString();
            System.out.println(newData);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
