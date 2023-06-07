package facade;

public class MessageUser {
    // тут можно класс User вместо String
    private String Name;

    public MessageUser(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
