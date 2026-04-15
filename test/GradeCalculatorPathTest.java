public class GradeCalculatorPathTest {
    
}
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Issue #2: Bao phủ tất cả các ĐƯỜNG ĐI (Path Coverage)
// calculateAverage: 3 paths
//   P1: scores == null → return 0.0
//   P2: scores.length == 0 → return 0.0
//   P3: vào vòng lặp → tính → return kết quả
// classify: 4 paths
//   P1: >= 8.5 → "Giỏi"
//   P2: >= 7.0 → "Khá"
//   P3: >= 5.0 → "Trung bình"
//   P4: < 5.0  → "Yếu"
public class GradeCalculatorPathTest {

    GradeCalculator calc = new GradeCalculator();

    @Test
    void path_avg_null() {
        assertEquals(0.0, calc.calculateAverage(null));
    }

    @Test
    void path_avg_empty() {
        assertEquals(0.0, calc.calculateAverage(new int[]{}));
    }

    @Test
    void path_avg_normal() {
        assertEquals(5.0, calc.calculateAverage(new int[]{4, 5, 6}));
    }

    @Test
    void path_classify_gioi() {
        assertEquals("Giỏi", calc.classify(8.5));
        assertEquals("Giỏi", calc.classify(10.0));
    }

    @Test
    void path_classify_kha() {
        assertEquals("Khá", calc.classify(7.0));
        assertEquals("Khá", calc.classify(8.4));
    }

    @Test
    void path_classify_trungBinh() {
        assertEquals("Trung bình", calc.classify(5.0));
        assertEquals("Trung bình", calc.classify(6.9));
    }

    @Test
    void path_classify_yeu() {
        assertEquals("Yếu", calc.classify(0.0));
        assertEquals("Yếu", calc.classify(4.9));
    }
}