package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {

    private final List<ForumUser> forumUsersList = new ArrayList<>();

    public Forum(){
        forumUsersList.add(new ForumUser(1,"luke", 'M', 1990, 02, 28, 2));
        forumUsersList.add(new ForumUser(2, "julia",'F', 1985, 10, 10, 5));
        forumUsersList.add(new ForumUser(3, "bob", 'M', 2001, 8, 15, 0));
        forumUsersList.add(new ForumUser(4, "lisa", 'F', 2001, 11, 07, 3));
        forumUsersList.add(new ForumUser(5, "mike", 'M', 2000, 05, 23, 11));
        forumUsersList.add(new ForumUser(6, "lee", 'M', 2003, 04, 18,  20));
        forumUsersList.add(new ForumUser(7, "lexi", 'F', 1996, 04, 02, 8));
    }

    public List<ForumUser> getUserList(){
        return new ArrayList<>(forumUsersList);
    }
}
