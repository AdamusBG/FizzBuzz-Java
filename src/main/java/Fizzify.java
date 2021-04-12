import java.util.TreeMap;

public class Fizzify {

    private final int FIZZ_FACTOR;
    private final int BUZZ_FACTOR;
    private TreeMap<Integer, String> conversionMap;

    public Fizzify() {
        FIZZ_FACTOR = 3;
        BUZZ_FACTOR = 5;
        conversionMap = new TreeMap<Integer, String>();
        setUpConversionMap();
    }

    public String convert(int number) {
        String returnString = "";

        for (int i : conversionMap.keySet()) {
            if (number % i ==0) {
                returnString += conversionMap.get(i);
            }
        }

        if (returnString.equals("")) {
            return Integer.toString(number);
        }

        return returnString;
    }

    private void setUpConversionMap() {
        this.conversionMap.put(FIZZ_FACTOR, "Fizz");
        this.conversionMap.put(BUZZ_FACTOR, "Buzz");
    }
}
