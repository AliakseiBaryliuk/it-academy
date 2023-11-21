package by.itacademy.brest.class18.cw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class Company {
    private String name;
    private List<Developer> developers;

    public Company(String name) {
        this.name = name;
        this.developers = new ArrayList<>();
    }

    public void addDeveloper(Developer developer) {
        developers.add(developer);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public List<Developer> getDevelopersByLanguage(ProgramLanguage language){
        return developers.stream()
                .filter(developer -> developer.getLanguages().contains(language))
                .toList();
    }

    public Map<ProgramLanguage, List<Developer>> getDeveloperStats(){
//        UnaryOperator<ProgramLanguage> languageUnaryOperator = t -> t;

        return Arrays.stream(ProgramLanguage.values())
                .collect(Collectors.toMap(Function.identity(), this::getDevelopersByLanguage));
    }

    public static void main(String[] args) {
        Company company = new Company("Cool company");

        Developer developer = new Developer(1L, "Vasya");
        developer.setLanguage(ProgramLanguage.JAVA);

        company.addDeveloper(developer);

        Map<ProgramLanguage, List<Developer>> developerStats = company.getDeveloperStats();
        System.out.println("End");

    }
}
