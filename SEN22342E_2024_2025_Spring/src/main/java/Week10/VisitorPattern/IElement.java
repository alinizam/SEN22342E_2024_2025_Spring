package Week10.VisitorPattern;

public interface IElement {
    void accept(IVisitor visitor);
}
