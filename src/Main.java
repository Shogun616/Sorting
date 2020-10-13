import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        books.add(new Book("Dracula", 1897, 110.50));
        books.add(new Book("The Man In The High Castle", 1964, 180.30));
        books.add(new Book("Metro 2033", 2005, 150.10));

        boolean loop = true;

        while (loop){
            System.out.println("\nHow do you want the books sorted");
            System.out.println("1. By year ascending");
            System.out.println("2. By year descending");
            System.out.println("3. By title ascending");
            System.out.println("4. By title descending");
            System.out.println("5. By price descending");
            System.out.println("0. quit");

            System.out.println("\nYour choice:");

            int choice = scan.nextInt();
            scan.nextLine();

            switch (choice){
                case 1:
                    System.out.println("\n=============================");
                    System.out.println(" Books sorted by year ascending");
                    System.out.println("===============================");
                    books.sort(null);

                    for (Book b : books){
                        System.out.println(b);
                    }
                    break;

                case 2:
                    System.out.println("\n=============================");
                    System.out.println(" Book sorted by year descending");
                    System.out.println("===============================");
                    books.sort((b1, b2) -> b2.year - b1.year);

                    for (Book b : books){
                        System.out.println(b);
                    }
                    break;

                case 3:
                    System.out.println("\n=============================");
                    System.out.println(" Book sorted by title ascending");
                    System.out.println("===============================");

                    books.sort((b1, b2) -> b2.title.compareTo(b1.title));

                    for (Book b: books){
                        System.out.println(b);
                    }
                    break;

                case 4:
                    System.out.println("\n==============================");
                    System.out.println(" Book sorted by title descending");
                    System.out.println("================================");

                    books.sort((b1, b2) -> b2.title.compareTo(b1.title));

                    for (Book b : books){
                        System.out.println(b);
                    }
                    break;

                case 5:
                    System.out.println("\n==============================");
                    System.out.println(" Book sorted by price descending");
                    System.out.println("================================");

                    books.sort((b1, b2) -> b2.price.compareTo(b1.price));

                    for (Book b : books){
                        System.out.println(b);
                    }
                    break;

                case 0:
                    loop = false;
                    break;
            }
        }
    }
}
