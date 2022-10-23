import java.util.HashMap;
interface Tracker {
    static HashMap<Integer,Integer> rusers= new HashMap<>();  // tracks the users that didn't return the book
    static HashMap<Integer,String> libBookTakenList = new HashMap<>(); // contains books taken by the user
}
