package day59_polymorphism_exceptions.polymorphism;

public class WebElementUtil {
    public static void clickElement(WebElement element) {
        /**
         * method with polymorphic parameter
         *
         * @param element and can accept any chld class object
         *        like Link, InputField etc
         *                clickElement(new Link());
         *                clickElement(new InputField());
         *                WebElement element = new Link();
         *                WebElement element = new InputField();
         */
        System.out.println("Clicking on Element");
        element.click();
    }

    public static WebElement getLinkWithText(String txt) {
        System.out.println("Searching for a ling with txt = " + txt);
        return new Link();
    }
}
