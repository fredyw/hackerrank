package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

// abba
// a|0,0| a|3,3|
// b|1,1| b|2,2|
// ab|0,1| ab|2,3|
// abb|0,2| abb|1,3|
// 4
//
// abcd
// 0
//
// ifailuhkqq
// i|0,0| i|3,3|
// q|8,8| q|9,9|
// afi|0,2| afi|1,3|
// 3
//
// hucpoltgty
// t|6,6| t|8,8|
// gt|6,7| gt|7,8|
// 2
//
// ovarjsnrbf
// r|3,3| r|7,7|
// jnrs|3,6| jnrs|4,7|
// 2
//
// pvmupwjjjf
// p|0,0| p|4,4|
// j|6,6| j|7,7|
// j|6,6| j|8,8|
// j|7,7| j|8,8|
// jj|6,7| jj|7,8|
// mpuv|0,3| mpuv|1,4|
// 6
//
// iwwhrlkpek
// w|1,1| w|2,2|
// k|6,6| k|9,9|
// ekp|6,8| ekp|7,9|
// 3
public class SherlockAndAnagramsTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/sherlock-and-anagrams/test1.txt"));
        SherlockAndAnagrams.main(new String[]{});
    }

    @Test
    public void test2() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/sherlock-and-anagrams/test2.txt"));
        SherlockAndAnagrams.main(new String[]{});
    }
}