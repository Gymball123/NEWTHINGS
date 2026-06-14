/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chatterbox23;
import java.util.*;

/**
 *
 * @author atang
 */
public class ChatTerbox23 {

    public static void main(String[] args) {
       ArrayList<String> sentMessages = new ArrayList<>();
        ArrayList<String> disregardedMessages = new ArrayList<>();
        ArrayList<Message> storedMessages = new ArrayList<>();
        ArrayList<String> messageHashes = new ArrayList<>();
        ArrayList<String> messageIDs = new ArrayList<>();
           Login user = new Login();
            Message text = new Message();
 
 
        Scanner scan = new Scanner(System.in);
        
        String username;
        String password;
        String Number;
        String currentUser;
             
         
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
        
        boolean CorrectLogin = user.loginUser(loginUser, loginPass);
        
        System.out.print("Enter your First Name : ");
        String firstName = scan.nextLine();
        
        System.out.print("Enter your Last Name : ");
        String lastName = scan.nextLine();
        
        user.firstName = firstName;
        user.lastName = lastName;
        
        System.out.println(user.returnLoginStatus(CorrectLogin));
        if (CorrectLogin) {
         System.out.println("\n====== Create a Message ======");
        
        text.MessageID = text.createMessaegID();
        System.out.println("Generated Message ID: " + text.MessageID);
        // Get valid Message ID
        while (true) {
            System.out.print(" Message ID : ");
            String idInput = text.MessageID = text.createMessaegID();
            if (text.checkMessageID(idInput)) {
                text.MessageID = idInput;
                break;
            }
            System.out.println("Invalid Message ID. Please try again.");
        }
        
       
        while (true) {
            System.out.print("Enter Recipient Cell Number (+27..): ");
            String cellInput = scan.nextLine();
            String correct = text.checkRecipientCell(cellInput);
            if (correct.equals("Valid Number")) {
               break;
            }else
            {System.out.println("Invalid recipient format.");            
        }
        
        
        while (true) {
            System.out.print("Enter your Message: ");
            String msgInput = scan.nextLine();
            if (text.checkMessageLength(msgInput)) {
                text.message = msgInput;
                break;
            }
            System.out.println("Message is too long! Keep it under 250 characters.");
        }
        String hash = text.createMessageHash(lastName);
       
        text.MessageHash = hash;
        
       
        System.out.print("Do you want to 'Send', 'Store', or 'Discard' this message? ");
        text.store = scan.nextLine();
        
        String actionResult = text.SentMessage();
        System.out.println(actionResult);
        
        text.saveToJSONManual("message_data.json");
      
       
        if(text.store.equalsIgnoreCase("Send")) {
            sentMessages.add(text.store);
        } else if (text.store.equals("Disregarded")) {
            disregardedMessages.add(text.store);
        } else if (text.store.equals("Stored")) {
            storedMessages.add(text);
            
        }
        
        
        
        
        System.out.println("\n=======SAVED MESSAGE=====");
        System.out.println(text.printMessage());
            System.out.println(storedMessages);
        
        scan.close();
        
    }
}else{
        System.out.println("Access Denied. Exiting application.");
        }
            
            
            
        }
}
         
        


   
       
        
    
        
    
   
    
    
    
    
        