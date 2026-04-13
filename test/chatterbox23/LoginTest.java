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

    Login user = new Login();

    @Test
    public void usernameShouldBeValid() {
        boolean result = user.checkUserName("kyl_1");
        assertEquals(true, result);
    }

    @Test
    public void usernameShouldBeInvalid() {
        boolean result = user.checkUserName("invalidName");
        assertEquals(false, result);
    }

    @Test
    public void passwordMeetsRequirements() {
        boolean result = user.checkPasswordComplexity("Choco123!");
        assertEquals(true, result);
    }

    @Test
    public void passwordFailsRequirements() {
        boolean result = user.checkPasswordComplexity("weak");
        assertEquals(false, result);
    }

    @Test
    public void cellNumberIsCorrectFormat() {
        boolean result = user.checkCellPhoneNumber("+2783896897");
        assertEquals(true, result);
    }

    @Test
    public void cellNumberIsIncorrectFormat() {
        boolean result = user.checkCellPhoneNumber("08366553");
        assertEquals(false, result);
    }

    @Test
    public void loginShouldSucceed() {
        user.registerUser("kyl_1", "Choco123!", "+2783896897");
        boolean result = user.loginUser("kyl_1", "Choco123!");
        assertEquals(true, result);
    }

    @Test
    public void loginShouldFail() {
        user.registerUser("kyl_1", "Choco123!", "+2783896897");
        boolean result = user.loginUser("wrongUser", "wrongPass");
        assertEquals(false, result);
    }

    @Test
    public void returnSuccessMessage() {
        user.firstName = "Atang";
        user.lastName = "Serongwane";

        String message = user.returnLoginStatus(true);

        assertEquals("Welcome Atang, Serongwane it is great to see you.", message);
    }

    @Test
    public void returnFailureMessage() {
        String message = user.returnLoginStatus(false);

        assertEquals("Username or password incorrect, please try again.", message);
    }
}