package com.pks.demo.package1;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for( int i = 1; i <= 5 ; i ++) {
			for ( int j = 1 ; j<=i ; j ++) {
				System.out.print("*"+" ");
			}
			for ( int j = 1; j <= (5-i)*2; j++) {
				System.out.print("  ");
			}
			for ( int j = 1 ; j<=i ; j ++) {
				System.out.print("*"+ " ");
			}
			System.out.println();
		}
		
		for( int i = 5; i >= 1 ; i --) {
			for ( int j = 1 ; j<=i ; j ++) {
				System.out.print("*"+ " ");
			}
			for ( int j = 1; j <= (5-i)*2; j++) {
				System.out.print("  ");
			}
			for ( int j = 1 ; j<=i ; j ++) {
				System.out.print("*"+ " ");
			}
			System.out.println();
		}
	}

}
