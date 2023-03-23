package InputVeOutput.BufferedStream;

import java.io.*;

public class BufferStreamLearn {
    public static void main(String[] args) {
        //Buffer Inpute Stream Sınıfı verileri(bayt cinsiden) daha verimli okumak için diğer akışlarıyla birlikte kullanılır.
        //8192 baytlık bir dahili arabellek tutar.

        try {
            FileInputStream fileInputStream = new FileInputStream("patika.txt");
            //Genelde buffered kullanılıyor daha verimli olduğu için özellikele dosya boyutu büyük ise zorunlu olarak kullanılır.
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            int i = bufferedInputStream.read();
            while (i != -1){
                System.out.println((char) i);
                i = bufferedInputStream.read();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        try {
            String data = "Java 102 Buffer";
            FileOutputStream fileOutputStream = new FileOutputStream("patika.txt");
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            byte[] bytes = data.getBytes();

            bufferedOutputStream.write(bytes);
            bufferedOutputStream.close();
            fileOutputStream.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
