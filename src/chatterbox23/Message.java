/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chatterbox23;
import java.util.*;
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
        if (store.equalsIgnoreCase("Send") ) {
            this.store = "Sent";
            Total++;
            
            // Append to total messages tracking log
            Log += "ID: " + this.MessageID + " | To: " + this.RecipientCell + " | Status: Sent\n";
            return "Message successfully sent.";
            
        } else if (store.equalsIgnoreCase("Discard")) {
            this.store = "Disregarded";
            return "Press 0 to delete the message.";
            
        } else if (store.equalsIgnoreCase("Store")) {
            this.store = "Stored";
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
    
    
       
    
        
        
        
    




        
    
