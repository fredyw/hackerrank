package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class ContactsTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/contacts/test1.txt"));
        hackerrank.ctci.Contacts.main(new String[]{});
    }

    @Test
    public void test2() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/contacts/test2.txt"));
        hackerrank.ctci.Contacts.main(new String[]{});
    }
}