package services;

import entities.Employee;

public interface CredentialOperations {
	public void generatePassword(Employee emp);
	public void generateEmailAddress(Employee emp);
	public void showCredentials(Employee emp);
}
