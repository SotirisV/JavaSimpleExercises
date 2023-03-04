public class MainRadius {

    public static void main(String[] args) {

        AktinaKiklouRadius test = new AktinaKiklouRadius();
        test.perimetros(2, 7.5, 3.14);
        System.out.println("Perimetros: " + test.perimetros(2, 7.5, 3.14));

        AktinaKiklouRadius test1 = new AktinaKiklouRadius();
        test1.area(3.14, 7.5, 7.5);
        System.out.println("Area: " + test1.area(7.5, 3.14, 7.5));

    }

}