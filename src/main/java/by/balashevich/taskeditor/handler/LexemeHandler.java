package by.balashevich.taskeditor.handler;

import by.balashevich.taskeditor.entity.*;

public class LexemeHandler extends BaseHandler{
    private static final String SYMBOL_DELIMITER = "";
    private static final String PUNCTUATION_REGEX = "[\\p{Punct}]";

    public LexemeHandler() {
        super(null);
    }

    public BaseComponent parseComponent(String componentData) {
        TextComponent textComponent = new TextComponent(ComponentType.LEXEME);
        String[] symbols = componentData.split(SYMBOL_DELIMITER);

        for(String symbol : symbols){
            if(symbol.matches(PUNCTUATION_REGEX)){

                textComponent.add(new AtomicComponent(symbol, AtomicType.PUNCTUATION));
            } else{
                textComponent.add(new AtomicComponent(symbol, AtomicType.SYMBOL));
            }
        }

        return textComponent;
    }
}

