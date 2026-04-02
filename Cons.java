import java.util.Scanner;
public class Cons {
   static class Author {
     String name;
     Book[] books;
        Author(String name, Book[] books) {
            this.name = name;
            this.books = books;
        }
        void display(){
            System.out.println("Authors Name - "+name);
            for(int i =0;i<books.length;i++){
                books[i].display();
            }
        }
    }
   static class Book{
        String title;
        int number;
        Book(String title,int number){
            this.title = title;
            this.number = number;
        }
        void display(){
            System.out.println(title + " - "+number);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Author Name: ");
        String name = sc.nextLine();
        System.out.print("How many books: ");
        int n = sc.nextInt();
        sc.nextLine();

        Book[] books = new Book[n];

        for(int i =0;i<n;i++){
            System.out.println("Enter book title: ");
            String title = sc.nextLine();
            System.out.println("Enter Numbers: ");
            int number = sc.nextInt();
            sc.nextLine();

            books[i] = new Book(title, number);
        }
        Author a = new Author(name, books);
        a.display();
    }
    
}
