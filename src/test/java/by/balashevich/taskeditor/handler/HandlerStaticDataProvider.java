package by.balashevich.taskeditor.handler;

import by.balashevich.taskeditor.entity.*;
import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.List;

public class HandlerStaticDataProvider {

    @DataProvider(name = "lexemeComponentData")
    public static Object[][] createLexemeComponentData() {
        List<BaseComponent> atomics = new ArrayList<>();
        atomics.add(new AtomicComponent("c", AtomicType.SYMBOL));
        atomics.add(new AtomicComponent("o", AtomicType.SYMBOL));
        atomics.add(new AtomicComponent("n", AtomicType.SYMBOL));
        atomics.add(new AtomicComponent("s", AtomicType.SYMBOL));
        atomics.add(new AtomicComponent("t", AtomicType.SYMBOL));
        atomics.add(new AtomicComponent("r", AtomicType.SYMBOL));
        atomics.add(new AtomicComponent("u", AtomicType.SYMBOL));
        atomics.add(new AtomicComponent("c", AtomicType.SYMBOL));
        atomics.add(new AtomicComponent("t", AtomicType.SYMBOL));
        atomics.add(new AtomicComponent("s", AtomicType.SYMBOL));
        atomics.add(new AtomicComponent(",", AtomicType.PUNCTUATION));
        BaseComponent component = new TextComponent(ComponentType.LEXEME);
        component.addAll(atomics);
        return new Object[][]{
                {"constructs,", component},
        };
    }

    @DataProvider(name = "sentenceComponentData")
    public static Object[][] createSentenceComponentData() {
        List<BaseComponent> lexeme1 = new ArrayList<>();
        List<BaseComponent> lexeme2 = new ArrayList<>();
        List<BaseComponent> lexeme3 = new ArrayList<>();
        List<BaseComponent> lexeme4 = new ArrayList<>();
        List<BaseComponent> lexeme5 = new ArrayList<>();
        List<BaseComponent> lexeme6 = new ArrayList<>();
        List<BaseComponent> lexeme7 = new ArrayList<>();
        List<BaseComponent> lexeme8 = new ArrayList<>();
        lexeme1.add(new AtomicComponent("T", AtomicType.SYMBOL));
        lexeme1.add(new AtomicComponent("h", AtomicType.SYMBOL));
        lexeme1.add(new AtomicComponent("e", AtomicType.SYMBOL));
        lexeme2.add(new AtomicComponent("t", AtomicType.SYMBOL));
        lexeme2.add(new AtomicComponent("e", AtomicType.SYMBOL));
        lexeme2.add(new AtomicComponent("n", AtomicType.SYMBOL));
        lexeme2.add(new AtomicComponent("t", AtomicType.SYMBOL));
        lexeme2.add(new AtomicComponent("s", AtomicType.SYMBOL));
        lexeme3.add(new AtomicComponent("b", AtomicType.SYMBOL));
        lexeme3.add(new AtomicComponent("e", AtomicType.SYMBOL));
        lexeme3.add(new AtomicComponent("g", AtomicType.SYMBOL));
        lexeme3.add(new AtomicComponent("a", AtomicType.SYMBOL));
        lexeme3.add(new AtomicComponent("n", AtomicType.SYMBOL));
        lexeme4.add(new AtomicComponent("t", AtomicType.SYMBOL));
        lexeme4.add(new AtomicComponent("o", AtomicType.SYMBOL));
        lexeme5.add(new AtomicComponent("g", AtomicType.SYMBOL));
        lexeme5.add(new AtomicComponent("o", AtomicType.SYMBOL));
        lexeme6.add(new AtomicComponent("u", AtomicType.SYMBOL));
        lexeme6.add(new AtomicComponent("p", AtomicType.SYMBOL));
        lexeme7.add(new AtomicComponent("1", AtomicType.SYMBOL));
        lexeme7.add(new AtomicComponent("1", AtomicType.SYMBOL));
        lexeme8.add(new AtomicComponent("m", AtomicType.SYMBOL));
        lexeme8.add(new AtomicComponent("e", AtomicType.SYMBOL));
        lexeme8.add(new AtomicComponent("t", AtomicType.SYMBOL));
        lexeme8.add(new AtomicComponent("e", AtomicType.SYMBOL));
        lexeme8.add(new AtomicComponent("r", AtomicType.SYMBOL));
        lexeme8.add(new AtomicComponent("s", AtomicType.SYMBOL));
        lexeme8.add(new AtomicComponent(".", AtomicType.PUNCTUATION));
        BaseComponent lexemeComponent1 = new TextComponent(ComponentType.LEXEME);
        BaseComponent lexemeComponent2 = new TextComponent(ComponentType.LEXEME);
        BaseComponent lexemeComponent3 = new TextComponent(ComponentType.LEXEME);
        BaseComponent lexemeComponent4 = new TextComponent(ComponentType.LEXEME);
        BaseComponent lexemeComponent5 = new TextComponent(ComponentType.LEXEME);
        BaseComponent lexemeComponent6 = new TextComponent(ComponentType.LEXEME);
        BaseComponent lexemeComponent7 = new TextComponent(ComponentType.LEXEME);
        BaseComponent lexemeComponent8 = new TextComponent(ComponentType.LEXEME);
        lexemeComponent1.addAll(lexeme1);
        lexemeComponent2.addAll(lexeme2);
        lexemeComponent3.addAll(lexeme3);
        lexemeComponent4.addAll(lexeme4);
        lexemeComponent5.addAll(lexeme5);
        lexemeComponent6.addAll(lexeme6);
        lexemeComponent7.addAll(lexeme7);
        lexemeComponent8.addAll(lexeme8);
        BaseComponent sentenceComponent = new TextComponent(ComponentType.SENTENCE);
        sentenceComponent.add(lexemeComponent1);
        sentenceComponent.add(lexemeComponent2);
        sentenceComponent.add(lexemeComponent3);
        sentenceComponent.add(lexemeComponent4);
        sentenceComponent.add(lexemeComponent5);
        sentenceComponent.add(lexemeComponent6);
        sentenceComponent.add(lexemeComponent7);
        sentenceComponent.add(lexemeComponent8);

        return new Object[][]{
                {"The tents began to go up 3+(2*4) meters.", sentenceComponent},
        };
    }

