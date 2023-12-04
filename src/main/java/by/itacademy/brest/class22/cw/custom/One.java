package by.itacademy.brest.class22.cw.custom;

public class One {

    @Version
    private String version;

    public String getVersion() {
        return version;
    }

    @Version(info = "1.1")
    public void setVersion(String version) {
        this.version = version;
    }
}
