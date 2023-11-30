package by.itacademy.brest.class21.cw.factory;

import by.itacademy.brest.class21.cw.command.Light;
import by.itacademy.brest.class21.cw.command.LightOffCommand;
import by.itacademy.brest.class21.cw.command.LightOnCommand;
import by.itacademy.brest.class21.cw.command.RemoteControl;

import static by.itacademy.brest.class21.cw.constants.Constants.OFF;
import static by.itacademy.brest.class21.cw.constants.Constants.ON;

// Шаг 5: Клиент
public class CommandFactoryPatternExample {
    public static void main(String[] args) {
        // Создаем объекты
        Light light = new Light();
        CommandFactory factory = new CommandFactory(light);

        // Устанавливаем команду в инициатор
        RemoteControl remoteControl = new RemoteControl();

        remoteControl.setCommand(factory.getCommand(ON));
        // Выполняем команду
        remoteControl.pressButton();

        remoteControl.setCommand(factory.getCommand(OFF));
        // Выполняем команду
        remoteControl.pressButton();

    }
}
