/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chatterbox23;
import java.util.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Random;

/**
 *
 * @author atang
 */
class Message {
    String MessageID;
    String RecipientCell;
    String MessageHash;
    String message; 
    String store;
    String Log = "";
    int Total=0;
    
   ArrayList<String> sentMessages = new ArrayList<>();
        ArrayList<String> disregardedMessages = new ArrayList<>();
        ArrayList<Message> storedMessages = new ArrayList<>();
        ArrayList<String> messageHashes = new ArrayList<>();
        ArrayList<String> messageIDs = new ArrayList<>();
        
    public void saveToJSONManual(String filename) {
      
        String jsonString = "{\n" +
                "  \"MessageID\": \"" + MessageID + "\",\n" +
                "  \"RecipientCell\": \"" + RecipientCell + "\",\n" +
                "  \"MessageHash\": \"" + MessageHash + "\",\n" +
                "  \"message\": \"" + message + "\",\n" +
                "  \"store\": \"" + store + "\"\n" +
                "}";

        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(jsonString);
            System.out.println("Success: Message saved manually to " + filename);
        } catch (IOException e) {
            System.out.println("Error saving JSON file: " + e.getMessage());
        }
    }
 
    
    public String createMessaegID(){
        Random ran = new Random();
       long randomId = 1000000000L + (Math.abs(ran.nextLong()) % 9000000000L);
        return String.valueOf(randomId); 
        
        
    }
    boolean checkMessageID(String MessageID){
        if(MessageID.length()<10 && MessageID!=null ){
            
            return true;
            
        }else{return false;
        }
        }
        
    
    
    String checkRecipientCell(String RecipientCell){
        this.RecipientCell= RecipientCell; 
        if(RecipientCell.length()<10 && RecipientCell.contains("+") ){
            return RecipientCell;
            
        }
        return "Invalid Number";
    }
    
    
    
     public boolean checkMessageLength(String message){
         if(message.length()<250){
             return true;
             
         }else{
             return false;
         }
     }
         
         public String createMessageHash(String MessageHash){
             String[] words=message.split("");
             String first= words[0];
             String Last=words[words.length-1];
             MessageHash = MessageID.substring(0,2) + ":" + (first+Last);
           
             return MessageHash;
         }
         
         int returnTotalMessages(int Total){
             return Total;
         }
         public String SentMessage() {
            
        Login user = new Login();
            Message text = new Message();
      
        if (store.equalsIgnoreCase("Send") ) {
            this.store = "Sent";
            sentMessages.add(text.message);
             messageHashes.add(text.MessageHash);
             messageIDs.add(text.MessageID);
            Total++;
            
          
            Log += "ID: " + this.MessageID + " | To: " + this.RecipientCell + " | Status: Sent\n";
            return "Message successfully sent.";
            
        } else if (store.equalsIgnoreCase("Discard")) {
            this.store = "Disregarded";
            disregardedMessages.add(text.message);
            return "Press 0 to delete the message.";
            
        } else if (store.equalsIgnoreCase("Store")) {
            this.store = "Stored";
             
           storedMessages.add(text);
           messageHashes.add(text.MessageHash);
           messageIDs.add(text.MessageID);
           
            Log += "ID: " + this.MessageID + " | To: " + this.RecipientCell + " | Status: Stored\n";
           
            return "Message successfully stored.";
        }
        
        return "Invalid choice.";
    }
         
       
    public String printMessage(){
       return "\nMessage Id: "+ MessageID +
               "\nMessageHash: " + MessageHash +
               "\nCellphone number: "+ RecipientCell +
               "\nMessage: "+message; 
    }

}


    

    
    
       
    
        
        
        
    




        
    
