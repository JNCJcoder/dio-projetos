import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class User {
    private final int id;
    private final String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    
    @Override
    public String toString() {
      return id + " - " + name;
    }
}

class UserManager {
    private static final List<User> users = new ArrayList<>();
    private static UserManager uniqueInstance;

    private UserManager() {
	}

    public static synchronized UserManager getInstance() {
		if (uniqueInstance == null)
			uniqueInstance = new UserManager();

		return uniqueInstance;
	}

    public static void addUser(int id, String name) {
      users.add(new User(id, name));
    }

    public static void listUsers() {
      for(User user : users) {
        System.out.println(user);
      }
    }
}

public class Main {
    public static void addUser(int id, String name) {
        UserManager.addUser(id, name);
    }

    public static void listUsers() {
        UserManager.listUsers();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantity = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha após a leitura do número

        for (int i = 1; i <= quantity; i++) {
            String name = scanner.nextLine();
            addUser(i, name);
        }

        listUsers();
    }
}