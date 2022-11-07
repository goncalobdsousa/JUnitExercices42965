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
        assertEquals(40, result, "Área de 5 * 8 deve ser igual a 40");
        result = geometryCalculator.area(2, 4);
        assertEquals(8, result, "Área de 2 * 4 deve ser igual a 8");
    }

    @Test
    @DisplayName("Teste de perímetro")
    public void perimeterTest() {
        int result = geometryCalculator.perimeter(3, 5);
        assertEquals(16, result, "2 * (3 + 5) should equal 16");
        result = geometryCalculator.perimeter(5, 8);
        assertEquals(26, result, "2 * (5 + 8) should equal 26");
        result = geometryCalculator.perimeter(2, 4);
        assertEquals(12, result, "2 * (2 + 4) should equal 12");
    }

    @Test
    @DisplayName("Teste de triângulo")
    public void isTriangleTest() {
        int result = geometryCalculator.isTriangle(1, 2, 3);
        assertEquals(0, result, "1, 2 e 3 não formam um triângulo");
    }
}
