package by.itacademy.brest.class15.cw.serialization.mapper.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonExample {
    public static void main(String[] args) throws Exception {
        // Создание объекта для сериализации
        PersonJson person = new PersonJson("John Doe", 25);

        // Использование ObjectMapper для сериализации в JSON
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(person);

        System.out.println("Сериализованный JSON: " + json);

        // Десериализация из JSON обратно в объект
        PersonJson deserializedPerson = objectMapper.readValue(json, PersonJson.class);
        System.out.println("Десериализованный объект: " + deserializedPerson);
    }
}

