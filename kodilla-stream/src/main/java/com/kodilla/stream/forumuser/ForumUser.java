package com.kodilla.stream.forumuser;
import java.time.LocalDate;

public final class ForumUser {
    private final int userId;
    private final String username;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int postsPublished;

    public ForumUser(final int userId, final String username, final char sex, final LocalDate dateOfBirth,
                     final int postsPublished) {
        this.userId = userId;
        this.username = username;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.postsPublished = postsPublished;
    }
    public int getUserId() {
        return userId;
    }
    public String getUsername() {
        return username;
    }
    public char getSex() {
        return sex;
    }
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
    public int getPostsPublished() {
        return postsPublished;
    }
    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", postsPublished=" + postsPublished +
                '}';
    }
}