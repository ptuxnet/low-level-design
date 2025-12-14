package BehavioralPatterns.StrategyPattern.TextEditor.context;

import BehavioralPatterns.StrategyPattern.TextEditor.Strategy.TextFormatStrategy;

// Context Class — TextEditor
public class TextEditor {
    private TextFormatStrategy strategy;

    public void setStrategy(TextFormatStrategy strategy) {
        this.strategy = strategy;
    }

    public String applyFormat(String text){
        return strategy.format(text);
    }
}
