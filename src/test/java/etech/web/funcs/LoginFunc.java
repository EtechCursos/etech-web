package etech.web.funcs;


import etech.web.common.BaseTest;
import etech.web.pages.LoginPage;

public class LoginFunc extends BaseTest {

    LoginPage loginPage = new LoginPage();
    public void acessarTelaLogin(){
        driver.get("https://automation-web.etech.dev/login");
    }

    public void realizarLogin(String usuario, String senha){
        driver.findElement(loginPage.getCampoEmailRegistrado()).sendKeys(usuario);
        driver.findElement(loginPage.getCampoSenhaRegistrada()).sendKeys(senha);
        driver.findElement(loginPage.getBotaoEntrar()).click();
    }

    public String getNomeEsqueciSenha() {
        return driver.findElement(loginPage.getCampoEsqueciSenha()).getText();
    }

    public void clicarCampoCriarConta(){
        driver.findElement(loginPage.getCampoCriarConta()).click();
    }
}
