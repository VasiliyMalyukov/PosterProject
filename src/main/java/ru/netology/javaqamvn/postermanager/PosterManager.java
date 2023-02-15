package ru.netology.javaqamvn.postermanager;

public class PosterManager {
    private String[] movies = new String[0];
    private int limit;

    public PosterManager() {

    }

    public PosterManager(int limit) {
        this.limit = limit;
    }

    public void add(String movie) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public String[] findAll() {
        return movies;
    }

    public String[] findLast() {
        int allLength;
        if (movies.length < limit) {
            allLength = movies.length;
        } else {
            allLength = limit;
        }
        String[] tmp = new String[allLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = movies[movies.length - 1 - i];

        }
        return tmp;
    }
}

