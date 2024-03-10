package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieTest {
    @Test
    public void  shouldAddMovieAndFindAll() {
        Movie movie = new Movie();
        String movie1 = "Бладшот";
        String movie2 = "Вперёд";
        String movie3 = "Отель Белград";

        movie.add(movie1);
        movie.add(movie2);
        movie.add(movie3);
        String[] actual = movie.findAll();
        String[] expected = {movie1, movie2, movie3};
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testLast() {
        Movie movie = new Movie();
        String movie1 = "Бладшот";
        String movie2 = "Вперёд";
        String movie3 = "Отель Белград";

        movie.add(movie1);
        movie.add(movie2);
        movie.add(movie3);
        String[] actual = movie.findLast();
        String[] expected = {movie3, movie2, movie1};
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test

    public void shouldFindLast() {
        Movie movie = new Movie(5);
        String movie1 = "Бладшот";
        String movie2 = "Вперёд";
        String movie3 = "Отель Белград";
        String movie4 = "Джентельмены";
        String movie5 = "Человек-невидимка";
        String movie6 = "Тролли";
        String movie7 = "Номер один";

        movie.add(movie1);
        movie.add(movie2);
        movie.add(movie3);
        movie.add(movie4);
        movie.add(movie5);
        movie.add(movie6);
        movie.add(movie7);
        String[] actual = movie.findLast();
        String[] expected = {movie7, movie6, movie5, movie4, movie3};
        Assertions.assertArrayEquals(expected, actual);

    }
}
