package InputVeOutput.InputStreamReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class InputStreamReaderLearn {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("patika.txt");
            InputStreamReader in = new InputStreamReader(fileInputStream);
            System.out.println(in.getEncoding());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
