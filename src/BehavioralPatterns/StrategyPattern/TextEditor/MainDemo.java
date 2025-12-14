package BehavioralPatterns.StrategyPattern.TextEditor;

import BehavioralPatterns.StrategyPattern.TextEditor.Strategy.LowercaseFormat;
import BehavioralPatterns.StrategyPattern.TextEditor.Strategy.TitlecaseFormat;
import BehavioralPatterns.StrategyPattern.TextEditor.Strategy.UppercaseFormat;
import BehavioralPatterns.StrategyPattern.TextEditor.context.TextEditor;

// Client Code (Testing)
public class MainDemo {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();

        editor.setStrategy(new UppercaseFormat());
        System.out.println(editor.applyFormat("hello World"));

        editor.setStrategy(new LowercaseFormat());
        System.out.println(editor.applyFormat("hello World"));

        editor.setStrategy(new TitlecaseFormat());
        System.out.println(editor.applyFormat("the family man"));


    }
}
