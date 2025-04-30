package Week10.VisitorPattern;

public class Square implements IElement {
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
