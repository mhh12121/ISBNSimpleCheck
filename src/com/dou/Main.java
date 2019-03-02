package com.dou;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String pID;
        Scanner input;
        System.out.println("Enter your productID");
        input=new Scanner(System.in);
        pID=input.nextLine();
        while (!pID.equals("quit")){

            Generator g=new Generator();
            String res=g.generateISBN((pID));

            System.out.println("your ISBN:"+res);

            System.out.println("Enter your productID");
            pID=input.nextLine();
        }


    }


}
