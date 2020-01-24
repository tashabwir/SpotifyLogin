package spotifyLogin;

import common.commonAPI;
import org.openqa.selenium.By;

public class spotifyLogin extends commonAPI {

    public static void logIn(String email, String password){
        this.driver.findElement(By.cssSelector("//a[contains(text(),'Log In')]")).click();
        this.driver.findElement(By.id("login-username")).sendKeys(email);
        this.driver.findElement(By.id("login-password")).sendKeys(password);
        this.driver.findElement(By.cssSelector("input[value='Log In']")).click();
    }


}
