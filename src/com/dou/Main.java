package com.dou;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String pID;
        Scanner input;
        String warn="Enter your productID or type 'quit' to quit";
        System.out.println(warn);
        input=new Scanner(System.in);
        pID=input.nextLine();
        while (!pID.equals("quit")){

            Generator g=new Generator();
            String res=g.generateISBN((pID));

            System.out.println("your ISBN:"+res);

            System.out.println(warn);
            pID=input.nextLine();
        }


    }


}
