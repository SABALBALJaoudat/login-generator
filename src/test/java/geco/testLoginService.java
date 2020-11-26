package geco;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class testLoginService {
    private String[] loginsExistants;
    LoginService loginService = new LoginService(loginsExistants);

    @Test
    public void addLogin(){
        this.loginService.addLogin("cde");
        assertTrue(this.loginService.loginExists("cde"));
    }

    @Test
    public void loginExists(){
        this.loginService.loginExists("cde");
        assertTrue(this.loginService.loginExists("cde"));
        this.loginService.loginExists("cdx");
        assertFalse(this.loginService.loginExists("cdx"));
    }
}
