public class Fizzify {

    private final int FIZZ_FACTOR;
    private final int BUZZ_FACTOR;

    public Fizzify() {
        FIZZ_FACTOR = 3;
        BUZZ_FACTOR = 5;
    }

    public String convert(int number) {
        if (number % FIZZ_FACTOR == 0 && number % BUZZ_FACTOR == 0) {
            return "FizzBuzz";
        }
        if (number % FIZZ_FACTOR == 0) {
            return "Fizz";
        }
        if (number % BUZZ_FACTOR == 0) {
            return "Buzz";
        }
        return Integer.toString(number);
    }
}
