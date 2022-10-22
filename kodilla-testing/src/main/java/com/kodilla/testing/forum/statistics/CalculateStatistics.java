package com.kodilla.testing.forum.statistics;

import java.util.Objects;

public class CalculateStatistics {
    int numberOfUsers;
    int numberOfPosts;
    int numberOfComments;
    double averageUserPosts;
    double averageUserComments;
    double averagePostComments;

    public void calculateAdvStatistics(Statistics statistics) {
        numberOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();

        //averageUserPosts = (numberOfUsers != 0) ? ((double) numberOfPosts/numberOfUsers) : 0;
        if(numberOfUsers != 0){
            averageUserPosts = (double) numberOfPosts/numberOfUsers;
        }else{
            averageUserPosts = 0;
        }

        averageUserComments = (numberOfUsers != 0) ? ((double) numberOfComments/numberOfUsers) : 0;

        averagePostComments = (numberOfPosts>0) ? ((double) numberOfComments/numberOfPosts) : 0;
    }

    public void showStatistics(){
        System.out.println("Number of forum users: " + numberOfUsers + "\nNumber of posts: " +
                numberOfPosts + "\nNumber of comments: " + numberOfComments);

    }
}
