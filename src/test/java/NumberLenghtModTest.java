import org.example.NumberLenghtMod;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberLenghtModTest {

        NumberLenghtMod numberLenghtMod;

        @BeforeEach
        public void setUp(){
            numberLenghtMod = new NumberLenghtMod();
        }

        @Test
        @DisplayName("Teste de media de dígitos")
        public void sumDigitsTest() {
            int result = numberLenghtMod.sumDigits(123);
            assertEquals(2, result, "A média de 1, 2 e 3 deve ser igual a 2");
            result = numberLenghtMod.sumDigits(1234);
            assertEquals(2, result, "A média de 1, 2, 3 e 4 deve ser igual a 2");
            result = numberLenghtMod.sumDigits(12345);
            assertEquals(3, result, "A média de 1, 2, 3, 4 e 5 deve ser igual a 3");
        }
}
