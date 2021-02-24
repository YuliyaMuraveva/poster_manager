package ru.netology.manager;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import ru.netology.domain.Movie;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class PosterManagerTestEmpty {
    @Mock
    private PosterManager manager;
    private Movie first = new Movie(1, "first", "Action", "www.firstUrl.com");

    @Test
    void addToEmpty() {
        manager.add(first);
        Movie[] actual = manager.getAll();
        Movie[] expected = new Movie[]{first};
        assertArrayEquals(expected, actual);
    }

    @Test
    void getLastEmpty() {
        Movie[] actual = manager.getAll();
        Movie[] expected = new Movie[]{};
        assertArrayEquals(expected, actual);
    }
}
