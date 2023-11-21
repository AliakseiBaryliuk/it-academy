package by.itacademy.brest.class18.cw;

import java.util.ArrayList;
import java.util.List;

public class Developer {
    private Long id;
    private String name;
    private List<ProgramLanguage> languages;

    public Developer(Long id, String name) {
        this.id = id;
        this.name = name;
        this.languages = new ArrayList<>();
    }

    public void setLanguage(ProgramLanguage language) {
        languages.add(language);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ProgramLanguage> getLanguages() {
        return languages;
    }
}
