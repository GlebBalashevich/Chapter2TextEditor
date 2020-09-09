package by.balashevich.taskeditor.handler;

import by.balashevich.taskeditor.entity.BaseComponent;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LexemeHandlerTest {
    LexemeHandler lexemeHandler;

    @BeforeTest
    public void setUp() {
        lexemeHandler = LexemeHandler.getINSTANCE();
    }

    @Test(dataProvider = "lexemeComponentData", dataProviderClass = HandlerStaticDataProvider.class)
    public void parseComponentTest(String componentData, BaseComponent expected) {
        BaseComponent actual = lexemeHandler.parseComponent(componentData);

        assertEquals(actual, expected);
    }
}