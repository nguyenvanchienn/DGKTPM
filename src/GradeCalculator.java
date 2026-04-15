public class GradeCalculator {

    public double calculateAverage(int[] scores) {
        if (scores == null || scores.length == 0) {
            return 0.0;
        }
        int total = 0;
        for (int score : scores) {
            total += score;
        }
        return (double) total / scores.length;
    }

    public String classify(double average) {
        if (average >= 8.5) {
            return "Giỏi";
        } else if (average >= 7.0) {
            return "Khá";
        } else if (average >= 5.0) {
            return "Trung bình";
        } else {
            return "Yếu";
        }
    }

    public static void main(String[] args) {
        GradeCalculator calc = new GradeCalculator();
        int[] scores = {9, 8, 7, 6, 10};
        double avg = calc.calculateAverage(scores);
        System.out.println("Điểm TB: " + avg);
        System.out.println("Xếp loại: " + calc.classify(avg));
    }
}