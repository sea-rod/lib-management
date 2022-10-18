import java.util.HashMap;
interface Tracker {
// tracks the users that didn't return the book
    static HashMap<Integer,Integer> rusers= new HashMap<>();
    static HashMap<Integer,String> libBookTakenList = new HashMap<>(); // contains books taken by the user
}
