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

    //Username validation method, I added this after to check if the username meets the required specifications
    public boolean checkUserName(String username) {
        if (username.contains("_") && username.length() <= 5) {
            return true;
                    //"Username successfully captured.";
        } 
        else {
            return false;
                    //"Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length.";
        }
    }

    public boolean checkPasswordComplexity(String password) {

    boolean Uppercase = false;
    boolean Number = false;
    boolean SpecialChar = false;

    if (password.length() <= 8) {
        return false;
    }

    // Can be tricky in this part as it is nested if statements but I managed to get it working
    for (int count = 0; count < password.length(); count++) {

        char check = password.charAt(count);

        if (Character.isUpperCase(check)) {
            Uppercase = true;
        }

        if (Character.isDigit(check)) {
            Number = true;
        }

        if (!Character.isLetterOrDigit(check)) {
            SpecialChar = true;
        }
    }
    return Uppercase && Number && SpecialChar;
}

public boolean checkCellPhoneNumber(String Num) {
        if (!Num.startsWith("+")){
            return false;
        }
        
        String digits = Num.replace("+", "");
        
        if (digits.length() <= 12 && digits.matches("\\d+")){
            return true;
        }
        else {
            return false;
        }
    }
String registerUser(String username, String password, String Number) {
    this.username = username;
    this.password = password;
    this.cellNo = Number;
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
