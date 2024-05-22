package prac7;

import java.util.HashMap;

public class FlyweightFactory {
    static HashMap<String, SymbolFlyweight> hashmap = new HashMap<>();

    public SymbolFlyweight getSembol(String symbol, String symbolStyle) {
        if (hashmap.get(symbol) == null) {
            hashmap.put(symbol, new ConcreateFlyweight(symbol, symbolStyle));
        }
        return hashmap.get(symbol);
    }
}
