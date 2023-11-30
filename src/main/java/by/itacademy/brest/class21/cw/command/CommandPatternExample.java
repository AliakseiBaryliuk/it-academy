package by.itacademy.brest.class21.cw.command;

// Шаг 5: Клиент
public class CommandPatternExample {
    public static void main(String[] args) {
        // Создаем объекты
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        // Устанавливаем команду в инициатор
        RemoteControl remoteControl = new RemoteControl();

        remoteControl.setCommand(lightOnCommand);
        // Выполняем команду
        remoteControl.pressButton();

        remoteControl.setCommand(lightOffCommand);
        // Выполняем команду
        remoteControl.pressButton();

    }
}
