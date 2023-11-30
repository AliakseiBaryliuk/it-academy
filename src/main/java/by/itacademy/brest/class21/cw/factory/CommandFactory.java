package by.itacademy.brest.class21.cw.factory;

import by.itacademy.brest.class21.cw.command.Command;
import by.itacademy.brest.class21.cw.command.Light;
import by.itacademy.brest.class21.cw.command.LightOffCommand;
import by.itacademy.brest.class21.cw.command.LightOnCommand;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import static by.itacademy.brest.class21.cw.constants.Constants.OFF;
import static by.itacademy.brest.class21.cw.constants.Constants.ON;

public class CommandFactory {
    private  Light light;
    private  Map<String, Command> commands;

    public CommandFactory(Light light) {
        this.light = light;
        commands = new HashMap<>();
        commands.put(ON, new LightOnCommand(this.light));
        commands.put(OFF, new LightOffCommand(this.light));
    }

    public Command getCommand(String name) {
        return Optional.ofNullable(commands.get(name))
                .orElseThrow(() -> new RuntimeException("Wrong command"));
    }
}
