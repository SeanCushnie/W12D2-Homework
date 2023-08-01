import java.util.ArrayList;

public class Borrower {
    private String name;
    private ArrayList<Book> collection;

    public Borrower(String name) {
        this.name = name;
        this.collection = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public void addBookToCollection(Book book){
        this.collection.add(book);
    }
    public int getCollectionCount(){
        return this.collection.size();
    }
    public void pickUpBookFromLibrary(Library library) {
        if(library.getStockCount() > 0){
            Book bookRemoved = library.removeFromStock();
            this.addBookToCollection(bookRemoved);
        }
    }
}
