package prac7;

public final class ConcreateFlyweight implements SymbolFlyweight{
    private final String symbol;
    private final String symbolStyle;

    public ConcreateFlyweight(String symbol, String symbolStyle) {
        this.symbol = symbol;
        this.symbolStyle = symbolStyle;
    }

    @Override
    public void drawSymbol(PositionExternalContext position) {
        System.out.println(symbol + " " + symbolStyle + " " + position.getX() + " " + position.getY());
    }
}
