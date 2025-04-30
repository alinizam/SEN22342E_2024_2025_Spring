package Week10.StrategyPattern;

public class Minus implements IOperation{
    @Override
    public int setStrategy(int a, int b) {
        return a-b;
    }
}
