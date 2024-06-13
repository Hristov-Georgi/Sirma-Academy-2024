package entryCourseLogicalExercises.loopsExercises;

public class MultiplicationTable {
    public static void main(String[] args) {

        for (int multiplier = 1; multiplier <= 10 ; multiplier++) {
            for (int multiplicand = 1; multiplicand <= 10 ; multiplicand++) {
                int product = multiplier * multiplicand;
                System.out.printf("%d * %d = %d%n", multiplier, multiplicand, product);
            }
        }
    }
}
