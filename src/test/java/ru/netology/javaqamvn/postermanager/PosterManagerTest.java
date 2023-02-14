package ru.netology.javaqamvn.postermanager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {

    @Test
    public void testAddMovieAverage() {
        PosterManager manager = new PosterManager();

        manager.add("Movie 1");
        manager.add("Movie 2");
        manager.add("Movie 3");

        String[] expected = { "Movie 1", "Movie 2", "Movie 3" };
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testAddMovieMin() {
        PosterManager manager = new PosterManager();

        manager.add("Movie 1");

        String[] expected = { "Movie 1"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testAddMovieNull() {
        PosterManager manager = new PosterManager();

        String[] expected = { };
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastNull() {
        PosterManager manager = new PosterManager(0);

        String[] expected = { };
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastAverage() {
        PosterManager manager = new PosterManager(5);

        manager.add("Movie 1");
        manager.add("Movie 2");
        manager.add("Movie 3");
        manager.add("Movie 4");
        manager.add("Movie 5");

        String[] expected = { "Movie 5", "Movie 4", "Movie 3", "Movie 2", "Movie 1" };
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastMax() {
        PosterManager manager = new PosterManager(10);

        manager.add("Movie 1");
        manager.add("Movie 2");
        manager.add("Movie 3");
        manager.add("Movie 4");
        manager.add("Movie 5");
        manager.add("Movie 6");
        manager.add("Movie 7");
        manager.add("Movie 8");
        manager.add("Movie 9");
        manager.add("Movie 10");

        String[] expected = { "Movie 10", "Movie 9", "Movie 8", "Movie 7", "Movie 6", "Movie 5", "Movie 4", "Movie 3", "Movie 2", "Movie 1" };
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastNewLimit() {
        PosterManager manager = new PosterManager(20);

        manager.add("Movie 1");
        manager.add("Movie 2");
        manager.add("Movie 3");
        manager.add("Movie 4");
        manager.add("Movie 5");
        manager.add("Movie 6");
        manager.add("Movie 7");
        manager.add("Movie 8");
        manager.add("Movie 9");
        manager.add("Movie 10");
        manager.add("Movie 11");
        manager.add("Movie 12");
        manager.add("Movie 13");
        manager.add("Movie 14");
        manager.add("Movie 15");
        manager.add("Movie 16");
        manager.add("Movie 17");
        manager.add("Movie 18");
        manager.add("Movie 19");
        manager.add("Movie 20");

        String[] expected = { "Movie 20", "Movie 19", "Movie 18", "Movie 17", "Movie 16", "Movie 15", "Movie 14", "Movie 13", "Movie 12", "Movie 11", "Movie 10", "Movie 9", "Movie 8", "Movie 7", "Movie 6", "Movie 5", "Movie 4", "Movie 3", "Movie 2", "Movie 1" };
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastLessLimit() {
        PosterManager manager = new PosterManager(5);

        manager.add("Movie 1");
        manager.add("Movie 2");
        manager.add("Movie 3");
        manager.add("Movie 4");

        String[] expected = { "Movie 4", "Movie 3", "Movie 2", "Movie 1" };
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}

