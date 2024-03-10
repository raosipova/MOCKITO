package ru.netology;

public class Movie {
    private String[] moviesList = new String[0];
    private int limit;

    public Movie() {

        this.limit = 5;
    }

    public Movie(int limit) {
        this.limit = limit;
    }

    public void add(String newMovie) {
        String[] tmp = new String[moviesList.length + 1];
        for (int i = 0; i < moviesList.length; i++) {
            tmp[i] = moviesList[i];
        }

        tmp[tmp.length - 1] = newMovie;
        moviesList = tmp;
    }

    public String[] findAll() {
        return moviesList;
    }

    public String[] findLast() {
        int resultLimit;
        if (moviesList.length < limit) {
            resultLimit = moviesList.length;
        } else {
            resultLimit = limit;
        }
        String[] tmp = new String[resultLimit];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = moviesList[moviesList.length - 1 - i];

        }
        return tmp;
    }
}






