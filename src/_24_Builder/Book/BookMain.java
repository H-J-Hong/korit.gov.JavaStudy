package _24_Builder.Book;

public class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book.Builder()
                .bookId(1)
                .author("홍해준")
                .title("일기장")
                .isbn("8888881111111")
                .build();
        System.out.println(book1.toString());

        Book book2 = new Book.Builder()
                .bookId(2)
                .author("홍길동")
                .isbn("999992222222")
                .build();
        System.out.println(book2.toString());
    }
}
