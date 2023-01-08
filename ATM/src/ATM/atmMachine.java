package ATM;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Project is still not done 
 */


public class atmMachine {

  private double  balance ;
 private String pin;
 private int option ; 

 public int getOption(){
  return this.option;
 }//getOption

 public void setOption(int option){
if (option == 1 ) {
  Withdraw();

}else if(option == 2 ){

deposit();

}else if(option == 3){

  checkBalance();

}else{

  throw new IllegalArgumentException("Invalid option");
}// if 
this.option = option;
 
}//setOption
/**
 * @return the balance
 */
public double getBalance() {
  return this.balance;
}//getBalance
/**
 * @param balance the balance to set
 */
public void setBalance(double balance) {
  this.balance = balance;
}//setBalance
/**
 * @return the pin
 */
public String getPin() {
  return this.pin;
}//getPin
/**
 * @param pin the pin to set
 */
public void setPin(String pin) {

Pattern pattern = Pattern.compile("^[0-9]{4}$");
Matcher match = pattern.matcher(pin);
boolean isValidPattern = match.find();
  
if (isValidPattern == false) {
  throw new IllegalArgumentException("Invalid pin pattern");

}else{

  this.pin = pin;
}// if
}//setPin

 
public void enterPin(){

  Scanner scan = new Scanner(System.in);

  System.out.print("Enter Pin: ");
  String foo = scan.nextLine();
  this.setPin(foo);
  this.optionMenu();

}//inputPin

public void optionMenu(){
Scanner scan = new Scanner(System.in);

boolean bool = false  ; 

while(bool == false ){

  
System.out.println("What would you like to do today? ");
System.out.println("1. Withdrawal\n"
+ "2. Deposit\n"
+ "3. View Balance");
int option_ = scan.nextInt();
this.setOption(option_);

}//while loop



}//optionMenu

  
  public void Withdraw(){



  }//Withdraw
  

}//class
