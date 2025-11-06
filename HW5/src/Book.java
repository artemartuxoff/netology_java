public class Book {
    String title;
    int releaseYear;
    Author author;
    int page;

    public static final int PRICE_PAGE = 3;

    public String toString(){
        return author.name + " " + author.surname + ": " + title;
    }

    public Book(String title, int releaseYear, Author author, int page) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.author = author;
        this.page = page;
    }

    public boolean isBig() {
        return page > 500;
    }

    public boolean matches(String word) {
        if (title.contains(word) || author.name.contains(word) || author.surname.contains(word)) {
            return true;
        } else {
            return false;
        }
    }

    public int estimatePrice() {
        int price = (int) Math.floor(PRICE_PAGE * page * Math.sqrt(author.rating));
        return Math.max(price, 250);
    }
}