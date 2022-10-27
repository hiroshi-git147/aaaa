package test01;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
    	int[] array = getUserNumber(4);
    	for(int i = 0; i < array.length; i++) {
    		System.out.print(array[i]);
    	}

     }

    public static int[] getUserNumber(int size) {
    	Scanner sc = new Scanner(System.in);
    	int[] userNum = new int[size];
    	System.out.println("4桁の数字を入力してください");
    	int user;
    	for(int i = 0; i < 4; i++){
    		try {
	    		user = sc.nextInt();
	    		userNum[i] = user;
	    	} catch(Exception e) {
				System.out.println("数字を入力してください");
				sc.next();
	    	}
    	}
    	return userNum;
    }
}