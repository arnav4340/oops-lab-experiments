import java.io.*;
import java.util.Scanner;

public class WordCounter{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String fileName = scanner.nextLine();
        
        try{
            Scanner fileScanner = new Scanner(new File(fileName));
            int wordCount = 0, charCount = 0;
            
            while (fileScanner.hasNext()){
                String word = fileScanner.next();
                wordCount++;
                charCount += word.length();
            }
            
            System.out.println("Total words: " + wordCount);
            System.out.println("Total characters (excluding whitespace): " + charCount);
            fileScanner.close();
        } catch (FileNotFoundException e){
            System.out.println("File not found.");
        }
        scanner.close();
}
}
