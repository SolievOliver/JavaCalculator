public class Helper {
    public static int tranceNumArab(String a){
        if(a.equals("0")) return 0;
        else if(a.equals("1")) return 1;
        else if(a.equals("2")) return 2;
        else if(a.equals("3")) return 3;
        else if(a.equals("4")) return 4;
        else if(a.equals("5")) return 5;
        else if(a.equals("6")) return 6;
        else if(a.equals("7")) return 7;
        else if(a.equals("8")) return 8;
        else if(a.equals("9")) return 9;
        else if(a.equals("10")) return 10;
        else return -1;
    }
    public static int tranceNumRim(String a){
        if(a.equals("I")) return 1;
        else if(a.equals("II")) return 2;
        else if(a.equals("III")) return 3;
        else if(a.equals("IV")) return 4;
        else if(a.equals("V")) return 5;
        else if(a.equals("VI")) return 6;
        else if(a.equals("VII")) return 7;
        else if(a.equals("VIII")) return 8;
        else if(a.equals("IX")) return 9;
        else if(a.equals("X"))return 10;
        else return -1;
    }
    public  static  void expressions(String ex){
        if(ex.equals("+")) {
            System.out.println(Main.sa + Main.sb);
        }else if(ex.equals("-")) {
            System.out.println(Main.sa - Main.sb);
        }else if(ex.equals("*")) {
            System.out.println(Main.sa * Main.sb);
        }else if(ex.equals("/")) {
            System.out.println(Main.sa / Main.sb);
        }
    }
}
