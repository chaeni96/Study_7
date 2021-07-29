package com.iu.c2.random;

public class PasswordMian {
	
	public static void main(String[] args) {
		Password p = new Password();
		String password = p.makePassword();
		System.out.println(password);
	}

}
