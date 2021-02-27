package com.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@SpringBootApplication
public class CollectionsSpeedTest {

    public static void main(String[] args) {

        SpringApplication.run(CollectionsSpeedTest.class, args);

            Book mainstreamBook = new Book("50 Grays", "Johny Anonim", 21, 5, 2021);

            List<Book> bookList = new LinkedList<>();

            for(int i=0; i < 500000; i++) {
                bookList.add(mainstreamBook);
            }

            System.out.println("Number of all the elements in the LinkedList collection: " + bookList.size());

            ListManager manager1 = new ListManager();

            manager1.addElementAtTheBeginning(bookList, new Book("Mistake in Paris", "Agatha Christie", 29, 2, 1980));

            manager1.addElementAtTheEnd(bookList, new Book("Babylon", "Mesajah Karad", 11, 12, 1922));

            manager1.removeElementFromTheBeginning(bookList, new Book("Głowa do liczb", "Barbara Oakley", 21, 5, 2012));

            manager1.removeElementFromTheEnd(bookList, new Book("The Black Swan", "Nassim Nicolas Taleb", 18, 3, 2001));


            Isbn isbn = new Isbn("abc", 5252622);

            Map<String, Book> libraryData = new HashMap<>();

            for(int i=0; i < 500000; i++) {
                libraryData.put(isbn.generateRandomKey(), mainstreamBook);
            }


            System.out.println("\n\nNumber of all the elements in the HashMap collection: " + libraryData.size());

            Book interestingBook = new Book("The White Swan", "Nikodem Dyzma", 1, 1, 2021);

            String testKey = isbn.generateRandomKey();

            long begin = System.nanoTime();
            System.out.println("\nAdding -> Key: " + testKey + " | Book: " + interestingBook);
            libraryData.put(testKey, interestingBook);
            long end = System.nanoTime();
            System.out.println("Adding element to the HashMap collection has taken: " + (end - begin) + "ns");

            begin = System.nanoTime();
            System.out.println("\nGetting -> " + libraryData.get(testKey));
            end = System.nanoTime();
            System.out.println("Getting element from the HashMap collection has taken: " + (end - begin) + "ns");

            begin = System.nanoTime();
            libraryData.remove(testKey);
            end = System.nanoTime();
            System.out.println("\nRemoving element from the HashMap collection has taken: " + (end - begin) + "ns");

        }

    }
