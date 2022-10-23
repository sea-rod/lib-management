public class LibrarianUtil extends Login implements Tracker  {
    /**
     * Adds a book to the book list
     */
    void addBook(){
        System.out.println("Enter book Code:");
        int code = scn.nextInt();
        scn.nextLine();
        if(books.containsKey(code) || libBookTakenList.containsKey(code)){
            System.out.println("\nBook With That Code Already Exist");
        }
        else{
            System.out.println("\nEnter Book Name:");
            String name = scn.nextLine();
            books.put(code, name);
        }
    }
    
    /**
     * Removes a book from the book list
     */
    void removeBooks(){
        displayAvailBooks();
        System.out.println("\nEnter Book Code:");
        int code = scn.nextInt();
        scn.nextLine();
        if(!books.containsKey(code)) {
            System.out.println("\nCannot remove a book that doesn't exist");
        } else {
            books.remove(code);
            System.out.println("\nBook removed successfully");

        }
    }

    /**
     * Displays the books that are available
     */
    void displayAvailBooks(){
        System.out.println();
        System.out.println("\nBooks Available:-");
        System.out.println("Code      : Name");
        books.forEach((code,name)-> System.out.printf("%-10d: %s%n",code,name));
    }

    /**
     * Displays the books that are taken and by whom they are taken
     */
    void displayTakenBooks(){
        if(libBookTakenList.isEmpty()){
            System.out.println("\nNo Books Are Taken");
        }
        else{
            System.out.println("\nBook That Are Taken");
            System.out.println("Book Taken By : Name Of The Book");
            rusers.forEach((roll,code)->System.out.printf("%-13d : %s%n",roll,libBookTakenList.get(code)));
        }

    }
  

}
