package com.kodilla.testing.forum.statistics;

public class ForumStatistics {
    private int usersQty;
    private int postsQty;
    private int commentsQty;
    private double avgPostsCountPerUser;
    private double avgCommentsCountPerUser;
    private double avgCommentsCountPerPost;

    public int getUsersQty() {
        return usersQty;
    }

    public int getPostsQty() {
        return postsQty;
    }

    public int getCommentsQty() {
        return commentsQty;
    }

    public double getAvgPostsCountPerUser() {
        return avgPostsCountPerUser;
    }

    public double getAvgCommentsCountPerUser() {
        return avgCommentsCountPerUser;
    }

    public double getAvgCommentsCountPerPost() {
        return avgCommentsCountPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        usersQty = statistics.usersNames().size();
        postsQty = statistics.postsCount();
        commentsQty = statistics.commentsCount();

        if (usersQty != 0) {
            avgCommentsCountPerUser = (double) commentsQty / usersQty;
            avgPostsCountPerUser = (double) postsQty / usersQty;
        } else {
            avgCommentsCountPerUser = 0;
            avgPostsCountPerUser = 0;
        }

        if (postsQty != 0) {
            avgCommentsCountPerPost = (double) commentsQty / postsQty;
        } else {
            avgCommentsCountPerPost = 0;
        }
    }
}


