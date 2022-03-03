public class Camera {

    private String brand;
    private int megaPixels;
    private double displaySize;
    private boolean colored;
    private Lens lens;

    public static int created;

    public Camera(String brand, int megaPixels, double displaySize, boolean colored, Lens lens) {
        this.brand = brand;
        this.megaPixels = megaPixels;
        this.displaySize = displaySize;
        this.colored = colored;
        this.lens = lens;
        created++;
    }

    public static int getCreated() {
        return created;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setMegaPixels(int megaPixels) {
        this.megaPixels = megaPixels;
    }

    public void setDisplaySize(double displaySize) {
        this.displaySize = displaySize;
    }

    public void setColored(boolean colored) {
        this.colored = colored;
    }

    public void setLens(Lens lens) {
        this.lens = lens;
    }

    public String getBrand() {
        return brand;
    }

    public int getMegaPixels() {
        return megaPixels;
    }

    public double getDisplaySize() {
        return displaySize;
    }

    public boolean isColored() {
        return colored;
    }

    public Lens getLens() {
        return lens;
    }

    @Override
    public String toString(){
        return "\nCAMERA: \n\n" +
                "Brand: " + brand + "\n" +
                "Displaysize: " + displaySize + "\n" +
                "Megapixels: " + megaPixels + "\n" +
                "Farbfoto: " + colored + "\n" +
                "Created: " + created + "\n" +
                "Lens: " + lens;
    }

}
