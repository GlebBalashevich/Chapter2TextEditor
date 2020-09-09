package by.balashevich.taskeditor.handler;

import by.balashevich.taskeditor.entity.BaseComponent;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TextHandlerTest {
    TextHandler textHandler;

    @BeforeTest
    public void setUp() {
        textHandler = TextHandler.getInstance();
    }

    @Test(dataProvider = "textComponentData", dataProviderClass = HandlerStaticDataProvider.class)
    public void testParseComponent(String componentData, BaseComponent expected) {
        BaseComponent actual = textHandler.parseComponent(componentData);
        assertEquals(actual, expected);
    }
}