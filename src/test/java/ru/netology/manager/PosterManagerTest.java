package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;

import static org.junit.jupiter.api.Assertions.*;

class PosterManagerTest {
    private PosterManager manager = new PosterManager();
    private Movie first = new Movie(1, "first", "Action", "www.firstUrl.com");
    private Movie second = new Movie(2, "second", "Comedy", "www.secondUrl.com");
    private Movie third = new Movie(3, "third", "Cartoon", "www.thirdUrl.com");
    private Movie fourth = new Movie(4, "fourth", "Horror", "www.fourthUrl.com");
    private Movie fifth = new Movie(5, "fifth", "Drama", "www.fifthUrl.com");
    private Movie sixth = new Movie(6, "sixth", "Adventure", "www.sixthUrl.com");
    private Movie seventh = new Movie(7, "seventh", "Detective", "www.seventhUrl.com");
    private Movie eighth = new Movie(8, "eighth", "Thriller", "www.eighthUrl.com");
    private Movie ninth = new Movie(9, "ninth", "Musical", "www.ninthUrl.com");
    private Movie tenth = new Movie(10, "tenth", "Western", "www.tenthUrl.com");
    private Movie eleventh = new Movie(11, "eleventh", "Documentary", "www.eleventhUrl.com");

    @BeforeEach
    public void setUp() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
    }

    @Test
    void getLastWithQuantityMoreThanInList() {
        Movie[] actual = manager.getLast();
        Movie[] expected = new Movie[]{ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        assertArrayEquals(expected, actual);
    }

    @Test
    void getLastWithQuantityLessThanInList() {
        manager.add(tenth);
        manager.add(eleventh);
        Movie[] actual = manager.getLast();
        Movie[] expected = new Movie[]{eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};
        assertArrayEquals(expected, actual);
    }
}
