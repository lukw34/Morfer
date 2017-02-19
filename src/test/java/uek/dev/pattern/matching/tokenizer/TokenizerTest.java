package uek.dev.pattern.matching.tokenizer;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import uek.dev.pattern.matching.services.parser.Parser;
import uek.dev.pattern.matching.services.tokenizer.Tokenizer;

public class TokenizerTest {
    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @Test
    public void verify() {
        Tokenizer tokenizer = new Tokenizer("ala:s5 + ala:s6 + ala:s6 +  ala:s6 + ala:s6 + ala:sl", new Parser());
    }
}