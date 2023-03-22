package InputVeOutput.FileClass.FileInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInputStreamLearn {
    public static void main(String[] args) {
        try {
            File f = new File("patika.txt");
            FileInputStream fileInputStream = new FileInputStream(f);//Dosyalardan verileri bayt cinsinden okumak için kullanılır.
            //System.out.println(fileInputStream.read());//Dosyalardaki verileri byte byte okuduğu için eğer biz read fonksiyonunu çağırırsak bize byte değerini döner.
            int i = fileInputStream.read();
            while (i != 1){
                //Eğer dosyanın içi boşda bize -1 değerini döndürür değilse...
                System.out.println((char) i);
                i = fileInputStream.read();
                //Her seferinde i yani byte değerlerini char a dönüştürüp teker yeni i değerlerini çağırıyoruz bu dosyadaki verileri yazdırmanın yöntemlerinden biri.
            }
            fileInputStream.close();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }

    }
}
