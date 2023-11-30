package by.itacademy.brest.class21.cw.command;

// Шаг 2: ConcreteCommand (Конкретная команда)
public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}
