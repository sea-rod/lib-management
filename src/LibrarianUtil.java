public class LibrarianUtil extends Login implements Tracker  {
    void addBook(){
        System.out.println("Enter book code:");
        int code = scn.nextInt();
        scn.nextLine();
        System.out.println("\nEnter Book name:");
        String name = scn.nextLine();
        books.put(code, name);
    }
    
    void removeBooks(){
        displayAvailBooks();
        System.out.println("\nEnter the book code:");
        int code = scn.nextInt();
        scn.nextLine();
        books.remove(code);
    }
    void displayAvailBooks(){
        System.out.println();
        System.out.println("\nBooks Available:-");
        System.out.println("Code      : Name");
        books.forEach((code,name)-> System.out.printf("%-10d: %s%n",code,name));
    }
    void displayTakenBooks(){
        if(libBookTakenList.isEmpty()){
            System.out.println("\nNo Book has Been Taken");
        }
        else{
            System.out.println("\nBook That Are Taken");
            System.out.println("Book Taken By: Name Of The Book");
            rusers.forEach((roll,code)->System.out.printf("%-13d : %s%n",roll,libBookTakenList.get(code)));
        }

    }
  

}
