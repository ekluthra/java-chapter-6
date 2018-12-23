import java.util.Scanner;

public class AverageValue{
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        int numValues = -1;
        int sumValues = 0;
        int userNum;
        double average;
        
        do{
            System.out.print("Enter a value (0 to quit): ");
            userNum = scan.nextInt();
            numValues += 1;
            sumValues += userNum;
        }while(userNum != 0);
        
        average = (double)sumValues/(double)numValues;
        System.out.format("Average is %.1f\n", average);
        
        scan.close();
    }
}