package InputVeOutput.FileClass;

import java.io.File;
import java.io.IOException;

public class FileLearn {
    public static void main(String[] args){
        //Basitçe bizim dosya oluşturmamıza ve dosyalar üzerinden işlem yapmamızı sağlayan bir sınıf.

        File f = new File("patika.txt");//Dosya sınıfını çağırdık ve dosya sınıfı bizden dosyanın ismini istedi.
        //f.createNewFile();//Dosyayı oluşturmak için kullanılan fonksiyon.

        try {
            if (f.createNewFile()){
                System.out.println(f.getName() + " Dosyası oluşturuldu !");
            }else {
                System.out.println("Dosya zaten mevcuttur!");
            }
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }

        

    }
}
