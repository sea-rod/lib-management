import java.util.HashMap;
public class Books {
    static HashMap<Integer, String> books = new HashMap<>(); // Contains the list of books available
    HashMap<Integer,String> takenBook = new HashMap<>(); // Contains the list of books taken by the user

    static void initBooks(){
        books.put(1, "Psychology of Money");
        books.put(2, "Emotional Intelligence");
        books.put(3, "Atomic Habits");
        books.put(4, "Thinking Fast and Slow");
        books.put(5, "The 5 Second Rule");
    }
}
