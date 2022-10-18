public class LibrarianUtil extends Login implements Tracker  {
    void addBook(){
        System.out.println("\nEnter Book name:");
        String name = scn.nextLine();
        System.out.println("Enter book code:");
        int code = scn.nextInt();
        scn.nextLine();
        books.put(code, name);
    }
    
    void removeBooks(){
        System.out.println("\nEnter the book code:");
        int code = scn.nextInt();
        scn.nextLine();
        books.remove(code);
    }
    void displayAvailBooks(){
        System.out.println();
        System.out.println("Books Available:-");
        books.forEach((code,name)-> System.out.println(String.format("%10d:%s",code,name)));
    }
    void displayTakenBooks(){
        System.out.println("\nBook that are taken");
        System.out.println("Book taken by:Name of the book");
        rusers.forEach((roll,code)->System.out.println(String.format("%13d:%s",roll,libBookTakenList.get(code))));

    }
  

}
