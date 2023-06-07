package facade;

public class UserFacade {
    private MessageText messageText;
    private MessageUser messageUser;
    private MessageTitle messageTitle;

    public void send(String text, String name, String title){
        // тут можно записать логику/порядок действий, чтобы не писать их в мейне и облегчить работу с системой
        messageText = new MessageText(text);
        messageUser = new MessageUser(name);
        messageTitle = new MessageTitle(name);
    }

    public void printInfo(){
        System.out.println("Заголовок: " + messageTitle.getText() + "\nСообщение: " + messageText.getText() + "\nОт пользователя: " + messageUser.getName());
    }
}
