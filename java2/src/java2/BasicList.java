package java2;

import java.util.Scanner;

public class BasicList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scan = new Scanner(System.in);
	
	int[] su = new int[5];
	
	for(int i=0; i<su.length; i++) {
		System.out.print("���ϴ� ���ڸ� �Է��ϼ���");
		su[i]=scan.nextInt();
	}
	for(int k: su) {
		System.out.println(k);
	}
		

	}

}
