import java.util.HashMap;
public class Books {
    static HashMap<Integer, String> books = new HashMap<>(); // Contains the list of books available
    HashMap<Integer,String> takenBook = new HashMap<>(); // Contains the list of books taken by the user

    static void initBooks(){
        books.put(1, "Harry Potter and the Philosopher's stone");
        books.put(2, "Fifty shades of Grey");
        books.put(3, "Atomic Habits");
        books.put(4, "Everything is F*cked");
        books.put(5, "Why Java is Shit");
    }
}
