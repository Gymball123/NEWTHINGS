/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chatterbox23;

/**
 *
 * @author atang
 */
class Login {
    String username;
    String password;
    String Number;
    String firstName;
    String lastName;

    public boolean checkUserName(String username) {
        if (username.contains("_") && username.length() <= 5) {
            return true;
        } 
        else {
            return false;
        }
    }

    boolean checkPasswordComplexity(String password){
        if(password.length()<8 && password.matches("\\d") || password.contains("!") || password.contains("@") || password.contains("#") || 
            password.contains("$") || password.contains("%") || password.contains("^") || 
           password.contains("&") ||  password.contains("*") ){
            return true;
        }else{
            return false;
        }
    }

public boolean checkCellPhoneNumber(String Num) {
        if (!Num.startsWith("+")){
            return false;
        }
        
        String digits = Num.replace("+", "");
        
        if (digits.length() <= 15 && digits.matches("\\d+")){
            return true;
        }
        else {
            return false;
        }
    }
String registerUser(String username, String password, String Number) {
    this.username = username;
    this.password = password;
    this.Number = Number;
return "User successfully registered!";
        }

    public boolean loginUser (String storeUsername, String storePassword){
        return storeUsername.equals(this.username) && storePassword.equals(this.password);
            }
    public String returnLoginStatus(boolean CorrectLogin){
            if (CorrectLogin){
                return "Welcome " + firstName + ", " + lastName + " it is great to see you.";
            } else{
                return "Username or password incorrect, please try again.";
           }
    }
}
