package by.itacademy.brest.class21.cw.command;

// Шаг 4: Invoker (Инициатор)
public class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}
