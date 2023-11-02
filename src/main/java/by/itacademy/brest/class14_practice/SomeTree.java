package by.itacademy.brest.class14_practice;

import java.util.List;

public abstract class SomeTree {
    private List<Leaf> leafs;
    private TreeType type;
    private String name;

    SomeTree(String name, Integer leafsNumber, Season season) {
        this.name = name;
        setLeafs(leafsNumber, season);
    }

    class Leaf {
        private String color;

        public Leaf(String color) {
            this.color = color;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }
    }

    public void setLeafs(Integer leafsNumber, Season season) {
        if (season != Season.WINTER) {
            for (int i = 0; i <= leafsNumber; i++) {
                switch (season) {
                    case AUTUMN -> leafs.add(new Leaf("yellow"));
                    case SPRING -> leafs.add(new Leaf("light green "));
                    case SUMMER -> leafs.add(new Leaf("green "));
                }
            }
        }
    }

    public List<Leaf> getLeafs() {
        return leafs;
    }

    public void setLeafs(List<Leaf> leafs) {
        this.leafs = leafs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract TreeType getType();
}
