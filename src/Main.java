public class Main {
    public static void main(String[] args) {

        Lens lens = new Lens(123,1233);
        Lens lens2 = new Lens(19,200);
        Lens lens3 = new Lens(200,20);

        Camera cam = new Camera("Samsung",12, 123, false, lens);
        System.out.println(Camera.created);
        Camera cam2 = new Camera("Phillips",14, 33, false, lens2);
        Camera cam3 = new Camera("Sony",10, 45, false, lens3);

        cam.setMegaPixels(15);
        cam.setLens(lens2);

        cam.setBrand("Motorola");


        System.out.println(cam.toString());

        System.out.println(cam2.toString());

        System.out.println(cam3.toString());


    }
}
