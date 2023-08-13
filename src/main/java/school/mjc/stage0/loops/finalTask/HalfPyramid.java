package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
        for (int i = cathetusLength; i > 0; i--) {
            // print spaces
            for (int j = 2; j <= i; ++j) {
                System.out.print(" ");
            }
            for (int k = 0; k <= (cathetusLength - i); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}
