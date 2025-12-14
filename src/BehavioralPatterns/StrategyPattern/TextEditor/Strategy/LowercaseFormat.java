package BehavioralPatterns.StrategyPattern.TextEditor.Strategy;

// Concrete Strategy class
public class LowercaseFormat implements TextFormatStrategy{

    @Override
    public String format(String text){
        return  text.toLowerCase();
    }

}
