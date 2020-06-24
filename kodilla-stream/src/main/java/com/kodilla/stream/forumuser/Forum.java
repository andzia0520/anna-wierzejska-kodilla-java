package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> theForumUsersList = new ArrayList<>();

    public Forum() {
        theForumUsersList.add(new ForumUser(100, "blackCat", 'F', 1986, 10, 13, 17));
        theForumUsersList.add(new ForumUser(101, "blackJack", 'M', 1996, 10, 13, 1));
        theForumUsersList.add(new ForumUser(102, "lidl", 'M', 1986, 06, 13, 0));
        theForumUsersList.add(new ForumUser(103, "Tesco", 'M', 1976, 12, 13, 2));
        theForumUsersList.add(new ForumUser(104, "Dino", 'M', 2006, 10, 13, 7));
        theForumUsersList.add(new ForumUser(105, "Catarinha", 'F', 2009, 10, 13, 3));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(theForumUsersList);
    }
}
