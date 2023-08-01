import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;
    private Book book4;
    private Book book5;

    @Before
    public void before() {
        book1 = new Book("book1", "author1", "genre1");
        book2 = new Book("book2", "author2", "genre2");
        book3 = new Book("book3", "author3", "genre3");
        book4 = new Book("book4", "author4", "genre4");
        book5 = new Book("book5", "author5", "genre5");
        library = new Library("name1", 5);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
    }

    @Test
    public void hasName(){
        assertEquals("name1", library.getName());
    }
    @Test
    public void hasCapacity(){
        assertEquals(5, library.getCapacity());
    }
    @Test
    public void canAddBook(){
        library.addBook(book5);
        assertEquals(5, library.getStockCount());
    }
    @Test
    public void canRemoveBook(){
        library.removeFromStock();
        assertEquals(3, library.getStockCount());
    }
}
