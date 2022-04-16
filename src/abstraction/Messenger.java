package abstraction;

public class Messenger extends Messaging{
    @Override
    public void sendMessage(String message) {
        System.out.println("This is SMS Message");
    }
}
