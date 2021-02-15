package MyJavaIO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {
    private static final String TEST_PATH = "E:\\WenProject\\DesignPattern\\DecoratorPattern\\src\\MyJavaIO\\test.txt";

    public static void main(String[] args) {
        int c;

        try{
            InputStream in =
                    new LowerCaseInputStream(
                            new BufferedInputStream(
                                    new FileInputStream(TEST_PATH)));
            while ((c = in.read()) >= 0) {
                System.out.print((char) c);
            }

            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
