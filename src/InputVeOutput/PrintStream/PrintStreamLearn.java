package InputVeOutput.PrintStream;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintStreamLearn {
    public static void main(String[] args) {
        //Verilen verilei bayt yerine metin biçiminde yazmak için kullanılabilir
        try {
            PrintStream printStream = new PrintStream("patika.txt");
            printStream.print(12352343);
            printStream.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
