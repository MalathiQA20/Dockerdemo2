package com.parabank;

import java.util.Random;

public class helperlib {
	
	 public static String getRandString() {
       String STRLIST = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
       StringBuilder emailstr = new StringBuilder();
       Random rnd = new Random();
       while (emailstr.length() < 18) { // length of the random string.
           int index = (int) (rnd.nextFloat() * STRLIST.length());
           emailstr.append(STRLIST.charAt(index));
       }
       String emailId = emailstr.toString() ;

       return emailId;

   }
public static String getRandnames() {
       String STRLIST = "abcdefghijklmnopqrstuvwxyz";
       StringBuilder namestr = new StringBuilder();
       Random rnd = new Random();
       while (namestr.length() < 15) { // length of the random string.
           int index = (int) (rnd.nextFloat() * STRLIST.length());
           if (namestr.length() == 0) {
           namestr.append(Character.toUpperCase((STRLIST.charAt(index))));
           }
           namestr.append(STRLIST.charAt(index));
          
       }
       String randName = namestr.toString();

       return randName;

   }
	 
public static String getRandGender() {
	String[] genTypeStrings = {"male","female","LGBTQ"};
	Random rnd = new Random();
	int index = (int) (rnd.nextFloat() * genTypeStrings.length);
	String gender = genTypeStrings[index];
	return gender;
	
}

}
