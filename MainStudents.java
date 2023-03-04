public class MainStudents {

    public static void main(String[] args) {
        // mo = grade point average
        // 5 tables with the names.Infrtont of the name, I write "b" to define the array
        // and I write 5 objects
        int[] bSotiris = { 10, 10, 9, 10, 9 };
        Students Sotiris = new Students("Sotiris", bSotiris);
        int[] bSimos = { 10, 10, 9, 10, 9 };
        Students Simos = new Students("Simos", bSimos);
        int[] bSpyros = { 10, 9, 9, 9, 10 };
        Students Spyros = new Students("Spyros", bSpyros);
        int[] bAlex = { 9, 8, 9, 10, 9 };
        Students Alex = new Students("Alex", bAlex);
        int[] bFotis = { 10, 10, 10, 10, 10 };
        Students Fotis = new Students("Fotis", bFotis);
        // I make a array for the students with the name "spouthastes"
        Students[] spouthastes = new Students[5];
        spouthastes[0] = Sotiris;
        spouthastes[1] = Simos;
        spouthastes[2] = Spyros;
        spouthastes[3] = Alex;
        spouthastes[4] = Fotis;

        /*
         * I want to write first the mo of every student, second the students that
         * have average bigger than 9 and the students with the best mo
         * 
         * I use the methods from the class Students 1)moStudent 2)studentName
         */

        // need to set boolean flag first to be able to display students with mo greater
        // than 9
        // and if one does not exist to display the message that there is no one with
        // the use of if

        // odefine flag
        boolean flag = true;
        double max = 0;
        for (int i = 0; i < spouthastes.length; i++) {
            spouthastes[i].Studentname();
            System.out.println("MO: " + spouthastes[i].moStudent()); // show mo
        }
        // I want mo > 9
        for (int i = 0; i < spouthastes.length; i++) {
            if (spouthastes[i].moStudent() > 9) {

                if (flag) {
                    System.out.println("MO > 9 exoun ");
                    flag = false;
                }

                spouthastes[i].Studentname(); // > 9

                if (spouthastes[i].moStudent() >= max) {
                    max = spouthastes[i].moStudent();
                }

                if (flag) {
                    System.out.println("Kaneis den exei mo > 9");
                }
            }
        }

        // I now want to show Max and who has it

        System.out.println("o max einai: " + max + " kai ton exoun oi: ");

        for (int j = 0; j < spouthastes.length; j++) {
            if (spouthastes[j].moStudent() == max) {
                spouthastes[j].Studentname();
            }
        }
    }
}