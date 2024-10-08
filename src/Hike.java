public class Hike<T extends Number> implements Comparable<Hike<T>> {
    private T distance;
    private T maxElevation;

    public Hike(T distance, T maxElevation) {
        this.distance = distance;
        this.maxElevation = maxElevation;
    }

    public static <S extends Number> double getHikeDifficulty(Hike<S> hike) {
        return hike.distance.doubleValue() * hike.maxElevation.doubleValue();
    }

    @Override
    public int compareTo(Hike<T> other) {
        //TODO for equal case need to compare doubles to certain precision
        double thisDifficulty = Hike.getHikeDifficulty(this);
        double otherDifficulty = Hike.getHikeDifficulty(other);

        return (int) (thisDifficulty - otherDifficulty);
    }
}
