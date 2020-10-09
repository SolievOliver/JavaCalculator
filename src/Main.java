import java.util.Scanner;

public class Main {
    static int input1Int = 0, input2Int =0;
    static boolean input1Kind = false, input2Kind = false;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int counter = 0;
        String input1 = "" , input2 = "", expressions = "";
        for(String elem : input){
            if(counter == 0) input1 = elem;
            if(counter == 1) expressions = elem;
            if (counter == 2) input2 = elem;
            counter++;
        }
        if (input1.contains("I") || input1.contains("V") || input1.contains("X"))
            input1Kind = true;
        if (input2.contains("I") || input2.contains("V") || input2.contains("X"))
            input2Kind = true;
        if (input1Kind == input2Kind) {
            if(input1Kind) {
                input1Int = Helper.tranceNumRim(input1);
                input2Int = Helper.tranceNumRim(input2);
            }else {
                input1Int = Helper.tranceNumArab(input1);
                input2Int = Helper.tranceNumArab(input2);
            }
            if(input1Int !=-1 && input2Int !=-1)
                Helper.expressions(expressions);
            else
                System.out.println("Invalid");
        }else
            System.out.println("Invalid");

    }
}
