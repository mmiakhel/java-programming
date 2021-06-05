package day50_inheritance;

public class BookObjects {
    public static void main(String[] args) {
        Book book = new Book();
        book.title = "Intro to Java";
        book.author = "Savitch";
        book.type = "Programming";
        book.price = 85.00;
        //book.pages = 40; ERROR

        System.out.println(book.title);
        System.out.println(book.author);
        System.out.println(book.type);
        System.out.println(book.price);

        AudioBook audioBook = new AudioBook();
        audioBook.author = "Unmest";
        audioBook.length = 60;
        audioBook.narrator = "Muzdalifa";
        audioBook.price = 44.99;
        audioBook.title = "Selenium CookBook";
        audioBook.type = "Automation";
        audioBook.listen();

        EBook eBook = new EBook();
        eBook.title = "Java data structures";
        eBook.author = "Savitch";
        eBook.type = "Programming";
        eBook.price = 85.00;
        eBook.size = 2;
        eBook.pages = 1000;
        eBook.readBook();

    }
}
