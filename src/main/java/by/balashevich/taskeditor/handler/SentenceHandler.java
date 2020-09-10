package by.balashevich.taskeditor.handler;

import by.balashevich.taskeditor.entity.BaseComponent;
import by.balashevich.taskeditor.entity.ComponentType;
import by.balashevich.taskeditor.entity.TextComponent;
import by.balashevich.taskeditor.interpreter.MathExpressionInterpreter;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.regex.Pattern;

public class SentenceHandler extends BaseHandler {
    private static final SentenceHandler INSTANCE = new SentenceHandler();
    private static final String LEXEME_DELIMITER = "\\s";
    private static final String MATH_EXPRESSION = "\\p{N}+";

    private SentenceHandler() {
        super(LexemeHandler.getINSTANCE());
    }

    public static SentenceHandler getInstance() {
        return INSTANCE;
    }

    public BaseComponent parseComponent(String componentData) {
        TextComponent textComponent = new TextComponent(ComponentType.SENTENCE);
        Pattern pattern = Pattern.compile(MATH_EXPRESSION);
        String[] lexemes = componentData.split(LEXEME_DELIMITER);

        for (String lexeme : lexemes) {
            if (pattern.matcher(lexeme).find()) {
                lexeme = MathExpressionInterpreter.evaluateExpression(lexeme);
            }
            textComponent.add(nextHandler.parseComponent(lexeme));
        }

        return textComponent;
    }
}
