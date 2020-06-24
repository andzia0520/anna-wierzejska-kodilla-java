package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int userId;
    private final String userName;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int publishedPostsQty;

    public ForumUser(final int userId, final String userName, final char sex, final int year, final int month,
                     final int dayOfMonth, final int publishedPostsQty) {
        this.userId = userId;
        this.userName = userName;
        this.sex = sex;
        this.dateOfBirth = LocalDate.of(year, month, dayOfMonth);
        this.publishedPostsQty = publishedPostsQty;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getPublishedPostsQty() {
        return publishedPostsQty;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birthdayDate=" + dateOfBirth +
                ", publishedPostsQty=" + publishedPostsQty +
                '}';
    }
}
