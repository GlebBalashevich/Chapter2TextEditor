package by.balashevich.taskeditor.handler;

import by.balashevich.taskeditor.entity.BaseComponent;
import by.balashevich.taskeditor.entity.ComponentType;
import by.balashevich.taskeditor.entity.TextComponent;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParagraphHandler extends BaseHandler{
    private static final String SENTENCE_DELIMITER = "[^.!?\u2026]+[.!?\u2026]";

    public ParagraphHandler() {
        super(new SentenceHandler());
    }

    public BaseComponent parseComponent(String componentData) {
        TextComponent textComponent = new TextComponent(ComponentType.PARAGRAPH);
        Pattern pattern = Pattern.compile(SENTENCE_DELIMITER);
        Matcher matcher = pattern.matcher(componentData);

        while(matcher.find()){
            textComponent.add(nextHandler.parseComponent(matcher.group()));
        }

        return textComponent;
    }
}
