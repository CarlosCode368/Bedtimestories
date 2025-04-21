import java.io.*;
import java.util.Scanner;
class Program {
    public static void main(String args[]) {
        try {
            FileInputStream DataFiles = new FileInputStream("C:\\Users\\Carlos Sarabia\\Desktop\\Year Up United Courses\\Learn to Code Academy LTCA\\DataFiles\\Bedtime Stories\\goldilocks.txt");
            Scanner scanner = new Scanner(DataFiles);
            String input;
            while (scanner.hasNextLine()) {
                input = scanner.nextLine();
                System.out.println(input);
            }
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
