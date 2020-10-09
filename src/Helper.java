public class Helper {
    public static int tranceNumArab(String elem){
        boolean f = false;
        for(int i=0;i<elem.length();i++) {
            if(elem.charAt(i) != '1' && elem.charAt(i) != '5' && elem.charAt(i) != '6' && elem.charAt(i) != '8' && elem.charAt(i) != '0' && elem.charAt(i) != '4' && elem.charAt(i) != '7' && elem.charAt(i) != '9' && elem.charAt(i) != '2' && elem.charAt(i) != '3')
                f =  true;
            if (f) break;
        }
        if(f) return -1;
        else return Integer.parseInt(elem);
    }
    public static int tranceNumRim(String elem){
        if(elem.equals("I")) return 1;
        else if(elem.equals("II")) return 2;
        else if(elem.equals("III")) return 3;
        else if(elem.equals("IV")) return 4;
        else if(elem.equals("V")) return 5;
        else if(elem.equals("VI")) return 6;
        else if(elem.equals("VII")) return 7;
        else if(elem.equals("VIII")) return 8;
        else if(elem.equals("IX")) return 9;
        else if(elem.equals("X"))return 10;
        else return -1;
    }
    public  static  void expressions(String expressions){
        int summ = 0;
        if(expressions.equals("+"))
            summ = Main.input1Int + Main.input2Int;
        else if(expressions.equals("-"))
            summ = Main.input1Int - Main.input2Int;
        else if(expressions.equals("*"))
            summ = Main.input1Int * Main.input2Int;
        else if(expressions.equals("/"))
            summ = Main.input1Int / Main.input2Int;
        if(Main.input1Kind){
            StringBuilder ans = new StringBuilder();
            while(summ>=100) {
                ans.append("C");
                summ-=100;
            }
            while(summ>=10) {
                ans.append("X");
                summ -= 10;
            }
            if(summ == 1) ans.append("I");
            else if(summ == 2) ans.append("II");
            else if(summ == 3) ans.append("III");
            else if(summ == 4) ans.append("IV");
            else if(summ == 5) ans.append("V");
            else if(summ == 6) ans.append("VI");
            else if(summ == 7) ans.append("VII");
            else if(summ == 8) ans.append("IIX");
            else if(summ == 9) ans.append("IX");
            System.out.println(ans);
        }else System.out.println(summ);
    }
}
