package by.balashevich.taskeditor.handler;

import by.balashevich.taskeditor.entity.BaseComponent;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ParagraphHandlerTest {
    ParagraphHandler paragraphHandler;

    @BeforeTest
    public void setUp() {
        paragraphHandler = ParagraphHandler.getInstance();
    }

    @Test(dataProvider = "paragraphComponentData", dataProviderClass = HandlerStaticDataProvider.class)
    public void testParseComponent(String componentData, BaseComponent expected) {
        BaseComponent actual = paragraphHandler.parseComponent(componentData);

        assertEquals(actual, expected);
    }
}