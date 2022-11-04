package cantera;

public class Explotions {

    private int explotionLimit;
    private int tonsAccumulator;

    public Explotions() {
    }

    public Explotions(int explotionLimit, int tonsAccumulator) {
        this.explotionLimit = explotionLimit;
        this.tonsAccumulator = tonsAccumulator;
    }

    /**
     * @return the explotionLimit
     */
    public int getExplotionLimit() {
        return explotionLimit;
    }

    /**
     * @param explotionLimit the explotionLimit to set
     */
    public void setExplotionLimit(int explotionLimit) {
        this.explotionLimit = explotionLimit;
    }

    /**
     * @return the tonsAccumulator
     */
    public int getTonsAccumulator() {
        return tonsAccumulator;
    }

    /**
     * @param tonsAccumulator the tonsAccumulator to set
     */
    public void setTonsAccumulator(int tonsAccumulator) {
        this.tonsAccumulator = tonsAccumulator;
    }

    @Override
    public String toString() {
        return "Explotions{" + "explotionLimit=" + explotionLimit + ", tonsAccumulator=" + tonsAccumulator + '}';
    }   
}