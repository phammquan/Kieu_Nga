package OTC7;

import java.io.*;
import java.util.Scanner;

public class Chuong7 {
    public static void main(String[] args) {

        try {
            FileReader inputFile = new FileReader("input.txt");
            Scanner scanner = new Scanner(inputFile);
            int sum = 0;

            while (scanner.hasNext()) {
                if (scanner.hasNextInt()) {
                    sum += scanner.nextInt();
                } else {
                    scanner.next();
                }
            }

            FileWriter writer = new FileWriter("output.txt");
            writer.write(String.valueOf(sum));
            writer.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}