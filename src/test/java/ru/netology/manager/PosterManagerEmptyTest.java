package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;

import static org.junit.jupiter.api.Assertions.*;

class PosterManagerEmptyTest {
    private PosterManager manager = new PosterManager(2);
    private Movie first = new Movie(1, "first", "Action", "www.firstUrl.com");
    private Movie second = new Movie(2, "second", "Comedy", "www.secondUrl.com");
    private Movie third = new Movie(3, "third", "Cartoon", "www.thirdUrl.com");

    @Test
    void addToEmpty() {
        manager.add(first);
        Movie[] actual = manager.getLast();
        Movie[] expected = new Movie[]{first};
        assertArrayEquals(expected, actual);
    }

    @Test
    void getLastEmpty() {
        Movie[] actual = manager.getLast();
        Movie[] expected = new Movie[]{};
        assertArrayEquals(expected, actual);
    }

    @Test
    void getLastWithQuantityLessThanInList() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
        Movie[] actual = manager.getLast();
        Movie[] expected = new Movie[]{third, second};
        assertArrayEquals(expected, actual);
    }
}
