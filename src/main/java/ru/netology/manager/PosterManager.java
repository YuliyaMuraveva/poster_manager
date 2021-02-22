package ru.netology.manager;

import ru.netology.domain.Movie;

public class PosterManager {
    private Movie[] poster = new Movie[0];

    /* add new movie */
    public void add(Movie newMovie) {
        int length = poster.length + 1;
        Movie[] newPoster = new Movie[length];
        for (int i = 0; i < poster.length; i++) {
            newPoster[i] = poster[i];
        }
        newPoster[newPoster.length - 1] = newMovie;
        poster = newPoster;
    }
//
//    /* get all movie */
//    public Movie[] getAll() {
//        Movie[] result = new Movie[poster.length];
//        for (int i = 0; i < result.length; i++) {
//            int index = result.length - 1 - i;
//            result[i] = poster[index];
//        }
//        return result;
//    }
//
//    /* delete movie from list */
//    public void removeById(int id) {
//        int length = poster.length - 1;
//        Movie[] newPoster = new Movie[length];
//        int index = 0;
//        for (Movie movie : poster) {
//            if (movie.getId() != id) {
//                newPoster[index] = poster[index];
//                index++;
//            }
//        }
//        poster = newPoster;
//    }

    /* get last movie*/
    public Movie[] getLast(int quantity) {
        quantity = Math.min(quantity, poster.length);
        Movie[] result = new Movie[quantity];
        for (int i = 0; i < quantity; i++) {
            int index = poster.length - 1 - i;
            result[i] = poster[index];
        }
        return result;
    }
}
