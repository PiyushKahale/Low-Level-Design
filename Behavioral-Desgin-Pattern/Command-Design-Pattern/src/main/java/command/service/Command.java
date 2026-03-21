package command.service;

public interface Command {

    public void execute();

    public void undo();
}
