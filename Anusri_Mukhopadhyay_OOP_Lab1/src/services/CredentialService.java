package services;

import java.security.SecureRandom;  
import java.util.Collections;  
import java.util.List;  
import java.util.Random;  
import java.util.stream.Collectors;  
import java.util.stream.IntStream;  
import java.util.stream.Stream;  

import entities.*;

public class CredentialService extends PasswordGenerator implements CredentialOperations{
	Employee emp;
	
	public void generatePassword(Employee emp) {
	     emp.setPassword(generateSecurePassword());  
	}
	
	public void generateEmailAddress(Employee emp) {
	    emp.setEmailAddr(emp.getfName().toLowerCase() + emp.getlName().toLowerCase()+ "@" + emp.getDept() + ".abc.com");
	}
	
	public void showCredentials(Employee emp) {
		this.emp = emp;
		generateEmailAddress(emp);
		generatePassword(emp);
		System.out.println("Dear " + this.emp.getfName() + " your generated credentials are as follows: ");
		System.out.println("Email 	---> " + this.emp.getEmailAddr());
		System.out.println("Password 	---> " + this.emp.getPassword());
	}
	
	 

}
