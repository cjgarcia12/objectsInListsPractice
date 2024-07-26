package org.example;

import java.util.ArrayList;
import java.util.Scanner;

class TvShow {
    private String name;
    private int numberOfEpisodes;
    private String genre;

    public TvShow(String name, int numberOfEpisodes, String genre) {
        this.name = name;
        this.numberOfEpisodes = numberOfEpisodes;
        this.genre = genre;
    }

    public TvShow(String name, int numberOfEpisodes) {
        this.name = name;
        this.numberOfEpisodes = numberOfEpisodes;
    }

    public TvShow(String name, String genre) {
        this.name = name;
        this.genre = genre;
    }

    public TvShow(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfEpisodes() {
        return numberOfEpisodes;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "TV Show: " + getName() + ", Episodes: " + getNumberOfEpisodes() + ", Genre: " + getGenre();
    }
}

public class TvShowMain {
    public static void main(String[] args) {
        ArrayList<TvShow> tvShows = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter TV show name (or press Enter to stop): ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            System.out.print("Enter number of episodes: ");
            int numberOfEpisodes = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter genre: ");
            String genre = scanner.nextLine();

            tvShows.add(new TvShow(name, numberOfEpisodes, genre));
        }

        tvShows.add(new TvShow("January 1", 35));
        tvShows.add(new TvShow("January 2", "Romance"));
        tvShows.add(new TvShow("January 3"));

        System.out.println("\nList of TV Shows:");
        for (TvShow tvShow : tvShows) {
            System.out.println(tvShow);
        }

        scanner.close();

    }
}
