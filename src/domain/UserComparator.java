package omadiki.domain;

import java.util.Comparator;

public class UserComparator implements Comparator<User> {

    /**
    * Sorting in descending order of score
    * */
    public int compare(User a, User b)
    {
        return b.getScore() - a.getScore();
    }
}
