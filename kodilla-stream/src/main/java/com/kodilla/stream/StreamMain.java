package com.kodilla.stream;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();
        LocalDate seventeenthJan1998 = LocalDate.of(1998, 1, 17);

        Map<Integer, ForumUser> theResultMap = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> forumUser.getDateOfBirth().isBefore(seventeenthJan1998))
                .filter(forumUser -> forumUser.getPostsPublished() > 0)
                .collect(Collectors.toMap(ForumUser::getUserId, forumUser -> forumUser));

        theResultMap.entrySet().stream()
                .map(entry -> "[" + entry.getKey() + "]: " + entry.getValue())
                .forEach(System.out::println);
    }
}