package prac6;

public class ConcreteCreator implements Creator{
    @Override
    public Product create() {
        return new ConcreteProduct();
    }

}
