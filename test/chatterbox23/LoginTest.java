/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package chatterbox23;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author atang
 */
public class LoginTest {
    
    public LoginTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of checkUserName method, of class Login.
     */
    @Test
    public void testCheckUserName() {
        System.out.println("checkUserName");
        String username = "";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.checkUserName(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of checkPasswordComplexity method, of class Login.
     */
    @Test
    public void testCheckPasswordComplexity() {
        System.out.println("checkPasswordComplexity");
        String password = "";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.checkPasswordComplexity(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of checkCellPhoneNumber method, of class Login.
     */
    @Test
    public void testCheckCellPhoneNumberTrue() {
        System.out.println("checkCellPhoneNumber");
        String Num = "";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.checkCellPhoneNumber(Num);
        assertEquals(expResult, result);

    }
    
    @Test
    public void testCheckCellPhoneNumberFalse() {
        System.out.println("checkCellPhoneNumber");
        String Num = "";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.checkCellPhoneNumber(Num);
        assertEquals(expResult, result);

    }
    

    /**
     * Test of registerUser method, of class Login.
     */
    @Test
    public void testRegisterUserTrue() {
        System.out.println("registerUser");
        String username = "kyl_1";
        String password = "Choco";
        String Number = "";
        Login instance = new Login();
        String expResult = "";
        String result = instance.registerUser(username, password, Number);
        assertEquals(expResult, result);

    }
    
    @Test
    public void testRegisterUserFalse() {
        System.out.println("registerUser");
        String username = "";
        String password = "";
        String Number = "";
        Login instance = new Login();
        String expResult = "";
        String result = instance.registerUser(username, password, Number);
        assertEquals(expResult, result);

    }

    /**
     * Test of loginUser method, of class Login.
     */
    @Test
    public void testLoginUser() {
        System.out.println("loginUser");
        String storeUsername = "";
        String storePassword = "";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.loginUser(storeUsername, storePassword);
        assertEquals(expResult, result);

    }

    /**
     * Test of returnLoginStatus method, of class Login.
     */
    @Test
    public void testReturnLoginStatus() {
        System.out.println("returnLoginStatus");
        boolean CorrectLogin = false;
        Login instance = new Login();
        String expResult = "";
        String result = instance.returnLoginStatus(CorrectLogin);
        assertEquals(expResult, result);

    }
    
}
