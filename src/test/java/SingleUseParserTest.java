import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SingleUseParserTest {

    @Test
    public void testParse() throws Exception {
        SingleUseParser singleUseParser = new SingleUseParser("some xml");
        Object expectedParsed = "some xml";

        Object parsed = singleUseParser.parse();

        assertEquals(expectedParsed, parsed);
    }
}