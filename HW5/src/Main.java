public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Лев", "Толстой", 4);
        Book book1 = new Book("Война и мир", 1869, author1, 1472);

        Author author2 = new Author("Джоан ", "Роулинг ", 3);
        Book book2 = new Book("Гарри Поттер и философский камень", 1997, author2, 432);

        //пример книга №1
        System.out.println(book1);
        System.out.println("Является ли книга большой: " + ((book1.isBig())?"да":"нет"));
        System.out.println("Содержится ли в описании книги слово 'Лев': " + ((book1.matches("Лев"))?"да":"нет"));
        System.out.println("Оценка стоимости книги: " + book1.estimatePrice());

        System.out.println();

        //пример книга №2
        System.out.println(book2);
        System.out.println("Является ли книга большой: " + ((book2.isBig())?"да":"нет"));
        System.out.println("Содержится ли в описании книги слово 'камень': " + ((book2.matches("камень"))?"да":"нет"));
        System.out.println("Оценка стоимости книги: " + book2.estimatePrice());

    }
}