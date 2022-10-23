import java.util.HashMap;
interface Tracker {
    static HashMap<Integer,Integer> rusers= new HashMap<>();  // tracks list of users that didn't return the book
    static HashMap<Integer,String> libBookTakenList = new HashMap<>(); // contains list of books taken by the user for the librarian
}
