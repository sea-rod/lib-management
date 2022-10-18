public class LibrarianUtil extends Login implements Tracker  {
    void addBook(){
        System.out.println("Enter Book name:");
        String name = scn.nextLine();
        System.out.println("Enter book code:");
        int code = scn.nextInt();
        scn.nextLine();
        books.put(code, name);
    }
    
    void removeBooks(){
        System.out.println("Enter the book code:");
        int code = scn.nextInt();
        scn.nextLine();
        books.remove(code);
    }
    void displayAvailBooks(){
        System.out.println("Books Available");
        books.forEach((code,name)-> System.out.println(code+" : "+name));
    }
    void displayTakenBooks(){
        System.out.println("\nBook that are taken");
        System.out.println("Id:Name of the book");
        rusers.forEach((roll,code)->System.out.println(roll+":"+libBookTakenList.get(code)));

    }


}
