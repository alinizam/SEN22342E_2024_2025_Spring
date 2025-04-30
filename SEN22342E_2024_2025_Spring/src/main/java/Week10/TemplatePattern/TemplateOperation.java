package Week10.TemplatePattern;

public abstract class TemplateOperation {
    final void templateMethod(){
        Operation1();
        Operation2();
        Operation3();
    }
    abstract void Operation1();
    abstract void Operation2();
    abstract void Operation3();

}
