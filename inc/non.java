import java.util.concurrent.ThreadLocalRandom;

public class RandomGenerator {

    /**
     * Generates a random integer between min (inclusive) and max (exclusive).
     * If min is greater than or equal to max, an IllegalArgumentException is thrown.
     *
     * @param min The minimum value of the range (inclusive).
     * @param max The maximum value of the range (exclusive).
     * @return A random integer between min and max.
     * @throws IllegalArgumentException if min is greater than or equal to max.
     */
    private static int randomIntFromInterval(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("min must be less than max");
        }
        return ThreadLocalRandom.current().nextInt(min, max);
    }
}
