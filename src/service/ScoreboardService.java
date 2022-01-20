package service;

import domain.User;
import domain.UserComparator;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class ScoreboardService {

    private final String saveLocation;
    private ArrayList<User> scoreboard = new ArrayList<User>();

    /**
     * Empty constructor
     * */
    public ScoreboardService() {
        saveLocation = "";
    }

    /**
     * Default constructor
     * */
    public ScoreboardService(String filepath) {
        this.saveLocation = System.getProperty("user.dir") + File.separator + filepath;
        this.scoreboard = readScoreboard();
    }

    /**
     * Open the file and read the scoreboard
     * */
    private ArrayList<User> readScoreboard() {
        ArrayList<User> users = new ArrayList<User>();
        try {
            File file = new File(saveLocation);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                users.add(User.fromString(scanner.nextLine()));
            }
            saveScoreboard();
            scanner.close();
        } catch (Exception e) {
            System.out.println("Error while writing to file");
            e.printStackTrace();
            return null;
        }

        return users;
    }

    /**
     * Save the scoreboard to file
     * */
    private void saveScoreboard() {
        try {
            FileWriter fileWriter = new FileWriter(saveLocation);
            for (User user : scoreboard) {
                fileWriter.write(user.toString());
            }
            fileWriter.close();
        } catch (Exception e) {
            System.out.println("Error while writing to file");
            e.printStackTrace();
        }
    }

    /**
     * Prints the scoreboard to a PrintStream
     * */
    public void printScoreboard(ArrayList<User> scoreboard, PrintStream printStream, Integer start, Integer finish) {
        UserComparator userComparator = new UserComparator();
        scoreboard.sort(userComparator);
        StringBuilder stringBuilder = new StringBuilder();
        printStream.println("--------Scoreboard--------");
        for (User user : scoreboard) {
            printStream.println(String.format("%3s", user.getScore(start, finish).toString()) + " | " + user.getUsername());
        }

    }

    /**
     * Prints the scoreboard to a PrintStream
     * */
    public void printTotalScoreboard(ArrayList<User> scoreboard, PrintStream printStream) {
        UserComparator userComparator = new UserComparator();
        scoreboard.sort(userComparator);
        StringBuilder stringBuilder = new StringBuilder();
        printStream.println("--------Scoreboard--------");
        for (User user : scoreboard) {
            printStream.println(String.format("%3s", user.getTotalScore().toString()) + " | " + user.getUsername());
        }

    }

    /**
     * Prints the scoreboard to the system.out stream and returns the scoreboard to the caller
     * */
    public String[][] getScoreboard(Integer start, Integer finish) {
        printScoreboard(scoreboard, System.out, start, finish);
        String[][] table = new String[scoreboard.size()][2];
        int i = 0;
        for (User user : scoreboard) {
            table[i][0] = user.getScore(start, finish).toString();
            table[i][1] = user.getUsername();
            i++;
        }
        return table;
    }

    /**
     * Prints the scoreboard to the system.out stream and returns the scoreboard to the caller
     * */
    public String[][] getTotalScoreboard() {
        printTotalScoreboard(scoreboard, System.out);
        String[][] table = new String[scoreboard.size()][2];
        int i = 0;
        for (User user : scoreboard) {
            table[i][0] = user.getTotalScore().toString();
            table[i][1] = user.getUsername();
            i++;
        }
        return table;
    }

    /**
     * Adds a user
     * */
    public User addUser(String username) {
        User user = new User(username);
        if (userExists(username)) {
            saveScoreboard();
            System.out.println("Error: Can't create user! Username: " +username+ " is already in use.");
            return null;
        } else {
            scoreboard.add(user);
            saveScoreboard();
            System.out.println("User with username: " +username+ " was created.");
            return user;
        }
    }

    /**
     * Removes a user
     * */
    public void removeUser(String username) {
        scoreboard.remove(getUserByUsername(username));
        saveScoreboard();
        System.out.println("User with username: " +username+ " was removed.");
    }

    /**
     * Returns if a user exists or not based on username
     * */
    public boolean userExists(String username) {
        for (User user : scoreboard) {
            if (user.getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Finds and returns a user by username
     * */
    public User getUserByUsername(String username) {
        for (User user : scoreboard) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        System.out.println("User with username: " +username+ " does not exist.");
        return null;
    }

    /**
     * Updates a question depending on the player result
     * */
    public void updateQuestion(String username, Integer id, Boolean result) {
        User user =  getUserByUsername(username);
        if (user != null) {
            Boolean[] q = user.getQuestions();
            q[id] = result;
        }
        saveScoreboard();
        System.out.println("Question " + id + " was updated as: " + result + " for user " + username);
    }

    /**
     * Returns the scoreboard
     * */
    public Integer getUserScore(String username, Integer start, Integer finish) throws NullPointerException {
        User user =  getUserByUsername(username);
        if (user != null) {
            return user.getScore(start, finish);
        }
        throw new NullPointerException("Error: User does not exist!");
    }

    /**
     * Returns the scoreboard
     * */
    public Integer getUserTotalScore(String username) throws NullPointerException {
        User user =  getUserByUsername(username);
        if (user != null) {
            return user.getTotalScore();
        }
        throw new NullPointerException("Error: User does not exist!");
    }

}
