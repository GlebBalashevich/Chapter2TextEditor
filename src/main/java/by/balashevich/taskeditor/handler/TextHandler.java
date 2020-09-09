package by.balashevich.taskeditor.handler;

import by.balashevich.taskeditor.entity.BaseComponent;
import by.balashevich.taskeditor.entity.ComponentType;
import by.balashevich.taskeditor.entity.TextComponent;

public class TextHandler extends BaseHandler {
    private static final TextHandler INSTANCE = new TextHandler();
    private static final String PARAGRAPH_DELIMITER = "\\p{Blank}{4}|\\t";
    private static final String EMPTY_SYMBOL = "";

    private TextHandler() {
        super(ParagraphHandler.getInstance());
    }

    public static TextHandler getInstance() {
        return INSTANCE;
    }

    public BaseComponent parseComponent(String componentData) {
        componentData = componentData.replaceFirst(PARAGRAPH_DELIMITER, EMPTY_SYMBOL);
        TextComponent textComponent = new TextComponent(ComponentType.WHOLE_TEXT);
        String[] paragraphs = componentData.split(PARAGRAPH_DELIMITER);

        for (String paragraph : paragraphs) {
            textComponent.add(nextHandler.parseComponent(paragraph));
        }

        return textComponent;
    }
}
