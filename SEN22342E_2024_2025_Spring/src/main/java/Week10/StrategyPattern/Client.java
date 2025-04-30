package Week10.StrategyPattern;

public class Client {
    public static void main(String[] args) {
        Context context=new Context();
        int result=context.doOperation(new IOperation() {
            @Override
            public int setStrategy(int a, int b) {
                return a+b;
            }
        },5,3);

        System.out.println(result);


        result=context.doOperation(new Minus(),5,3);
        System.out.println(result);

        result=context.doOperation((a,b)->(a*b),5,3);
        System.out.println(result);
    }
}
