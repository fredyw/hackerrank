package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class WhatsNextTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/whats-next/test1.txt"));
        WhatsNext.main(new String[]{});
    }

    @Test
    public void test() {
        int a = 0;
        for (int i = 0; i < 5; i++) {
            a <<= 1;
            a |= 1;
        }
        System.out.println(Integer.toBinaryString(a));
        for (int i = 0; i < 3; i++) {
            a <<= 1;
        }
        System.out.println(Integer.toBinaryString(a));
    }
}