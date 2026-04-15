import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Issue #1: Bao phủ tất cả các LỆNH (Statement Coverage)
public class GradeCalculatorStatementTest {

    GradeCalculator calc = new GradeCalculator();

    @Test
    void stmt_nullInput() {
        // Bao phủ lệnh: if null → return 0.0
        assertEquals(0.0, calc.calculateAverage(null));
    }

    @Test
    void stmt_emptyArray() {
        // Bao phủ lệnh: if length==0 → return 0.0
        assertEquals(0.0, calc.calculateAverage(new int[]{}));
    }

    @Test
    void stmt_loop() {
        // Bao phủ lệnh: vòng for, total+=score, return kết quả
        assertEquals(8.0, calc.calculateAverage(new int[]{7, 8, 9}));
    }

    @Test
    void stmt_gioi() {
        // Bao phủ lệnh: return "Giỏi"
        assertEquals("Giỏi", calc.classify(9.0));
    }

    @Test
    void stmt_kha() {
        // Bao phủ lệnh: return "Khá"
        assertEquals("Khá", calc.classify(7.5));
    }

    @Test
    void stmt_trungBinh() {
        // Bao phủ lệnh: return "Trung bình"
        assertEquals("Trung bình", calc.classify(6.0));
    }

    @Test
    void stmt_yeu() {
        // Bao phủ lệnh: return "Yếu"
        assertEquals("Yếu", calc.classify(4.0));
    }
}