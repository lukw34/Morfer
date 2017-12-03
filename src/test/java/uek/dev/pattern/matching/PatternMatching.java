package uek.dev.pattern.matching;


import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import uek.dev.pattern.matching.services.MorferPatternMatcher;
import uek.dev.pattern.matching.services.PatternMatcher;


import static org.junit.Assert.assertEquals;


public class PatternMatching {
    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    private static  PatternMatcher patternMatcher;

    @BeforeClass
    public static void setUp() {
        patternMatcher = new MorferPatternMatcher();
    }

    @Test
    public void case1() {
        String pattern = "Ala  > kot:s2 > !kot:s2";
        String entry = "Ala ma kota.";
        boolean result = patternMatcher.match(entry, pattern);
        assertEquals(true, result);
    }

    @Test
    public void case2() {
        String pattern = "Ala  > kot:s2 > kot:s2";
        String entry = "Ala ma kota.";
        boolean result = patternMatcher.match(entry, pattern);
        assertEquals(false, result);
    }

    @Test
    public void case3() {
        String pattern = "Ala + Al + !Al ";
        String entry = "Ala ma kota.";
        boolean result = patternMatcher.match(entry, pattern);
        assertEquals(true, result);
    }

    @Test
    public void case4() {
        String pattern = "Ala";
        String entry = "Ala ma kota.";
        boolean result = patternMatcher.match(entry, pattern);
        assertEquals(true, result);
    }

    @Test
    public void fix1() {
        String pattern = "Ala";
        String entry = "Ala miała kota i dużo wczoraj lam.";
        boolean result = patternMatcher.match(entry, pattern);
        assertEquals(true, result);
    }
}