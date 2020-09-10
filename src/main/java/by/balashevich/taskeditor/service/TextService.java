package by.balashevich.taskeditor.service;

import by.balashevich.taskeditor.entity.BaseComponent;
import by.balashevich.taskeditor.entity.ComponentType;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TextService {
    private static final Logger logger = LogManager.getLogger();

    public List<BaseComponent> sortParagraphsBySentencesNumber(BaseComponent textComponent) {
        List<BaseComponent> sortedParagraphList;
        if (textComponent.getComponentType() == ComponentType.WHOLE_TEXT) {
            sortedParagraphList = textComponent.getChildComponentList().stream().sorted(
                    Comparator.comparingInt(t -> t.getChildComponentList().size())).collect(Collectors.toList());
        } else {
            sortedParagraphList = new ArrayList<>();
            logger.log(Level.WARN, "incorrect component type for sorting by sentences number");
        }

        return sortedParagraphList;
    }

    public List<BaseComponent> sortSentencesByLexemeLength(BaseComponent textComponent) {
        List<BaseComponent> sortedSentencesList;

        if (textComponent.getComponentType() == ComponentType.PARAGRAPH) {
            sortedSentencesList = new ArrayList<>(textComponent.getChildComponentList());
            sortedSentencesList.sort((b1, b2) -> {
                int maxLexemeSize1 = b1.getChildComponentList().stream().max(Comparator.comparing(
                        lexemeComponent -> lexemeComponent.toString().length()))
                        .get().toString().length();
                int maxLexemeSize2 = b2.getChildComponentList().stream().max(Comparator.comparing(
                        lexemeComponent -> lexemeComponent.toString().length()))
                        .get().toString().length();
                return maxLexemeSize1 - maxLexemeSize2;
            });
        } else {
            sortedSentencesList = new ArrayList<>();
            logger.log(Level.WARN, "incorrect component type for sorting by lexeme length");
        }

        return sortedSentencesList;
    }

    public List<BaseComponent> sortLexemesByNumberCharacters(BaseComponent textComponent, char searchingCharacter) {
        List<BaseComponent> sortedTextList;

        if (textComponent.getComponentType() == ComponentType.SENTENCE) {
            sortedTextList = new ArrayList<>(textComponent.getChildComponentList());
            sortedTextList.sort((b1, b2) -> {
                int comparingResult;
                long characterCount1 = b1.getChildComponentList().stream().filter(ch -> ch.toString().equals(Character.toString(searchingCharacter))).count();
                long characterCount2 = b2.getChildComponentList().stream().filter(ch -> ch.toString().equals(Character.toString(searchingCharacter))).count();

                comparingResult = (int) (characterCount1 - characterCount2);
                if (comparingResult == 0) {
                    comparingResult = b1.toString().compareToIgnoreCase(b2.toString());
                }

                return comparingResult;
            });
        } else {
            sortedTextList = new ArrayList<>();
            logger.log(Level.WARN, "incorrect component type for sorting by number of searchingCharacter in lexeme");
        }

        return sortedTextList;
    }
}
