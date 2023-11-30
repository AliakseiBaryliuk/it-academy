package by.itacademy.brest.class21.cw.command;

// Шаг 2: ConcreteCommand (Конкретная команда)
public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}
