package Week10.StrategyPattern;

public class Context {
    int doOperation(IOperation operation,int a,int b){
        return operation.setStrategy(a,b);
    }
}
