package ckk.ck;

import java.util.Scanner;

public class big3 {

	public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
		int x = sc.nextInt();
		 int y = sc.nextInt();
		 int z = sc .nextInt();
		 
		 
		 if(x > y && x > z) {
			 System.out.println("x is big");
		 }
		 else if (y>x && y>z){
			 System.out.println("Y is big");
		 }
		 else if (z>x && z>y){
			 System.out.println("z is big");
		 }
		 else {
			 System.out.println("no");
		 }
	}

	}

}
