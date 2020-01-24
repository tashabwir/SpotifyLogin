package java;

import common.commonAPI;
import org.testng.annotations.Test;
import spotifyLogin.spotifyLogin;

public class login extends commonAPI {
    @Test
    public void testUserCanLogIn(){
        driver.get("https://discordapp.com/login");
        spotifyLogin login = new spotifyLogin();
        spotifyLogin.logIn("heyitsnels@gmail.com","niloy007");
    }

}
