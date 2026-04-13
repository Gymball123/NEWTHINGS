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

    /**
     * @param args the command line arguments
     */
    class ChatterBox{
   
    String storeuserName;
    String storepassword;
    String storenumber;
    
    Scanner scan = new Scanner(System.in);
    boolean checknummber(String number){
        if(number.length()<10 && number.contains("27") && number.matches("//d")){
         return false;
            
        }
        return false;
    }
        
    }
    
    
    boolean checkuserName(String storeuserName){
        if(storeuserName.contains("_") && storeuserName.length()==5){
            System.out.print("User namesuccefuly captured");
            return false;
        }
    return false;
        
    }

    
    boolean checkPasswordComplexity(String storepassword){
        if(storepassword.length()<8 && storepassword.matches("\\d") || storepassword.contains("!") || storepassword.contains("@") || storepassword.contains("#") || 
            storepassword.contains("$") || storepassword.contains("%") || storepassword.contains("^") || 
           storepassword.contains("&") ||  storepassword.contains("*") ){
            return true;
        }else{
            return false;
        }
      
      
           
        
       

        void register(){
        System.out.println("========REGISTER========");
        
        System.out.println("Enter your number");
        storenumber=scan.NextInt();
        System.out.println("Eneter your username");
        storeuserName=Next.Line
        System.out.println("Enter your password");
        storepassword=Next.Int();
        
        if(checkNumber(storenumber) && checkuserName(storeuserName)){
            System.out.println("registration succeful");
        }else{
            System.out.println("register unsucceful");
            return false;
        }
          
        
        
  
        
        
    }
    
    
    void login(){
          
        System.out.println("========LOGIN========");
        
        System.out.println("Enter your number");
        number=scan.NextInt();
         System.out.println("Enter your username");
         userName=scan.NextInt();
          System.out.println("Enter your password");
          password=scan.NextInt();
          
          
                  if(checkNumber(number) && checkuserName(userName)){
            System.out.println("registration succeful");
        }else{
            System.out.println("register unsucceful");
        }
    }
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

