package facade;

public class MessageTitle {
    private String text;

    public MessageTitle(String text) {
        this.text = "Сообщение от пользователя: " + text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
