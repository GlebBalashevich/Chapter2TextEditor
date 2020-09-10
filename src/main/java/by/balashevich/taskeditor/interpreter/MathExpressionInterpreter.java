package by.balashevich.taskeditor.interpreter;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class MathExpressionInterpreter {
    private static final String SCRIPT_INTERPRETER_ENGINE = "JavaScript";

    private MathExpressionInterpreter() {

    }

    public static String evaluateExpression(String expression) {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName(SCRIPT_INTERPRETER_ENGINE);
        String calculationResult;

        try {
            calculationResult = engine.eval(expression).toString();
        } catch (ScriptException e) {
            calculationResult = expression;
        }

        return calculationResult;
    }
}
