import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GradeCalculatorTest {

    GradeCalculator calc = new GradeCalculator();

    @Test
    void testNull() {
        assertEquals(0.0, calc.calculateAverage(null));
    }

    @Test
    void testEmpty() {
        assertEquals(0.0, calc.calculateAverage(new int[]{}));
    }

    @Test
    void testNormal() {
        assertEquals(8.0, calc.calculateAverage(new int[]{7, 8, 9}));
    }

    @Test
    void testGioi() {
        assertEquals("Giỏi", calc.classify(9.0));
    }

    @Test
    void testKha() {
        assertEquals("Khá", calc.classify(7.5));
    }

    @Test
    void testTrungBinh() {
        assertEquals("Trung bình", calc.classify(6.0));
    }

    @Test
    void testYeu() {
        assertEquals("Yếu", calc.classify(4.0));
    }
}