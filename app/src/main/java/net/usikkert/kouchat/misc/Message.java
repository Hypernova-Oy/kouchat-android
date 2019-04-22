package net.usikkert.kouchat.misc;

public class Message {
    String message;
    User sender;

    /**
     * Constructor. Initializes variables.
     *
     * @param message Content of the message.
     * @param sender User object.
     */
    public Message(final String message, final User sender) {
        this.message = message;
        this.sender = sender;
    }

    public String getMessage() {
        return this.message;
    }

    public User getSender() {
        return this.sender;
    }

    /**
     * Resets some of the fields to default, to reset the user's state.
     */
    public void reset() {
        message = "";
        sender = null;
    }

    public boolean isMine() {
        return sender.isMe();
    }
}