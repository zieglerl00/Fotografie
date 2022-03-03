public class Lens {

    private double minWidth;
    private double maxWidth;

    public static int createdLensCounter;

    public Lens(double minWidth, double maxWidth) {
        if (minWidth < maxWidth){
            this.minWidth = minWidth;
            this.maxWidth = maxWidth;
        }
        else{
            throw new IllegalArgumentException("LensMinCantBeSmallerThenMaxWidth");
        }

        createdLensCounter++;
    }

    public void setMinWidth(double minWidth) {
        if (minWidth < this.maxWidth){
            this.minWidth = minWidth;
        }
        else{
            throw new IllegalArgumentException("LensMinCantBeSmallerThenMaxWidth");
        }

    }

    public void setMaxWidth(double maxWidth) {
        if (maxWidth > this.minWidth){
            this.maxWidth = maxWidth;
        }
        else{
            throw new IllegalArgumentException("LensMaxCantBeSmallerThenMin");
        }
    }

    public double getMinWidth() {
        return minWidth;
    }

    public double getMaxWidth() {
        return maxWidth;
    }

    @Override
    public String toString(){

        return "\n\tminWidth: " + minWidth + "\n\tmax width: " + maxWidth + "\n\tcreated: " + createdLensCounter;
    }
}
