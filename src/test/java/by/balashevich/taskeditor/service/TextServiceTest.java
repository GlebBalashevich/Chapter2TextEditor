package by.balashevich.taskeditor.service;

import by.balashevich.taskeditor.entity.BaseComponent;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class TextServiceTest {
    TextService textService;

    @BeforeTest
    public void setUp() {
        textService = new TextService();
    }

    @Test(dataProvider = "textComponentSortData", dataProviderClass = ServiceStaticDataProvider.class)
    public void sortParagraphsBySentencesNumberTest(BaseComponent wholeText, List<BaseComponent> expected) {
        List<BaseComponent> actual = textService.sortParagraphsBySentencesNumber(wholeText);

        assertEquals(actual, expected);
    }

    @Test(dataProvider = "paragraphComponentSortData", dataProviderClass = ServiceStaticDataProvider.class)
    public void sortSentencesByLexemeLengthTest(BaseComponent paragraph, List<BaseComponent> expected) {
        List<BaseComponent> actual = textService.sortSentencesByLexemeLength(paragraph);

        assertEquals(actual, expected);
    }

    @Test(dataProvider = "lexemesComponentSortData", dataProviderClass = ServiceStaticDataProvider.class)
    public void sortLexemesByNumberCharactersTest(BaseComponent sentence, char searchingCharacter, List<BaseComponent> expected) {
        List<BaseComponent> actual = textService.sortLexemesByNumberCharacters(sentence, searchingCharacter);

        assertEquals(actual, expected);
    }
}