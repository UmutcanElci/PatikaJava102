package InputVeOutput.FileClass.FileOutputStream;
import java.io.FileOutputStream;
public class FileOutputStreamLearn {
    public static void main(String[] args) {
        String words = "Output Stream Learn\n";
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("patika.txt",true);
            byte[] wordsByte = words.getBytes();
            fileOutputStream.write(wordsByte);
            fileOutputStream.close();

            } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
