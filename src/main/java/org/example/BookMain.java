package org.example;

import java.util.ArrayList;
import java.util.Scanner;

class Book {
    private String title;
    private int numberOfPages;
    private int publicationYear;

    public Book(String title, int numberOfPages, int publicationYear) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.publicationYear = publicationYear;
    }

    public Book(String title, double numberOfPages, double publicationYear) {
        this.title = title;
        this.numberOfPages = (int) numberOfPages;
        this.publicationYear = (int) publicationYear;
    }

    public Book(String title, int numberOfPages, double publicationYear) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.publicationYear = (int) publicationYear;
    }

    public Book(String title, double numberOfPages, int publicationYear) {
        this.title = title;
        this.numberOfPages = (int) numberOfPages;
        this.publicationYear = publicationYear;
    }



    public String getTitle() {
        return title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    @Override
    public String toString() {
        return "Book: " + getTitle() + ", Pages: " + getNumberOfPages() + ", Year: " + getPublicationYear();
    }
}

public class BookMain {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter book title (or press Enter to stop): ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }
            System.out.print("Enter number of pages: ");
            int numberOfPages = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter publication year: ");
            int publicationYear = Integer.parseInt(scanner.nextLine());

            books.add(new Book(title, numberOfPages, publicationYear));
        }

        System.out.print("What would you like to print? (everything/name): ");
        String choice = scanner.nextLine();
        books.add(new Book("Bioook", 400, 1989.25));
        books.add(new Book("Biooawdok", 400.34, 1989.25));
        books.add(new Book("Biogfeook", 400.234, 1989));

        if (choice.equals("everything")) {
            System.out.println("\nList of Books:");
            for (Book book : books) {
                System.out.println(book);
            }
        } else if (choice.equals("name")) {
            System.out.println("\nBook Titles:");
            for (Book book : books) {
                System.out.println(book.getTitle());
            }
        }

        scanner.close();
    }
}
