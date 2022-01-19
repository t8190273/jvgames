package omadiki.domain;

import java.util.StringTokenizer;

public class User {

    private String username;
    private Integer score;
    private Boolean[] questions;

    public User() {
        this.username = "";
        this.score = -1;
        this.questions = new Boolean[40];
        for (Boolean q : questions) {
            q = false;
        }
    }
    public User(String username) {
        this.username = username;
        this.score = -1;
        this.questions = new Boolean[40];
        for (Boolean q : questions) {
            q = false;
        }
    }
    public User(String username, Integer score) {
        this.username = username;
        this.score = score;
        this.questions = new Boolean[40];
        for (Boolean q : questions) {
            q = false;
        }
    }

    public User(String username, Integer score, Boolean[] questions) {
        this.username = username;
        this.score = score;
        this.questions = questions;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Calculates and returns the score
     * */
    public Integer getScore() {
        int counter = 0;
        for (Boolean q : this.getQuestions()) {
            if (q != null && q) {
                counter+= 3;
            }
        }
        this.setScore(counter);
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Boolean[] getQuestions() {
        return questions;
    }

    public void setQuestions(Boolean[] questions) {
        this.questions = questions;
    }

    /**
     * Save a user object as a string
     * */
    @Override
    public String toString() {
        StringBuilder questionsString = new StringBuilder();
        for (Boolean q : questions)
        {
            questionsString.append(",").append(q);
        }
        return  username + "," + score + questionsString.toString() +"\n";
    }

    /**
     * Create a user object from a string
     * */
    public static User fromString(String string) {
        StringTokenizer tokens = new StringTokenizer(string, ",");
        User user = new User();
        if(tokens.hasMoreTokens()) {
            user.setUsername(tokens.nextToken());
            if (tokens.hasMoreTokens()) {
                user.setScore(Integer.parseInt(tokens.nextToken()));
                user.setQuestions(new Boolean[40]);
            }
        }
        int i = 0;
        Boolean[] q = user.getQuestions();
        while (tokens.hasMoreTokens() && i < q.length) {
            q[i] = Boolean.parseBoolean(tokens.nextToken());
            i++;
        }
        return user;
    }
}
