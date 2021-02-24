package ru.netology.repository;

import ru.netology.domain.Movie;

public class PosterRepository {
    private Movie[] poster = new Movie[0];

    public Movie[] findAll() {
        return poster;
    }

    public void save(Movie newMovie) {
        int length = poster.length + 1;
        Movie[] newPoster = new Movie[length];
        for (int i = 0; i < poster.length; i++) {
            newPoster[i] = poster[i];
        }
        newPoster[newPoster.length - 1] = newMovie;
        poster = newPoster;
    }

    public Movie[] findById(int id) {
        Movie[] movieFind = new Movie[1];
        for (Movie movie : poster) {
            if (movie.getId() == id) {
                movieFind[0] = movie;
            }
        }
        return movieFind;
    }

    public void removeById(int id) {
        int length = poster.length - 1;
        Movie[] newPoster = new Movie[length];
        int index = 0;
        for (Movie movie : poster) {
            if (movie.getId() != id) {
                newPoster[index] = movie;
                index++;
            }
        }
        poster = newPoster;
    }

    public void removeAll() {
        poster = new Movie[0];
    }
}
