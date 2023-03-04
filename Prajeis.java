public class Prajeis {

    private int x, y, z, k, l, a;

    public Prajeis(int x, int y, int z, int k, int l, int a) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.k = k;
        this.l = l;
        this.a = a;
    }

    public int summul() {
        return (x + y) * z;
    }

    public int sumdev() {
        return (x + y) / z;
    }

    public int summuldev() {
        return x + y * z / k;
    }

    public int sumsubmuldev() {
        return x + y / z * k - l % a;
    }

}