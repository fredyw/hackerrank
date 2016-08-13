package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class ACMICPCTeamTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/acm-icpc-team/test1.txt"));
        ACMICPCTeam.main(new String[]{});
    }
}