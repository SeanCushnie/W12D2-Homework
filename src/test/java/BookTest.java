import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
    private Book book;

    @Before
    public void before() {
        book = new Book("title1", "author1", "genre1" );
    }

    @Test
    public void hasTitle(){
        assertEquals("title1", book.getTitle());
    }
    @Test
    public void hasAuthor(){
        assertEquals("author1", book.getAuthor());
    }
    @Test
    public void hasGenre(){
        assertEquals("genre1", book.getGenre());
    }
}
