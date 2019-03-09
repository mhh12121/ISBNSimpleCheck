package com.dou;

import java.util.regex.Pattern;

public class Generator {
    public String generateISBN(String pID){
        if ((!isNumeric(pID)) || (pID.length()!=12)) {
            System.out.println("Please enter valid productID (should be number and 12 long)");
            return null;
        }
        int res=0;
        StringBuilder s=new StringBuilder();

        for (int i=3;i< pID.length();i++){
            int x=Integer.parseInt(String.valueOf(pID.charAt(i)));
            res+=x*(10-i+3);
            s.append(x);
        }
        if (res%11!=10){
            int x=11-res%11;
            s.append(x);
        }else{
            s.append('X');
        }

        return s.toString();
    }
    //for mass generation usage;
    private static final Pattern numeric=Pattern.compile("\\d+");
    static boolean isNumeric(String s){
        return numeric.matcher(s).matches();
    }
//    private static boolean isNumeric(String str){
//        return str.matches("\\d+");
//
//
//    }
}
