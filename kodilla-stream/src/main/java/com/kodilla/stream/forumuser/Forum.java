package com.kodilla.stream.forumuser;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> usersList = new ArrayList<>();

    public Forum() {
        usersList.add(new ForumUser(1, "Jacek", 'M',
                LocalDate.of(1985, 5, 24), 6));
        usersList.add(new ForumUser(2, "Anna", 'F',
                LocalDate.of(1988, 10, 13), 11));
        usersList.add(new ForumUser(3, "Marcin", 'M',
                LocalDate.of(1991, 6, 2), 0));
        usersList.add(new ForumUser(4, "Ewelina", 'F',
                LocalDate.of(1995, 11, 12), 0));
        usersList.add(new ForumUser(5, "Andrzej", 'M',
                LocalDate.of(1999, 7, 6), 13));
        usersList.add(new ForumUser(6, "Edyta", 'F',
                LocalDate.of(2000, 3, 30), 21));
        usersList.add(new ForumUser(7, "Monika", 'F',
                LocalDate.of(1993, 1, 12),9));
        usersList.add(new ForumUser(8, "Joanna", 'F',
                LocalDate.of(1991, 9, 15),7));
        usersList.add(new ForumUser(9, "Jerzy", 'M',
                LocalDate.of(1995, 2, 25), 5));
        usersList.add(new ForumUser(10, "Krzysztof", 'M',
                LocalDate.of(1986, 8, 3), 15));
    }
    public List<ForumUser> getUserList() {
        return new ArrayList<>(usersList);
    }
}