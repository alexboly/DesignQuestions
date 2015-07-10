import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultiUseParserTest {

    MultiUseParser multiUseParser;

    @Before
    public void setUp(){
        this.multiUseParser = new MultiUseParser();
    }

    @Test
    public void parses() throws Exception {
        assertEquals("some xml", multiUseParser.parse("some xml"));
    }
}