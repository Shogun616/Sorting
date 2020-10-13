public class Book implements Comparable<Book>{

    String title;
    int year;
    Double price;

    public Book(String title, int year, double price) {
        this.price = price;
        this.title = title;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", year=" + year + ", price=" + price +
                '}';
    }

    public int compareTo3(Book b){
        return this.year - b.year;
    }

    public int compareTo2(Book b){

        return Integer.compare(this.year - b.year, 0);
    }

    @Override
    public int compareTo(Book b){
        return this.year - (b.year);
    }
}
