package BehavioralPatterns.StrategyPattern.Navigation;

import BehavioralPatterns.StrategyPattern.Navigation.Strategy.FastestRoute;
import BehavioralPatterns.StrategyPattern.Navigation.Strategy.ScenicRoute;
import BehavioralPatterns.StrategyPattern.Navigation.Strategy.ShortestRoute;
import BehavioralPatterns.StrategyPattern.Navigation.context.Navigation;

public class MainDemo {
    public static void main(String[] args) {
        Navigation engine = new Navigation();

        engine.setStrategy(new FastestRoute());
        engine.navigate("Delhi", "Mumbai");

        engine.setStrategy(new ShortestRoute());
        engine.navigate("Goa" , "Ahmedabad");

        engine.setStrategy(new ScenicRoute());
        engine.navigate("Shimla", "Goa");



    }
}
