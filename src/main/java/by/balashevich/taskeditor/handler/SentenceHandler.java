package by.balashevich.taskeditor.handler;

import by.balashevich.taskeditor.entity.BaseComponent;
import by.balashevich.taskeditor.entity.ComponentType;
import by.balashevich.taskeditor.entity.TextComponent;

public class SentenceHandler extends BaseHandler{
    private static final String LEXEME_DELIMITER = "\\s";


    public SentenceHandler() {
        super(new LexemeHandler());
    }

    public BaseComponent parseComponent(String componentData) {
        TextComponent textComponent = new TextComponent(ComponentType.SENTENCE);
        String[] lexemes = componentData.split(LEXEME_DELIMITER);

        for(String lexeme : lexemes){
            textComponent.add(nextHandler.parseComponent(lexeme));
        }

        return textComponent;
    }
}
