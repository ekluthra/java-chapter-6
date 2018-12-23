import java.util.Scanner;

public class FormalGreeting{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String name;
        
        System.out.print("Enter your title and name");
        name = scan.nextLine();
        
        if (name.startsWith("Mr.")){
            System.out.println("Hello, sir");
        }
        else if ((name.startsWith("Mrs.")) || (name.startsWith("Ms.")) || (name.startsWith("Miss"))){
            System.out.println("Hello, madam");
        }
        else{
        System.out.format("Hello, %s", name);
        }
    }
}