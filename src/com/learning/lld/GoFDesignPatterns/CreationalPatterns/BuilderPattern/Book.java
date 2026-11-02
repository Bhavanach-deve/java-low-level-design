package com.learning.lld.GoFDesignPatterns.CreationalPatterns.BuilderPattern;

public class Book
{
    private final int id;
    private final String title;
    private final String author;
    private final String isbn;
    private final String category;
    private final String publisher;
    private final int publicationYear;

    // Private constructor
    private Book(BookBuilder builder) {

        this.id = builder.id;
        this.title = builder.title;
        this.author = builder.author;
        this.isbn = builder.isbn;
        this.category = builder.category;
        this.publisher = builder.publisher;
        this.publicationYear = builder.publicationYear;
    }
    public static class BookBuilder{
        private final int id;
        private final String title;
        private final String author;

        private String isbn;
        private String category;
        private String publisher;
        private int publicationYear;

        public BookBuilder(
                int id,
                String title,
                String author) {

            this.id = id;
            this.title = title;
            this.author = author;
        }
        public BookBuilder isbn(String isbn) {

            this.isbn = isbn;

            return this;
        }

        public BookBuilder category(String category) {

            this.category = category;

            return this;
        }

        public BookBuilder publisher(String publisher) {

            this.publisher = publisher;

            return this;
        }

        public BookBuilder publicationYear(int year) {

            this.publicationYear = year;

            return this;
        }
        public Book build() {

            if (title == null || title.isBlank()) {
                throw new IllegalArgumentException(
                        "Book title is required"
                );
            }

            if (author == null || author.isBlank()) {
                throw new IllegalArgumentException(
                        "Book author is required"
                );
            }

            return new Book(this);
        }
    }
}
