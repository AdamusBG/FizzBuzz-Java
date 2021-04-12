import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FizzifyTest {

    Fizzify testFizzifier;

    @BeforeEach
    void init() {
        testFizzifier = new Fizzify();
    }
}
