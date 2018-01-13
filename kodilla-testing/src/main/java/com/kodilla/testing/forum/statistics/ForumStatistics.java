package com.kodilla.testing.forum.statistics;

public class ForumStatistics {
    private double usersNumber;
    private double postsNumber;
    private double commentsNumber;
    public double avgPostsPerUser;
    public double avgCommentsPerUser;
    public double avgCommentsPerPost;

    public void calculateAdvStatistics(Statistics statistics) {
        this.usersNumber = statistics.usersNames().size();
        this.postsNumber = statistics.postsCount();
        this.commentsNumber = statistics.commentsCount();

        if(usersNumber == 0 || postsNumber == 0) {
            this.commentsNumber = 0;
            this.avgPostsPerUser = 0;
            this.avgCommentsPerUser = 0;
            this.avgCommentsPerPost = 0;
        } else {
            this.avgPostsPerUser = postsNumber / usersNumber;
            this.avgCommentsPerUser = commentsNumber / usersNumber;
            this.avgCommentsPerPost = commentsNumber / postsNumber;
        }
    }
    public void showStatistics() {
        System.out.println("Number of users: " + Math.round(this.usersNumber) + "\nNumber of posts: " +
                Math.round(this.postsNumber) + "\nNumber of comments: " + Math.round(this.commentsNumber) +
                "\nAverage number of posts per user: " + this.avgPostsPerUser +
                "\nAverage number of comments per user: " + this.avgCommentsPerUser +
                "\nAverage number of comments per post: " + this.avgCommentsPerPost + "\n");
    }
}