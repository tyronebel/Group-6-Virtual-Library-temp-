import java.util.ArrayList;

public class Library {
    private ArrayList<Books> books;
    private ArrayList<User> users;
    
    // Constructor
    public Library() {
        books = new ArrayList<>();
        users = new ArrayList<>();
    }
    
    // Add user to library
    public void addUser(User user) {
        users.add(user);
    }
    
    // Delete user from library
    public boolean deleteUser(String userID) {
        return users.removeIf(user -> user.getUserID().equals(userID));
    }
    
    // Print directory of all users
    public void printDirectory() {
        for (User user : users) {
            System.out.println(user.getName());
        }
    }
    
    // Checkout book to user
    public boolean checkoutBook(String userID, int bookID) {
        return true; // Pretend checkout always works
    }
    
    // Checkin book from user
    public boolean checkinBook(String userID, int bookID) {
        return true; // Pretend checkin always works
    }
    
    // Search books by name
    public ArrayList<Books> bookSearch(String searchTerm) {
        return new ArrayList<>(); // Always return an empty list for now
    }
}
