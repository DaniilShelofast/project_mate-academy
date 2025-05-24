package org.example;

public class UserRepository {

    private User[] users;

    public UserRepository(User[] users) {

        this.users = users;
    }

    public User[] getUsers() {

        return users;
    }

    public String[] getUserNames() {

        String[] userNames = new String[users.length];
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                userNames[i] = users[i].getName();
            }
        }
        return userNames;
    }

    public long[] getUserIds() {

        long[] userIds = new long[users.length];
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                userIds[i] = users[i].getId();
            }
        }
        return userIds;
    }

    public String getUserNameById(long id) {

        for (User user : users) {
            if (user.getId() == id) {
                return user.getName();
            }
        }
        return null;
    }

    public User getUserByName(String name) {

        for (User user : users) {
            if (user.getName().equals(name)) {
                return user;
            }
        }
        return null;
    }

    public User getUserById(long id) {

        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    public User getUserBySessionId(String sessionId) {

        for (User user : users) {
            if (user.getSessionId().equals(sessionId)) {
                return user;
            }
        }
        return null;
    }

    private User findById(long id) {

        for (User user : users) {
            if (user != null && user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    public User save(User user) {

        User userId = findById(user.getId());
        if (userId != null) {
            return null;
        }

        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {
                users[i] = user;
                return user;
            }
        }
        return null;
    }

    public User update(User user) {

        for (int i = 0; i < users.length; i++) {
            if (users[i] != null && users[i].getId() == user.getId()) {
                users[i] = user;
                return user;
            }
        }
        return null;
    }

    public void delete(long id) {

        findById(id);
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null && users[i].getId() == id) {
                users[i] = null;
            }
        }
    }
}
