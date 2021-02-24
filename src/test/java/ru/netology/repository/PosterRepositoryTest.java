package ru.netology.repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;
import ru.netology.manager.PosterManager;

import static org.junit.jupiter.api.Assertions.*;

class PosterRepositoryTest {
    private PosterRepository repository = new PosterRepository();
    private Movie first = new Movie(1, "first", "Action", "www.firstUrl.com");
    private Movie second = new Movie(2, "second", "Comedy", "www.secondUrl.com");
    private Movie third = new Movie(3, "third", "Cartoon", "www.thirdUrl.com");
    private Movie fourth = new Movie(4, "fourth", "Horror", "www.fourthUrl.com");

    @BeforeEach
    public void setUp() {
        repository.save(first);
        repository.save(second);
        repository.save(third);
    }

    @Test
    void shouldFindAll() {
        repository.save(fourth);
        Movie[] actual = repository.findAll();
        Movie[] expected = new Movie[]{first, second, third, fourth};
        assertArrayEquals(expected, actual);
    }

    @Test
    void findById() {
        Movie[] actual = repository.findById(2);
        Movie[] expected = new Movie[]{second};
        assertArrayEquals(expected, actual);
    }

    @Test
    void removeById() {
        repository.removeById(2);
        Movie[] actual = repository.findAll();
        Movie[] expected = new Movie[]{first, third};
        assertArrayEquals(expected, actual);
    }

    @Test
    void removeAll() {
        repository.removeAll();
        Movie[] actual = repository.findAll();
        Movie[] expected = new Movie[]{};
        assertArrayEquals(expected, actual);
    }
}