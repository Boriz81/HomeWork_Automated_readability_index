import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static String readFileAsString(String filename) throws IOException {
        return new String(Files.readAllBytes(Paths.get(filename)));
    }
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        /*String string = new String(Files.readAllBytes(Paths.get("C:\\Users\\user\\IdeaProjects\\in.txt")));*/
        String string = scanner.nextLine();
        String[] myArray = string.split(" ");
        String[] myArrSent = string.split("[\\.\\!\\?]");
        String[] myArrChar = string.split("[a-zA-Z_0-9_\\.\\,]");

        double count = 0;
        double countSentences = 0;
        double countCharacter = 0;

        for (int a = 0; a < myArray.length; a++) {
            count++;
        } System.out.println("Words:"+" " + count);

        for (int b = 0; b < myArrSent.length; b++) {
            countSentences++;
        } System.out.println("Sentences:"+" " + countSentences);

        for (int b = 0; b < myArrChar.length; b++) {
            countCharacter++;
        } System.out.println("Characters:"+" " + countCharacter);

        double score = 0;

        score = 4.71 * countCharacter / count + 0.5 * count / countSentences - 21.43;
        System.out.println(score);

        if (score == 1.0 || score < 2.0) {
            System.out.println("This text should be understood by 5-6 year-olds");
        } else if (score == 2.0 || score < 3.0) {
            System.out.println("This text should be understood by 6-7 year-olds");
        } else if (score == 3.0 || score < 4.0) {
            System.out.println("This text should be understood by 7-9 year-olds");
        } else if (score == 4.0 || score < 5.0) {
            System.out.println("This text should be understood by 9-10 year-olds");
        } else if (score == 5.0 || score < 6.0) {
            System.out.println("This text should be understood by 10-11 year-olds");
        } else if (score == 6.0 || score < 7.0) {
            System.out.println("This text should be understood by 11-12 year-olds");
        } else if (score == 7.0 || score < 8.0) {
            System.out.println("This text should be understood by 12-13 year-olds");
        } else if (score == 8.0 || score < 9.0) {
            System.out.println("This text should be understood by 13-14 year-olds");
        } else if (score == 9.0 || score < 10.0) {
            System.out.println("This text should be understood by 14-15 year-olds");
        } else if (score == 10.0 || score < 11.0) {
            System.out.println("This text should be understood by 15-16 year-olds");
        } else if (score == 11.0 || score < 12.0) {
            System.out.println("This text should be understood by 16-17 year-olds");
        } else if (score == 12.0 || score < 13.0) {
            System.out.println("This text should be understood by 17-18 year-olds");
        } else if (score == 13.0 || score < 14.0) {
            System.out.println("This text should be understood by 18-24 year-olds");
        } else if (score >= 14.0) {
            System.out.println("This text should be understood by 24+ year-olds");
        }

    }

}