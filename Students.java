public class Students {
    private String name;
    private int[] bathmoi = new int[5]; // table

    public Students(String n, int[] b) {
        name = n;
        bathmoi = b;
    }

    public void Studentname() {
        System.out.println(name);
    }

    public double moStudent() {
        double mo;
        double sum = 0;
        for (int i = 0; i < bathmoi.length; i++) {
            sum = sum + bathmoi[i];
        }
        mo = sum / bathmoi.length;
        return mo;
    }

}