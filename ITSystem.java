package com.greatlearnig.main;

import java.util.Scanner;

import com.greatlearning.model.Employee;
import com.greatlearning.service.CredentialService;

public class ITSystem {

	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		Employee emp=new Employee("Harshit","Choudhary");
		System.out.println("Dear "+emp.getFirstName()+" your generated credentials are as follows");
		
		System.out.println("Please enter the departent from the following");
		System.out.println("1.Technical");
		System.out.println("2.Admin");
		System.out.println("3.Human Resourse");
		System.out.println("4.Legal");
		
		System.out.println("Dear "+emp.getFirstName()+" your generated credentials are as follows");
		CredentialService cs=new CredentialService();
		String s=String.valueOf(cs.generatePassword());
		int option=Integer.parseInt(scanner.nextLine());
		char [] generatedPassword;
		String generatedEmail;
		switch(option)
		{
		
		case 1:
		generatedPassword=cs.generatePassword();
		generatedEmail=cs.generateEmailAddress(emp,"tech");
		cs.showCredentials(emp,generatedEmail,generatedPassword);
		break;
		
		
			
		case 2:
			generatedPassword=cs.generatePassword();
			generatedEmail=cs.generateEmailAddress(emp,"admin");
			cs.showCredentials(emp,generatedEmail,generatedPassword);
		break;
		
		
			
		case 3:
			generatedPassword=cs.generatePassword();
			generatedEmail=cs.generateEmailAddress(emp,"hr");
			cs.showCredentials(emp,generatedEmail,generatedPassword);
		break;
		
		
			
		case 4:
			generatedPassword=cs.generatePassword();
			generatedEmail=cs.generateEmailAddress(emp,"legal");
			cs.showCredentials(emp,generatedEmail,generatedPassword);
		break;
		}
		scanner.close();
	}

}
