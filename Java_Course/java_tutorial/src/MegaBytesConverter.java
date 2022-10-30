package Java_Course.java_tutorial.src;

public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int mb = 0;
            int kb = 0;
            mb= Math.round(kiloBytes / 1024);
            kb = kiloBytes-mb*1024;
            System.out.println(kiloBytes +" KB = " + mb +" MB and "+ kb + " KB");
        }
    }
}