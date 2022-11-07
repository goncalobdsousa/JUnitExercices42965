import org.example.GeometryCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeometryCalculatorTest {

    GeometryCalculator geometryCalculator;

    @BeforeEach
    public void setUp(){
        geometryCalculator = new GeometryCalculator();
    }

    @Test
    @DisplayName("Teste de área")
    public void areaTest() {
        int result = geometryCalculator.area(3, 5);
        assertEquals(15, result, "Área de 3 * 5 deve ser igual a 15");
        result = geometryCalculator.area(5, 8);
        assertEquals(15, result, "Área de 5 * 8 deve ser igual a 40");
        result = geometryCalculator.area(2, 4);
        assertEquals(15, result, "Área de 2 * 4 deve ser igual a 8");
    }

    @Test
    @DisplayName("Teste de perímetro")
    public void perimeterTest() {
        int result = geometryCalculator.perimeter(1, 2);
        assertEquals(6, result, "Perímetro de 1 + 2 deve ser igual a 6");
    }

    @Test
    @DisplayName("Teste de triângulo")
    public void isTriangleTest() {
        int result = geometryCalculator.isTriangle(1, 2, 3);
        assertEquals(0, result, "1, 2 e 3 não formam um triângulo");
    }
}
