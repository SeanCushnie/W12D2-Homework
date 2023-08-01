import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {
    private Borrower borrower;
    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;
    private Book book4;
    private Book book5;

    @Before
    public void before() {
        borrower = new Borrower("Borrower1");
        library = new Library("name1", 5);
        book1 = new Book("book1", "author1", "genre1");
        book2 = new Book("book2", "author2", "genre2");
        book3 = new Book("book3", "author3", "genre3");
        book4 = new Book("book4", "author4", "genre4");
        book5 = new Book("book5", "author5", "genre5");
        library.addBook(book1);
    }

    @Test
    public void hasName(){
        assertEquals("Borrower1", borrower.getName());
    }
    @Test
    public void canAddBookToCollection(){
        borrower.addBookToCollection(book1);
        assertEquals(1, borrower.getCollectionCount());
    }
    @Test
    public void canPickUpBookFromLibrary(){
        borrower.pickUpBookFromLibrary(library);
        assertEquals(0, library.getStockCount());
    }
}
