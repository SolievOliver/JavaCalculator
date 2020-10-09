public class Helper {
    public static int tranceNumArab(String a){
        return Integer.parseInt(a);
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
        int s = 0;
        if(ex.equals("+"))
            s = Main.sa + Main.sb;
        else if(ex.equals("-"))
            s = Main.sa - Main.sb;
        else if(ex.equals("*"))
            s = Main.sa * Main.sb;
        else if(ex.equals("/"))
            s = Main.sa / Main.sb;
        if(Main.f1){
            StringBuilder ans = new StringBuilder();
            while(s>=100) {
                ans.append("C");
                s-=100;
            }
            while(s>=10) {
                ans.append("X");
                s -= 10;
            }
            if(s == 1) ans.append("I");
            else if(s == 2) ans.append("II");
            else if(s == 3) ans.append("III");
            else if(s == 4) ans.append("IV");
            else if(s == 5) ans.append("V");
            else if(s == 6) ans.append("VI");
            else if(s == 7) ans.append("VII");
            else if(s == 8) ans.append("IIX");
            else if(s == 9) ans.append("IX");
            System.out.println(ans);
        }else System.out.println(s);
    }
}
