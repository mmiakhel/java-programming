package day59_polymorphism_exceptions.polymorphism;

public class ElementsTest {
    public static void main(String[] args) {
        Link link = new Link();
        link.click();
        link.getText();
        link.sendKeys("hi");
        link.getLinkHref();

        WebElement loginLink = new Link();
        loginLink.click();
        String txt = loginLink.getText();
        System.out.println("txt = " + txt);
        //loginLink.getLinkHref; --> ERROR: getLinkHref is not in WebElement class

        WebElement userName = new InputField();
        userName.sendKeys("wooden spoon");
        userName.click();

        WebElementUtil.clickElement(loginLink);
        WebElementUtil.clickElement(userName);
        //WebElementUtil.clickElement(new String("hello")); --> String is not child of WebElement

        WebElement login = WebElementUtil.getLinkWithText("login");
        login.click();
    }
}
