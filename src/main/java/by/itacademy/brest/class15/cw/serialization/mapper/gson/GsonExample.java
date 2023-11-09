package by.itacademy.brest.class15.cw.serialization.mapper.gson;
import com.google.gson.Gson;

public class GsonExample {
    public static void main(String[] args) {
        // Создание объекта для сериализации
        PersonGson person = new PersonGson("Jane Doe", 30);

        // Использование Gson для сериализации в JSON
        Gson gson = new Gson();
        String json = gson.toJson(person);

        System.out.println("Сериализованный JSON: " + json);

        // Десериализация из JSON обратно в объект
        PersonGson deserializedPerson = gson.fromJson(json, PersonGson.class);
        System.out.println("Десериализованный объект: " + deserializedPerson);
    }
}

