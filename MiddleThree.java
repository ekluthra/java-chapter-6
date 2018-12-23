import java.util.Scanner;

public class MiddleThree{
    public static void main(String[] args){
        String phrase, threeLetters;
        int phraseLength;
        int mid;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter text containing at least three letters: ");
        //nextLine is used for strings
        phrase = scan.nextLine();
        scan.close();
        
        phraseLength = phrase.length();
        mid = phraseLength/2;
        
        threeLetters = phrase.substring(mid - 1, mid + 2);
        System.out.format("The three middle character are %s", threeLetters);
    }
}