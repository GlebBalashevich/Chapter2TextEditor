package by.balashevich.taskeditor.interpreter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MathExpressionInterpreterTest {

    @DataProvider(name = "mathExpressionData")
    public Object[][] createMathExpressionData(){
        return new Object[][]{
                {"13+8", "21"},
                {"6+9*(3-4)", "-3"},
                {"(71-(2*15*(3*(2-1/2*2)-2)-10/2))*2", "92.0"},
        };
    };
    
    @Test(dataProvider = "mathExpressionData")
    public void evaluateExpressionTest(String mathExpression, String expected) {
        String actual = MathExpressionInterpreter.evaluateExpression(mathExpression);
        assertEquals(actual, expected);
    }
}