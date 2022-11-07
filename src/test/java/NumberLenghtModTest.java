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
        @DisplayName("Teste de soma de dígitos")
        public void sumDigitsTest() {
            int result = numberLenghtMod.sumDigits(123);
            assertEquals(6, result, "A soma dos dígitos de 123 deve ser igual a 6");
            result = numberLenghtMod.sumDigits(1234);
            assertEquals(10, result, "A soma dos dígitos de 1234 deve ser igual a 10");
            result = numberLenghtMod.sumDigits(12345);
            assertEquals(15, result, "A soma dos dígitos de 12345 deve ser igual a 15");
        }
}
