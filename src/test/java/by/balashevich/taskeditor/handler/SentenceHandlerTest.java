package by.balashevich.taskeditor.handler;

import by.balashevich.taskeditor.entity.BaseComponent;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SentenceHandlerTest {
    SentenceHandler sentenceHandler;

    @BeforeTest
    public void setUp() {
        sentenceHandler = SentenceHandler.getInstance();
    }

    @Test(dataProvider = "sentenceComponentData", dataProviderClass = HandlerStaticDataProvider.class)
    public void parseComponentTest(String componentData, BaseComponent expected) {
        BaseComponent actual = sentenceHandler.parseComponent(componentData);

        assertEquals(actual, expected);
    }
}