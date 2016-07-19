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
    public void test2() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/whats-next/test2.txt"));
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
        System.out.println(Integer.parseInt("011100", 2));
        System.out.println(Integer.parseInt("100011", 2));
        System.out.println(Integer.parseInt("100101", 2));
        System.out.println(Integer.parseInt("100110", 2));
        System.out.println(Integer.parseInt("101001", 2));
        System.out.println(Integer.parseInt("101010", 2));
    }
}