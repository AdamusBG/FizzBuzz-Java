public class Main {
    public static void main(String[] args) {

        Fizzify fizzifier = new Fizzify();

        for (int i = 1; i <= 100; i++) {
            System.out.println(fizzifier.convert(i));
        }
    }
}
