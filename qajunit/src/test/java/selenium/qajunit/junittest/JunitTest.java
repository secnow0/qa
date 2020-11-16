package selenium.qajunit.junittest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static com.google.common.truth.Truth.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class JunitTest {
    private static final String slowo = "testowe";
    @DisplayName("Junit tests")
    @Test
    public void firstJunitTest(){
        assertTrue(5 == 2+3,"SUPER");

        assertTrue(slowo.contains("test"));
        assertEquals(slowo,"testowe");
    }
    @DisplayName("Junit tests 2")
    @Test
    public void secondJunitTest(){
        assertTrue(5==3+2);
    }
    @DisplayName("Google truth test")
    @Test
    public void googleTruthTest(){
        assertThat(slowo).contains("test");
    }
    @DisplayName("Zadanie")
    @Test
    public void zad1(){
        String resultString = "Wordpress powers 100% of the internet";
        String expectedString = "Wordpress powers [number]% of the internet";
        assertThat(resultString.startsWith("Wordpress powers ")|resultString.endsWith("% of the internet"));
    }

    @Test
    public void listTest(){
        List<Integer> result = Arrays.asList(1,2,3,4,5);
        List<Integer> expected = Arrays.asList(3,4,5);

        assertThat(result).containsAnyIn(expected);
        assertTrue(result.containsAll(expected));
        assertThat(result).hasSize(5);

    }
}
