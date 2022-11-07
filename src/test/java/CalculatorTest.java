import org.example.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator calculator;


    @BeforeEach
    public void setUp(){
        calculator = new Calculator();
    }

   @Test
   @DisplayName("Teste de soma")
  // @Disabled
   public void somaTest() {
         int result = calculator.soma(1, 2);
         assertEquals(3, result, "Soma de 1 + 2 deve ser igual a 3");
   }

    @Test
    @DisplayName("Teste de subtração")
    public void diffTest() {
        int result = calculator.diff(1, 2);
        assertEquals(-1, result, "Diferença de 1 - 2 deve ser igual a -1");
    }

    @Test
    @DisplayName("Teste de multiplicação")
    public void multiplyTest() {
        int result = calculator.multiply(1, 2);
        assertEquals(2, result, "Multiplicação de 1 * 2 deve ser igual a 2");
    }

    @Test
    @DisplayName("Teste de divisão")
    public void divideTest() {
        int result = calculator.divide(1, 2);
        assertEquals(0, result, "Divisão de 1 / 2 deve ser igual a 0");
    }

}
