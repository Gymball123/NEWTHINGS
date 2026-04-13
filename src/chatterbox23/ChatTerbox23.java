/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chatterbox23;
import java.util.Scanner;

/**
 *
 * @author atang
 */
public class ChatTerbox23 {

    public static void main(String[] args) {
        
        Login user = new Login();
 
        Scanner scan = new Scanner(System.in);
        
        String username;
        String password;
        String Number;
        
        while (true) {
        System.out.print("Create username : ");
        username = scan.nextLine();
        
        if(user.checkUserName(username)){
            System.out.println("Username succeessfully captured.");
            break;
        } else {
            System.out.println("Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length.");
        }
        }
        
        while (true) {
        System.out.print("Create password : ");
        password = scan.nextLine();
        
        if (user.checkPasswordComplexity(password)){
            System.out.println("Password successfully captured");
            break;
        } else {
            System.out.println("Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.");
        }
        }
        
        while (true) {
        System.out.print("Enter cell number : ");
        Number = scan.nextLine();
        
        if (user.checkCellPhoneNumber(Number)){
            System.out.println("Cell phone numn Numa                                                                                                                                                                                                                                    ber successfully added.");
            break;
        } else {
            System.out.println("Cell phone number incorrectly formatted or does not contain international code; please correct the number and try again.");
        }
        }
        
        String result = user.registerUser(username, password, Number);
        System.out.println(result);
        
        System.out.println("\n====== Login ======");
        
        System.out.print("Enter username : ");
        String loginUser = scan.nextLine();
        
        System.out.print("Enter password : ");
        String loginPass= scan.nextLine();
        
        boolean sucess = user.loginUser(loginUser, loginPass);
        
        System.out.print("Enter your First Name : ");
        String firstName = scan.nextLine();
        
        System.out.print("Enter your Last Name : ");
        String lastName = scan.nextLine();
        
        user.firstName = firstName;
        user.lastName = lastName;
        
        System.out.println(user.returnLoginStatus(sucess));
    }
        }