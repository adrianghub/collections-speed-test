package com.practice;

import java.time.LocalDate;

public class Book {
    private String title;
    private String author;
    LocalDate publishDate;

    public Book (String title, String author, int publishDay, int publishMonth, int publishYear) {
        this.title = title;
        this.author = author;
        this.publishDate = LocalDate.of(publishYear, publishMonth, publishDay);
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    @Override
    public int hashCode() {
        return publishDate.getYear() * publishDate.getDayOfMonth() + publishDate.getMonthValue();
    }

    @Override
    public boolean equals(Object o) {
        Book b = (Book) o;
        return (title.equals(b.getTitle()) && author.equals(b.getAuthor()) &&
                (publishDate.getYear() == b.getPublishDate().getYear()) &&
                (publishDate.getMonthValue() == b.getPublishDate().getMonthValue()) &&
                (publishDate.getDayOfMonth() == b.getPublishDate().getDayOfMonth()));

    }

    @Override
    public String toString() {
        return "Title: " + title + " ||  Author: " + author;
    }
}
