public class Utils extends Login implements Tracker{
    void takeBook(){
        displayBooks();
        System.out.println("Enter Book Code:");
        int code = scn.nextInt();
        scn.nextLine();
        if(books.containsKey(code)){
            System.out.println("Enter Your Student ID or Teacher ID:");
            int roll = scn.nextInt();
            scn.nextLine();
            if(rusers.containsKey(roll)){
                System.out.println("\nPlease Return The Previous Book You Have Taken");
            }
            else{
                System.out.println("Please take the Book");
                rusers.put(roll,code);
                takenBook.put(code,books.get(code));
                libBookTakenList.putAll(takenBook);
                books.remove(code);
            }
        }
        else{
            System.out.println("Book Does Not Exsit Or It Isnt Available");
        }

    }

    void displayBooks(){
        System.out.println();
        System.out.printf("%-10s: Name%n","Code");
        books.forEach((c,n)->System.out.printf("%-10d: %s%n",c,n));
    }

    void displayTakenBooks(){
        System.out.println();
        System.out.printf("%-10s: Name%n","Code");
        takenBook.forEach((c,n)->System.out.printf("%-10d: %s%n",c,n));
    }


    public int returnBook() {
        if(takenBook.isEmpty()){
            System.out.println("No Books Are Taken");
            return 1;
        }
        displayTakenBooks();
        System.out.println("Enter the book code your returning:");
        int code = scn.nextInt();
        scn.nextLine();
        if (takenBook.containsKey(code)){
            System.out.println("Enter Your Roll No:");
            int roll = scn.nextInt();
            scn.nextLine();
            if(!rusers.containsKey(roll) || code != rusers.get(roll)){
                System.out.println("\nYou Cannot Return A Book You Haven't Taken");
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
