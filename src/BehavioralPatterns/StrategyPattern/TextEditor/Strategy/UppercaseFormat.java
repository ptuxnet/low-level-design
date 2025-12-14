package BehavioralPatterns.StrategyPattern.TextEditor.Strategy;

// Concrete Strategy class
public class UppercaseFormat implements TextFormatStrategy{
    @Override
    public String format(String text) {
        return text.toUpperCase();
    }
}
