package us.gibb.dev.gwt.command;

public class CommandException extends Exception {

    private static final long serialVersionUID = 1920348528669073269L;

    public CommandException() {
    }
    
    public CommandException(String msg) {
        super(msg);
    }

    public CommandException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public CommandException(Throwable cause) {
        super(cause);
    }

}
