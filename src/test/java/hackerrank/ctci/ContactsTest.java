package hackerrank.ctci;

import org.junit.Test;

import java.io.FileInputStream;

public class ContactsTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/ctci/contacts/test1.txt"));
        Contacts.main(new String[]{});
    }
}