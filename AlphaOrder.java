import java.util.Scanner;

public class AlphaOrder{
    public static void main(String[] args){
        String word1, word2;
        Scanner scan = new Scanner(System.in);
        int compareValue;
        
        System.out.print("Enter a word: ");
        word1 = scan.nextLine();
        System.out.print("Enter another word: ");
        word2 = scan.nextLine();
        
        scan.close();
        
        compareValue = word1.compareToIgnoreCase(word2);
        
        if (compareValue == 0){
            System.out.println("The words are the same");
        }
        else if(compareValue < 0){
            System.out.format("In alphabetical order: %s, %s\n", word1, word2);
        }
        else if(compareValue > 0){
            System.out.format("In alphabetical order: %s, %s\n", word2, word1);
        }
        
    }
}