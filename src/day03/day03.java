package day03;

public class day03 {
    public static void main(String[] args) {
        //String a = "hello";
        //String b = "ll";
        //System.out.println(strStr(a,b));;
        String a = "sdfwsdfsffasdfasdfaserwerwercvxcvxcvxcvxcvfgdfgsdfgdfgbodysdfsdf";
        String b = "body";
        System.out.println(strStr1(a,b));

    }

    private static int strStr(String a, String b) {
        return a.indexOf(b);
    }

    private static int strStr1(String a, String b) {
        int aLength = a.length();
        int bLength = b.length();
        if(aLength<bLength){
            return -1;
        }else if(a.equals("") || a.equals("")){
            return 0;
        }else if(a.equals("")){
            return 0;
        }else if(b.equals("")){
            return 0;
        }

        for (int i = 0; i < aLength-bLength; i++) {
            String check = a.substring(i,bLength+i);
            if(check.equals(b)){
                return i;
            }
        }
        return -1;
    }


    private static int strStr2(String a, String b) {
        int aLength = a.length();
        int bLength = b.length();
        if(aLength<bLength){
            return -1;
        }else if(a.equals("") || a.equals("")){
            return 0;
        }else if(a.equals("")){
            return 0;
        }else if(b.equals("")){
            return 0;
        }
        char checkb = b.charAt(0);
        for (int i = 0; i < aLength - bLength; i++) {
            char checka = a.charAt(i);
            if(checka == checkb){
                String check = a.substring(i,bLength+i);
                if(check.equals(b)){
                    return i;
                }
            }
        }
        return -1;
    }
}

