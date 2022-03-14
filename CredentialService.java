package com.greatlearning.service;
import java.util.*;

import com.greatlearning.model.Employee;
public class CredentialService {

	public char[] generatePassword()
	{
		String Capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String Small_chars = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
                String symbols = "!@#$%^&*_=+-/.?<>)";
  
  
        String values = Capital_chars + Small_chars +
                        numbers + symbols;
  
        
        Random rndm_method = new Random();
  
        int len=8;
		char[] password = new char[len];
  
        for (int i = 0; i < len; i++)
        {
           
            password[i] =values.charAt(rndm_method.nextInt(values.length()));
  
        }
        return password;
    }
	
	
	
	public String generateEmailAddress(Employee emp, String dept)
	{
		
		String email=emp.getFirstName().toLowerCase()+emp.getLastName().toLowerCase()+"@"+dept+".abc.com";
		return email;
	}
	
	public void showCredentials(Employee emp, String email, char[]password)
	{
		System.out.println("Dear "+emp.getFirstName()+ "your generated credentials are as follows");
		System.out.println("Email        --->  "+email);
		System.out.println("Password ---> " + password);
	}
	
}
