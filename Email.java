package Emailapp;

import java.util.Scanner;

public class Email {
private String firstName;
private String lastName;
private String password;
private String depertment;
private String email;
private int mailboxCapacity=500;
private String alternativeEmail;
private int defaultPasswordLength=10;
private String company="Company.com";

//Constructor to receive the first name and last name 
public Email(String firstName, String lastName) {
	this.firstName= firstName;
	this.lastName= lastName;
	System.out.println("Name: "+ this.firstName+" "+this.lastName);
	
	this.depertment=setDepertment();
	System.out.println("Department:"+this.depertment);
	
	this.password=randomPassword(defaultPasswordLength);
	System.out.println("Your Password is: " + this.password);

	email=firstName.toLowerCase()+"."+lastName.toLowerCase()+"."+depertment+"@"+company;
	System.out.println("Your Email is: "+email);
	//calling a method asking for depertment - return the department
}
// ask depertment
private String setDepertment() {
	System.out.println("Depertmant codes:\n 1.Sales\n 2. Development \n 3. Accounting \n 0. none \n Enter Department code: ");
	Scanner s= new Scanner(System.in);
	int deptCode= s.nextInt();
	if(deptCode==1) {return "Sales";}
	else if(deptCode==2) {return "Developer";}
	else if(deptCode==3) {return "Accounting";}
	else {return "";}
}

 //Generate random password
private String randomPassword(int length) {
	String passwordSet="ABCDEFGHIJKLMNOPQRSTVUWXYZ123456789$%@!&#";
	char[] password = new char[length];
	for(int i=0;i<length;i++) {
		int rand=(int)(Math.random()*passwordSet.length());
		password[i]=passwordSet.charAt(rand);
	}
	return new String(password);
	
}

//set mail capacity



//set alternative mail


//change password 

}