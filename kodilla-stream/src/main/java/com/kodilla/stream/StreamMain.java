package com.kodilla.stream;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.person.People;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {

    Forum forum = new Forum();

    Map<Integer, ForumUser> mapOfForumUsers = forum.getUserList().stream()
            .filter(user -> user.getSex() == 'M')
            .filter(user -> LocalDate.now().getYear() - user.getDateOfBirth().getYear() > 20)
            .filter(user -> user.getPostsQuantity() > 0)
            .collect(Collectors.toMap(user -> user.getUserId(), user -> user));

    mapOfForumUsers.entrySet().stream()
            .map(user -> user.getKey() + " : " + user.getValue())
            .forEach(System.out::println);

    }

}

