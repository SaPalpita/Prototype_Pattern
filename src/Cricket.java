public class Cricket extends Sport{

    private int maxAge;

    public int getMaxAge() {
        return maxAge;
    }

    public void setMaxAge(int maxAge) {
        this.maxAge = maxAge;
    }

    @Override
    public String toString() {
        return "Cricket{" +
                "maxAge=" + maxAge +
                '}';
    }
}
