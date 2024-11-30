package hust.soict.globalict.garbage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class GarbageCreator {
    public static void main(String[] args) {
        String filename = "E:\\Lab03\\OtherProjects\\hust\\soict\\dsai\\lab01\\hust\\soict\\globalict\\text.txt"; 
        String content = readFile(filename);

        long startTime = System.currentTimeMillis();
        String result = "";
        for (int i = 0; i < 10000; i++) {
            result += content; 
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time to concatenate using + operator: " + (endTime - startTime) + " ms");
    }

    public static String readFile(String filename) {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
}