    @DataProvider(name = "paragraphComponentData")
    public static Object[][] createParagraphComponentData() {
        List<BaseComponent> sentence1Lexeme1 = new ArrayList<>();
        List<BaseComponent> sentence1Lexeme2 = new ArrayList<>();
        List<BaseComponent> sentence2Lexeme1 = new ArrayList<>();
        List<BaseComponent> sentence2Lexeme2 = new ArrayList<>();
        List<BaseComponent> sentence3Lexeme1 = new ArrayList<>();
        List<BaseComponent> sentence3Lexeme2 = new ArrayList<>();
        List<BaseComponent> sentence3Lexeme3 = new ArrayList<>();
        List<BaseComponent> sentence3Lexeme4 = new ArrayList<>();
        sentence1Lexeme1.add(new AtomicComponent("I", AtomicType.SYMBOL));
        sentence1Lexeme1.add(new AtomicComponent("t", AtomicType.SYMBOL));
        sentence1Lexeme1.add(new AtomicComponent("'", AtomicType.PUNCTUATION));
        sentence1Lexeme1.add(new AtomicComponent("s", AtomicType.SYMBOL));
        sentence1Lexeme2.add(new AtomicComponent("r", AtomicType.SYMBOL));
        sentence1Lexeme2.add(new AtomicComponent("a", AtomicType.SYMBOL));
        sentence1Lexeme2.add(new AtomicComponent("i", AtomicType.SYMBOL));
        sentence1Lexeme2.add(new AtomicComponent("n", AtomicType.SYMBOL));
        sentence1Lexeme2.add(new AtomicComponent("i", AtomicType.SYMBOL));
        sentence1Lexeme2.add(new AtomicComponent("n", AtomicType.SYMBOL));
        sentence1Lexeme2.add(new AtomicComponent("g", AtomicType.SYMBOL));
        sentence1Lexeme2.add(new AtomicComponent(".", AtomicType.PUNCTUATION));
        sentence2Lexeme1.add(new AtomicComponent("G", AtomicType.SYMBOL));
        sentence2Lexeme1.add(new AtomicComponent("o", AtomicType.SYMBOL));
        sentence2Lexeme2.add(new AtomicComponent("o", AtomicType.SYMBOL));
        sentence2Lexeme2.add(new AtomicComponent("u", AtomicType.SYMBOL));
        sentence2Lexeme2.add(new AtomicComponent("t", AtomicType.SYMBOL));
        sentence2Lexeme2.add(new AtomicComponent("s", AtomicType.SYMBOL));
        sentence2Lexeme2.add(new AtomicComponent("i", AtomicType.SYMBOL));
        sentence2Lexeme2.add(new AtomicComponent("d", AtomicType.SYMBOL));
        sentence2Lexeme2.add(new AtomicComponent("e", AtomicType.SYMBOL));
        sentence2Lexeme2.add(new AtomicComponent("!", AtomicType.PUNCTUATION));
        sentence3Lexeme1.add(new AtomicComponent("W", AtomicType.SYMBOL));
        sentence3Lexeme1.add(new AtomicComponent("h", AtomicType.SYMBOL));
        sentence3Lexeme1.add(new AtomicComponent("a", AtomicType.SYMBOL));
        sentence3Lexeme1.add(new AtomicComponent("t", AtomicType.SYMBOL));
        sentence3Lexeme2.add(new AtomicComponent("a", AtomicType.SYMBOL));
        sentence3Lexeme2.add(new AtomicComponent("r", AtomicType.SYMBOL));
        sentence3Lexeme2.add(new AtomicComponent("e", AtomicType.SYMBOL));
        sentence3Lexeme3.add(new AtomicComponent("y", AtomicType.SYMBOL));
        sentence3Lexeme3.add(new AtomicComponent("o", AtomicType.SYMBOL));
        sentence3Lexeme3.add(new AtomicComponent("u", AtomicType.SYMBOL));
        sentence3Lexeme4.add(new AtomicComponent("d", AtomicType.SYMBOL));
        sentence3Lexeme4.add(new AtomicComponent("o", AtomicType.SYMBOL));
        sentence3Lexeme4.add(new AtomicComponent("i", AtomicType.SYMBOL));
        sentence3Lexeme4.add(new AtomicComponent("n", AtomicType.SYMBOL));
        sentence3Lexeme4.add(new AtomicComponent("g", AtomicType.SYMBOL));
        sentence3Lexeme4.add(new AtomicComponent("?", AtomicType.PUNCTUATION));
        BaseComponent sentence1Lexeme1component = new TextComponent(ComponentType.LEXEME);
        BaseComponent sentence1Lexeme2component = new TextComponent(ComponentType.LEXEME);
        BaseComponent sentence2Lexeme1component = new TextComponent(ComponentType.LEXEME);
        BaseComponent sentence2Lexeme2component = new TextComponent(ComponentType.LEXEME);
        BaseComponent sentence3Lexeme1component = new TextComponent(ComponentType.LEXEME);
        BaseComponent sentence3Lexeme2component = new TextComponent(ComponentType.LEXEME);
        BaseComponent sentence3Lexeme3component = new TextComponent(ComponentType.LEXEME);
        BaseComponent sentence3Lexeme4component = new TextComponent(ComponentType.LEXEME);
        sentence1Lexeme1component.addAll(sentence1Lexeme1);
        sentence1Lexeme2component.addAll(sentence1Lexeme2);
        sentence2Lexeme1component.addAll(sentence2Lexeme1);
        sentence2Lexeme2component.addAll(sentence2Lexeme2);
        sentence3Lexeme1component.addAll(sentence3Lexeme1);
        sentence3Lexeme2component.addAll(sentence3Lexeme2);
        sentence3Lexeme3component.addAll(sentence3Lexeme3);
        sentence3Lexeme4component.addAll(sentence3Lexeme4);
        BaseComponent sentence1component = new TextComponent(ComponentType.SENTENCE);
        BaseComponent sentence2component = new TextComponent(ComponentType.SENTENCE);
        BaseComponent sentence3component = new TextComponent(ComponentType.SENTENCE);
        sentence1component.add(sentence1Lexeme1component);
        sentence1component.add(sentence1Lexeme2component);
        sentence2component.add(sentence2Lexeme1component);
        sentence2component.add(sentence2Lexeme2component);
        sentence3component.add(sentence3Lexeme1component);
        sentence3component.add(sentence3Lexeme2component);
        sentence3component.add(sentence3Lexeme3component);
        sentence3component.add(sentence3Lexeme4component);
        BaseComponent paragraph = new TextComponent(ComponentType.PARAGRAPH);
        paragraph.add(sentence1component);
        paragraph.add(sentence2component);
        paragraph.add(sentence3component);

        return new Object[][]{
                {"It's raining. Go outside! What are you doing?", paragraph},
        };
    }

