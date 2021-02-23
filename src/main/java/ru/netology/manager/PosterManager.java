package ru.netology.manager;

import ru.netology.domain.Movie;
import ru.netology.repository.PosterRepository;

public class PosterManager {
    private PosterRepository repository;

    public PosterManager(PosterRepository repository) {
        this.repository = repository;
    }

    public void add(Movie movie) {
        repository.save(movie);
    }

    public Movie[] getAll() {
        Movie[] poster = repository.findAll();
        Movie[] result = new Movie[poster.length];
        for (int i = 0; i < result.length; i++) {
            int index = result.length - 1 - i;
            result[i] = poster[index];
        }
        return result;
    }

    public Movie[] getById(int id) {
       return repository.findById(id);
    }

    public void removeById(int id) {
        repository.removeById(id);
    }

    public void removeAll() {
        repository.removeAll();
    }
}
