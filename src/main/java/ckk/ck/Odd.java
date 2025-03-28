package ckk.ck;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.*;

public class Odd {

	public static void main(String[] args) {
		Iterable <String> ck = new LinkedList<>();
		List<Integer> kc = new LinkedList<>();
		List<Integer> kk = new LinkedList<>();
		  
		for(int i=0;i<=10;i++) {
			if(i%2==0) {
		
			kk.add(i);}
			else {
				kc.add(i);
				
			}
		}
		
		System.out.println(kk);
		System.out.println(kc);

	}

}
