package _24_Builder.Book;

/*
* Book 클래스
* 필드
* int bookId;
* String title;
* String author;
* String inbn
* 빌더 패턴 객체 생성
* build()시 title 또는 author 필드가 비어 있으면
* "title 또는 author 필드가 비어 있습니다." 출력 (null값 유지, 객체는 생성됨)
* isbn(String)이 13자리가 아니라면
* "올바른 ISBN 형식이 아닙니다." 출력 (null값 유지, 객체는 생성됨)
* toString() 오버라이드 하여 모든 필드 출력
* */

import lombok.ToString;

@ToString

public class Book {
    private int bookId;
    private String title;
    private String author;
    private String isbn;

    private Book(Builder builder) {
        this.bookId = builder.bookId;
        if (builder.title == null|| builder.title.isBlank()) System.out.println("title 또는 author 필드가 비어 있습니다.");
        else {
            this.title = builder.title;
        }
        if (builder.author == null || builder.author.isBlank()) System.out.println("title 또는 author 필드가 비어 있습니다.");
        else {
            this.author = builder.author;
        }
        if (builder.isbn.length() != 13) System.out.println("올바른 ISBN 형식이 아닙니다.");
        else this.isbn = builder.isbn;
    }

    public static class Builder {
        private int bookId;
        private String title;
        private String author;
        private String isbn;

        public Builder bookId(int bookId) {
            this.bookId = bookId;
            return this;
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder author(String author) {
            this.author = author;
            return this;
        }

        public Builder isbn(String isbn) {
            this.isbn = isbn;
            return this;
        }

        public Book build() {
            return new Book(this);
        }

    }

}
