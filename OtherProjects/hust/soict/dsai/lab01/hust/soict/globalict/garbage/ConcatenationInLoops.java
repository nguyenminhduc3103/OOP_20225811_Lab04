package hust.soict.globalict.garbage;
import java.util.Random;

public class ConcatenationInLoops {
    public static void main(String[] args) {
        int iterations = 65536;
        Random r = new Random(123);

        long startTime = System.currentTimeMillis();
        String s = "";
        for (int i = 0; i < iterations; i++) {
            s += r.nextInt(2);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time to do 1: " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sb.append(r.nextInt(2));
         }
        s = sb.toString();
        endTime = System.currentTimeMillis();
        System.out.println("Time to do 2: " + (endTime - startTime) + " ms");
    }
}