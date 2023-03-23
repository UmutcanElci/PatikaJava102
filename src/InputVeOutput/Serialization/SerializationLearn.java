package InputVeOutput.Serialization;

import java.io.*;

public class SerializationLearn {
    public static void main(String[] args) {
        //Serialization mesela bir proje üstünde oluşturduğumuz nesnenin değerleri ile beraber bir dosyaya atıp daha sonra o dosyadan okuma ihtiyaçlarını gerçekleştirebilir.
        //Geri okuma kısmında o dosyanın hangi sınıfa ait olduğunu bilemeyiz işte o sırada Serialization API dediğimiz yapı bize yardım eder.
        //Şimdi verileri dışarı aktarmak için bir output işlemine ihtiyaç duyarız.
        Car c1 = new Car("Mercedes","M3");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("patika.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(c1);
            objectOutputStream.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        try {
            FileInputStream fileInputStream = new FileInputStream("patika.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            c1 = (Car) objectInputStream.readObject();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