    @DataProvider(name = "textComponentData")
    public static Object[][] createTextComponentData() {
        List<BaseComponent> paragraph1sentence1Lexeme1 = new ArrayList<>();
        List<BaseComponent> paragraph1sentence1Lexeme2 = new ArrayList<>();
        List<BaseComponent> paragraph1sentence2Lexeme1 = new ArrayList<>();
        List<BaseComponent> paragraph1sentence2Lexeme2 = new ArrayList<>();
        List<BaseComponent> paragraph1sentence3Lexeme1 = new ArrayList<>();
        List<BaseComponent> paragraph1sentence3Lexeme2 = new ArrayList<>();
        List<BaseComponent> paragraph1sentence3Lexeme3 = new ArrayList<>();
        List<BaseComponent> paragraph1sentence3Lexeme4 = new ArrayList<>();
        List<BaseComponent> paragraph2sentence1Lexeme1 = new ArrayList<>();
        List<BaseComponent> paragraph2sentence1Lexeme2 = new ArrayList<>();
        List<BaseComponent> paragraph2sentence1Lexeme3 = new ArrayList<>();
        List<BaseComponent> paragraph2sentence2Lexeme1 = new ArrayList<>();
        List<BaseComponent> paragraph2sentence2Lexeme2 = new ArrayList<>();
        List<BaseComponent> paragraph2sentence2Lexeme3 = new ArrayList<>();
        List<BaseComponent> paragraph2sentence2Lexeme4 = new ArrayList<>();
        List<BaseComponent> paragraph2sentence3Lexeme1 = new ArrayList<>();
        List<BaseComponent> paragraph2sentence3Lexeme2 = new ArrayList<>();
        List<BaseComponent> paragraph3sentence1Lexeme1 = new ArrayList<>();
        paragraph1sentence1Lexeme1.add(new AtomicComponent("I", AtomicType.SYMBOL));
        paragraph1sentence1Lexeme1.add(new AtomicComponent("t", AtomicType.SYMBOL));
        paragraph1sentence1Lexeme1.add(new AtomicComponent("'", AtomicType.PUNCTUATION));
        paragraph1sentence1Lexeme1.add(new AtomicComponent("s", AtomicType.SYMBOL));
        paragraph1sentence1Lexeme2.add(new AtomicComponent("r", AtomicType.SYMBOL));
        paragraph1sentence1Lexeme2.add(new AtomicComponent("a", AtomicType.SYMBOL));
        paragraph1sentence1Lexeme2.add(new AtomicComponent("i", AtomicType.SYMBOL));
        paragraph1sentence1Lexeme2.add(new AtomicComponent("n", AtomicType.SYMBOL));
        paragraph1sentence1Lexeme2.add(new AtomicComponent("i", AtomicType.SYMBOL));
        paragraph1sentence1Lexeme2.add(new AtomicComponent("n", AtomicType.SYMBOL));
        paragraph1sentence1Lexeme2.add(new AtomicComponent("g", AtomicType.SYMBOL));
        paragraph1sentence1Lexeme2.add(new AtomicComponent(".", AtomicType.PUNCTUATION));
        paragraph1sentence2Lexeme1.add(new AtomicComponent("G", AtomicType.SYMBOL));
        paragraph1sentence2Lexeme1.add(new AtomicComponent("o", AtomicType.SYMBOL));
        paragraph1sentence2Lexeme2.add(new AtomicComponent("o", AtomicType.SYMBOL));
        paragraph1sentence2Lexeme2.add(new AtomicComponent("u", AtomicType.SYMBOL));
        paragraph1sentence2Lexeme2.add(new AtomicComponent("t", AtomicType.SYMBOL));
        paragraph1sentence2Lexeme2.add(new AtomicComponent("s", AtomicType.SYMBOL));
        paragraph1sentence2Lexeme2.add(new AtomicComponent("i", AtomicType.SYMBOL));
        paragraph1sentence2Lexeme2.add(new AtomicComponent("d", AtomicType.SYMBOL));
        paragraph1sentence2Lexeme2.add(new AtomicComponent("e", AtomicType.SYMBOL));
        paragraph1sentence2Lexeme2.add(new AtomicComponent("!", AtomicType.PUNCTUATION));
        paragraph1sentence3Lexeme1.add(new AtomicComponent("W", AtomicType.SYMBOL));
        paragraph1sentence3Lexeme1.add(new AtomicComponent("h", AtomicType.SYMBOL));
        paragraph1sentence3Lexeme1.add(new AtomicComponent("a", AtomicType.SYMBOL));
        paragraph1sentence3Lexeme1.add(new AtomicComponent("t", AtomicType.SYMBOL));
        paragraph1sentence3Lexeme2.add(new AtomicComponent("a", AtomicType.SYMBOL));
        paragraph1sentence3Lexeme2.add(new AtomicComponent("r", AtomicType.SYMBOL));
        paragraph1sentence3Lexeme2.add(new AtomicComponent("e", AtomicType.SYMBOL));
        paragraph1sentence3Lexeme3.add(new AtomicComponent("y", AtomicType.SYMBOL));
        paragraph1sentence3Lexeme3.add(new AtomicComponent("o", AtomicType.SYMBOL));
        paragraph1sentence3Lexeme3.add(new AtomicComponent("u", AtomicType.SYMBOL));
        paragraph1sentence3Lexeme4.add(new AtomicComponent("d", AtomicType.SYMBOL));
        paragraph1sentence3Lexeme4.add(new AtomicComponent("o", AtomicType.SYMBOL));
        paragraph1sentence3Lexeme4.add(new AtomicComponent("i", AtomicType.SYMBOL));
        paragraph1sentence3Lexeme4.add(new AtomicComponent("n", AtomicType.SYMBOL));
        paragraph1sentence3Lexeme4.add(new AtomicComponent("g", AtomicType.SYMBOL));
        paragraph1sentence3Lexeme4.add(new AtomicComponent("?", AtomicType.PUNCTUATION));
        paragraph2sentence1Lexeme1.add(new AtomicComponent("W", AtomicType.SYMBOL));
        paragraph2sentence1Lexeme1.add(new AtomicComponent("h", AtomicType.SYMBOL));
        paragraph2sentence1Lexeme1.add(new AtomicComponent("o", AtomicType.SYMBOL));
        paragraph2sentence1Lexeme2.add(new AtomicComponent("i", AtomicType.SYMBOL));
        paragraph2sentence1Lexeme2.add(new AtomicComponent("s", AtomicType.SYMBOL));
        paragraph2sentence1Lexeme3.add(new AtomicComponent("t", AtomicType.SYMBOL));
        paragraph2sentence1Lexeme3.add(new AtomicComponent("h", AtomicType.SYMBOL));
        paragraph2sentence1Lexeme3.add(new AtomicComponent("e", AtomicType.SYMBOL));
        paragraph2sentence1Lexeme3.add(new AtomicComponent("r", AtomicType.SYMBOL));
        paragraph2sentence1Lexeme3.add(new AtomicComponent("e", AtomicType.SYMBOL));
        paragraph2sentence1Lexeme3.add(new AtomicComponent("?", AtomicType.PUNCTUATION));
        paragraph2sentence2Lexeme1.add(new AtomicComponent("L", AtomicType.SYMBOL));
        paragraph2sentence2Lexeme1.add(new AtomicComponent("e", AtomicType.SYMBOL));
        paragraph2sentence2Lexeme1.add(new AtomicComponent("t", AtomicType.SYMBOL));
        paragraph2sentence2Lexeme2.add(new AtomicComponent("u", AtomicType.SYMBOL));
        paragraph2sentence2Lexeme2.add(new AtomicComponent("s", AtomicType.SYMBOL));
        paragraph2sentence2Lexeme3.add(new AtomicComponent("d", AtomicType.SYMBOL));
        paragraph2sentence2Lexeme3.add(new AtomicComponent("o", AtomicType.SYMBOL));
        paragraph2sentence2Lexeme4.add(new AtomicComponent("t", AtomicType.SYMBOL));
        paragraph2sentence2Lexeme4.add(new AtomicComponent("h", AtomicType.SYMBOL));
        paragraph2sentence2Lexeme4.add(new AtomicComponent("i", AtomicType.SYMBOL));
        paragraph2sentence2Lexeme4.add(new AtomicComponent("s", AtomicType.SYMBOL));
        paragraph2sentence2Lexeme4.add(new AtomicComponent(".", AtomicType.PUNCTUATION));
        paragraph2sentence3Lexeme1.add(new AtomicComponent("O", AtomicType.SYMBOL));
        paragraph2sentence3Lexeme1.add(new AtomicComponent("k", AtomicType.SYMBOL));
        paragraph2sentence3Lexeme1.add(new AtomicComponent("e", AtomicType.SYMBOL));
        paragraph2sentence3Lexeme1.add(new AtomicComponent("y", AtomicType.SYMBOL));
        paragraph2sentence3Lexeme1.add(new AtomicComponent(",", AtomicType.PUNCTUATION));
        paragraph2sentence3Lexeme2.add(new AtomicComponent("M", AtomicType.SYMBOL));
        paragraph2sentence3Lexeme2.add(new AtomicComponent("a", AtomicType.SYMBOL));
        paragraph2sentence3Lexeme2.add(new AtomicComponent("n", AtomicType.SYMBOL));
        paragraph2sentence3Lexeme2.add(new AtomicComponent("!", AtomicType.PUNCTUATION));
        paragraph3sentence1Lexeme1.add(new AtomicComponent("B", AtomicType.SYMBOL));
        paragraph3sentence1Lexeme1.add(new AtomicComponent("y", AtomicType.SYMBOL));
        paragraph3sentence1Lexeme1.add(new AtomicComponent("e", AtomicType.SYMBOL));
        paragraph3sentence1Lexeme1.add(new AtomicComponent("!", AtomicType.PUNCTUATION));

        BaseComponent paragraph1sentence1Lexeme1component = new TextComponent(ComponentType.LEXEME);
        BaseComponent paragraph1sentence1Lexeme2component = new TextComponent(ComponentType.LEXEME);
        BaseComponent paragraph1sentence2Lexeme1component = new TextComponent(ComponentType.LEXEME);
        BaseComponent paragraph1sentence2Lexeme2component = new TextComponent(ComponentType.LEXEME);
        BaseComponent paragraph1sentence3Lexeme1component = new TextComponent(ComponentType.LEXEME);
        BaseComponent paragraph1sentence3Lexeme2component = new TextComponent(ComponentType.LEXEME);
        BaseComponent paragraph1sentence3Lexeme3component = new TextComponent(ComponentType.LEXEME);
        BaseComponent paragraph1sentence3Lexeme4component = new TextComponent(ComponentType.LEXEME);
        BaseComponent paragraph2sentence1Lexeme1component = new TextComponent(ComponentType.LEXEME);
        BaseComponent paragraph2sentence1Lexeme2component = new TextComponent(ComponentType.LEXEME);
        BaseComponent paragraph2sentence1Lexeme3component = new TextComponent(ComponentType.LEXEME);
        BaseComponent paragraph2sentence2Lexeme1component = new TextComponent(ComponentType.LEXEME);
        BaseComponent paragraph2sentence2Lexeme2component = new TextComponent(ComponentType.LEXEME);
        BaseComponent paragraph2sentence2Lexeme3component = new TextComponent(ComponentType.LEXEME);
        BaseComponent paragraph2sentence2Lexeme4component = new TextComponent(ComponentType.LEXEME);
        BaseComponent paragraph2sentence3Lexeme1component = new TextComponent(ComponentType.LEXEME);
        BaseComponent paragraph2sentence3Lexeme2component = new TextComponent(ComponentType.LEXEME);
        BaseComponent paragraph3sentence1Lexeme1component = new TextComponent(ComponentType.LEXEME);
        paragraph1sentence1Lexeme1component.addAll(paragraph1sentence1Lexeme1);
        paragraph1sentence1Lexeme2component.addAll(paragraph1sentence1Lexeme2);
        paragraph1sentence2Lexeme1component.addAll(paragraph1sentence2Lexeme1);
        paragraph1sentence2Lexeme2component.addAll(paragraph1sentence2Lexeme2);
        paragraph1sentence3Lexeme1component.addAll(paragraph1sentence3Lexeme1);
        paragraph1sentence3Lexeme2component.addAll(paragraph1sentence3Lexeme2);
        paragraph1sentence3Lexeme3component.addAll(paragraph1sentence3Lexeme3);
        paragraph1sentence3Lexeme4component.addAll(paragraph1sentence3Lexeme4);
        paragraph2sentence1Lexeme1component.addAll(paragraph2sentence1Lexeme1);
        paragraph2sentence1Lexeme2component.addAll(paragraph2sentence1Lexeme2);
        paragraph2sentence1Lexeme3component.addAll(paragraph2sentence1Lexeme3);
        paragraph2sentence2Lexeme1component.addAll(paragraph2sentence2Lexeme1);
        paragraph2sentence2Lexeme2component.addAll(paragraph2sentence2Lexeme2);
        paragraph2sentence2Lexeme3component.addAll(paragraph2sentence2Lexeme3);
        paragraph2sentence2Lexeme4component.addAll(paragraph2sentence2Lexeme4);
        paragraph2sentence3Lexeme1component.addAll(paragraph2sentence3Lexeme1);
        paragraph2sentence3Lexeme2component.addAll(paragraph2sentence3Lexeme2);
        paragraph3sentence1Lexeme1component.addAll(paragraph3sentence1Lexeme1);

        BaseComponent paragraph1sentence1component = new TextComponent(ComponentType.SENTENCE);
        BaseComponent paragraph1sentence2component = new TextComponent(ComponentType.SENTENCE);
        BaseComponent paragraph1sentence3component = new TextComponent(ComponentType.SENTENCE);
        BaseComponent paragraph2sentence1component = new TextComponent(ComponentType.SENTENCE);
        BaseComponent paragraph2sentence2component = new TextComponent(ComponentType.SENTENCE);
        BaseComponent paragraph2sentence3component = new TextComponent(ComponentType.SENTENCE);
        BaseComponent paragraph3sentence1component = new TextComponent(ComponentType.SENTENCE);
        paragraph1sentence1component.add(paragraph1sentence1Lexeme1component);
        paragraph1sentence1component.add(paragraph1sentence1Lexeme2component);
        paragraph1sentence2component.add(paragraph1sentence2Lexeme1component);
        paragraph1sentence2component.add(paragraph1sentence2Lexeme2component);
        paragraph1sentence3component.add(paragraph1sentence3Lexeme1component);
        paragraph1sentence3component.add(paragraph1sentence3Lexeme2component);
        paragraph1sentence3component.add(paragraph1sentence3Lexeme3component);
        paragraph1sentence3component.add(paragraph1sentence3Lexeme4component);
        paragraph2sentence1component.add(paragraph2sentence1Lexeme1component);
        paragraph2sentence1component.add(paragraph2sentence1Lexeme2component);
        paragraph2sentence1component.add(paragraph2sentence1Lexeme3component);
        paragraph2sentence2component.add(paragraph2sentence2Lexeme1component);
        paragraph2sentence2component.add(paragraph2sentence2Lexeme2component);
        paragraph2sentence2component.add(paragraph2sentence2Lexeme3component);
        paragraph2sentence2component.add(paragraph2sentence2Lexeme4component);
        paragraph2sentence3component.add(paragraph2sentence3Lexeme1component);
        paragraph2sentence3component.add(paragraph2sentence3Lexeme2component);
        paragraph3sentence1component.add(paragraph3sentence1Lexeme1component);

        BaseComponent paragraph1 = new TextComponent(ComponentType.PARAGRAPH);
        BaseComponent paragraph2 = new TextComponent(ComponentType.PARAGRAPH);
        BaseComponent paragraph3 = new TextComponent(ComponentType.PARAGRAPH);
        paragraph1.add(paragraph1sentence1component);
        paragraph1.add(paragraph1sentence2component);
        paragraph1.add(paragraph1sentence3component);
        paragraph2.add(paragraph2sentence1component);
        paragraph2.add(paragraph2sentence2component);
        paragraph2.add(paragraph2sentence3component);
        paragraph3.add(paragraph3sentence1component);

        BaseComponent text = new TextComponent(ComponentType.WHOLE_TEXT);
        text.add(paragraph1);
        text.add(paragraph2);
        text.add(paragraph3);

        return new Object[][]{
                {"\tIt's raining. Go outside! What are you doing?\n\tWho is there? Let us do this. Okey, Man!\n\tBye!", text},
        };
    }
}
