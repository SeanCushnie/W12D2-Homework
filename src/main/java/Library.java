import java.util.ArrayList;

public class Library {
    private String name;
    private ArrayList<Book> stock;
    private int capacity;

    public Library(String name, int capacity) {
        this.name = name;
        this.stock = new ArrayList<>();
        this.capacity = capacity;
    }
    public String getName() {
        return this.name;
    }
    public int getCapacity() {
        return this.capacity;
    }
    public int getStockCount(){
        return this.stock.size();
    }
    public void addBook(Book book) {
        if (this.getStockCount() < this.capacity) {
            this.stock.add(book);
        }
    }
    public Book removeFromStock() {
        Book bookRemoved = null;
        if(this.getStockCount() > 0){
            bookRemoved = this.stock.remove(0);
        }
        return bookRemoved;
    }



}
