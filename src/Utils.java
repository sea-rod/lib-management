public class Utils extends Login implements Tracker{
    /**
     * This method is called when a user takes a book
     * It removes the book from the book list and adds to the taken book list
     */
    void takeBook(){
        displayBooks();
        System.out.println("Enter Book Code:");
        int code = scn.nextInt();
        scn.nextLine();
        if(books.containsKey(code)){
            System.out.println("Enter Your ID:");
            int roll = scn.nextInt();
            scn.nextLine();
            if(rusers.containsKey(roll)){
                System.out.println("\nPlease Return The Previous Book You Have Taken");
            }
            else{
                System.out.println("Collect your book");
                rusers.put(roll,code);
                takenBook.put(code,books.get(code));
                libBookTakenList.putAll(takenBook);
                books.remove(code);
            }
        }
        else{
            System.out.println("Book does not exist or isn't available");
        }

    }

    /**
     * Displays the book available
     */
    void displayBooks(){
        System.out.println();
        System.out.printf("%-10s: Name%n","Code");
        books.forEach((c,n)->System.out.printf("%-10d: %s%n",c,n));
    }

    /**
     * Displays books that are taken
     */
    void displayTakenBooks(){
        System.out.println();
        System.out.printf("%-10s: Name%n","Code");
        takenBook.forEach((c,n)->System.out.printf("%-10d: %s%n",c,n));
    }


    /**
     * This method is called when the user returns the book
     * It removes the book from the taken book list and adds it back to the book list
     * @return It returns 1 if no books are return else it returns 0
     */
    public int returnBook() {
        if(takenBook.isEmpty()){
            System.out.println("No books are taken");
            return 1;
        }
        displayTakenBooks();
        System.out.println("Enter the book code your returning:");
        int code = scn.nextInt();
        scn.nextLine();
        if (takenBook.containsKey(code)){
            System.out.println("Enter Your ID:");
            int roll = scn.nextInt();
            scn.nextLine();
            if(!rusers.containsKey(roll) || code != rusers.get(roll)){
                System.out.println("\nBook return unsuccessful, check ID and book code");
                return 1;
            }
            books.put(code,takenBook.get(code));
            takenBook.remove(code);
            rusers.remove(roll);
        }
        else
            System.out.println("No Book With That Code");
        return 0;

    }
}
