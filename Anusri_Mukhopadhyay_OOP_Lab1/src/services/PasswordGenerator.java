package services;

import java.security.SecureRandom;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PasswordGenerator {
	
	public String generateSecurePassword() {  
		 
        Stream<Character> demoPassword = Stream.concat(getRandomNumbers(2),   
                Stream.concat(getRandomSpecialChars(2),   
                        Stream.concat(getRandomAlphabets(2, true), getRandomAlphabets(2, false))));  
       List<Character> listOfChar = demoPassword.collect(Collectors.toList());  
         
       // use shuffle() method of the Collections to shuffle the list elements   
       Collections.shuffle(listOfChar);   
       String password = listOfChar.stream()  
               .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)  
               .toString();  
                   
       return password;  
   }  

	private Stream<Character> getRandomSpecialChars(int length) {  
         
       Stream<Character> specialCharsStream;  
       Random random = new SecureRandom();    
       IntStream specialChars = random.ints(length, 33, 45);  
       specialCharsStream =  specialChars.mapToObj(data -> (char) data);   
       return specialCharsStream;  
   }   
	private Stream<Character> getRandomNumbers(int length) {  
         
       Stream<Character> numberStream;    
       Random random = new SecureRandom();    
       IntStream numberIntStream = random.ints(length, 48, 57);  
       numberStream = numberIntStream.mapToObj(data -> (char) data);  
       return numberStream;  
   }   
	private Stream<Character> getRandomAlphabets(int length, boolean check) {  
         
       Stream<Character> lowerUpperStream;  
         
       // for lower case stream  
       if(check == true) {  
           // create instance of SecureRandom  
           Random random = new SecureRandom(); 
           IntStream lCaseStream = random.ints(length, 'a', 'z');  
           lowerUpperStream =  lCaseStream.mapToObj(data -> (char) data);  
       }  
       // for upper case stream  
       else {  
           // create instance of SecureRandom  
           Random random = new SecureRandom(); 
           IntStream uCaseStream = random.ints(length, 'A', 'Z');  
           lowerUpperStream =  uCaseStream.mapToObj(data -> (char) data);  
       }  

       return lowerUpperStream;  
         
   } 
}
