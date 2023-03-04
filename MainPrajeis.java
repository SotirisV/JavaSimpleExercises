public class MainPrajeis {

    public static void main(String[] args) {

        Prajeis test = new Prajeis(-5, 8, 6, 0, 0, 0);
        test.summul();
        System.out.println(test.summul());

        Prajeis test1 = new Prajeis(55, 9, 9, 0, 0, 0);
        test1.sumdev();
        System.out.println(test1.sumdev());

        Prajeis test2 = new Prajeis(20, -3, 5, 8, 0, 0);
        test2.summuldev();
        System.out.println(test2.summuldev());

        Prajeis test3 = new Prajeis(5, 15, 3, 2, 8, 3);
        test3.sumsubmuldev();
        System.out.println(test3.sumsubmuldev());

    }

}