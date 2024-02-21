package Emailapp;

import java.util.Scanner;

public class Emailapp {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first name");
	
		String firstName=s.next();
		System.out.println("enter second name");
		String lastName=s.next();
	     Email e = new Email(firstName,lastName);

	}

 }
