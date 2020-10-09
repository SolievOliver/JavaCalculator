import java.util.Scanner;

public class Main {
    static int sa = 0,sb =0;
    static boolean f1 = false,f2 = false;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] c = sc.nextLine().split(" ");
        int k = 0;
        String a = "" , b = "", ex = "";
        for(String i : c){
            if(k == 0) a = i;
            if(k == 1) ex = i;
            if (k == 2) b = i;
            k++;
        }


        if (a.contains("I") || a.contains("V") || a.contains("X"))
            f1 = true;
        if (b.contains("I") || b.contains("V") || b.contains("X"))
            f2 = true;
        if (f1 == f2) {
            if(f1) {
                sa = Helper.tranceNumRim(a);
                sb = Helper.tranceNumRim(b);
            }else {
                sa = Helper.tranceNumArab(a);
                sb = Helper.tranceNumArab(b);
            }
            if(sa!=-1 && sb!=-1)
                Helper.expressions(ex);
            else
                System.out.println("Invalid");
        }else
            System.out.println("Invalid");

    }
}
