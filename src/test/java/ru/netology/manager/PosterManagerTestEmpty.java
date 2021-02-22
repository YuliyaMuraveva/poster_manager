package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;

import static org.junit.jupiter.api.Assertions.*;

class PosterManagerTestEmpty {
    private PosterManager manager = new PosterManager();
    private int quantity = 10;
    private Movie first = new Movie(1, "first", "Action", "www.firstUrl.com");

    @Test
    void addToEmpty() {
        manager.add(first);
        Movie[] actual = manager.getLast(quantity);
        Movie[] expected = new Movie[]{first};
        assertArrayEquals(expected, actual);
    }

    @Test
    void getLastEmpty() {
        Movie[] actual = manager.getLast(quantity);
        Movie[] expected = new Movie[]{};
        assertArrayEquals(expected, actual);
    }
}
