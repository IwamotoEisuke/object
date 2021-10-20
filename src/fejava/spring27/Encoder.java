package fejava.spring27;

import java.util.HashMap;
import java.util.Map;

abstract public class Encoder {
    private Map<Character, String> conversionTable =
            new HashMap<Character, String>();

    protected void addConversion(char c, String s) {
        conversionTable.put(c, s);
    }

    protected void addNoConversion(char c) {
        conversionTable.remove(c);//a;
    }

    protected void addNoConversion(char[] collection) {
        for (char c : collection) {
            addNoConversion(c);
        }
    }

    abstract protected String encode(char c);


}
