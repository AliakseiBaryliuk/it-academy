package by.itacademy.brest.class14_practice;

import java.util.List;
import java.util.Map;

public class Forest {
    private List<SomeTree> trees;

    public List<SomeTree> getTrees() {
        return trees;
    }

    public void setTree(SomeTree tree) {

        this.trees = trees;
    }

    public void init(Map<TreeType, Integer> initForestData, Integer leafsNumber, Season season) {
        if (leafsNumber < 1){
            throw new IllegalArgumentException("Leafs number must be more than 0");
        }
        for (Map.Entry<TreeType, Integer> entry: initForestData.entrySet()) {
            for (int i = 0; i < entry.getValue(); i++) {
                trees.add(createTree(entry.getKey(), leafsNumber, season));
            }
        }
    }

    public SomeTree createTree(TreeType type, Integer leafsNumber, Season season) {
        return switch (type) {
            case CONIF -> new Linden(leafsNumber, season);
            case DECID -> new Fir(leafsNumber, season);
        };
    }

    public void changeSeason(Season season){
        switch (season){
            case AUTUMN -> processTreesBySeason("yellow");
            case SUMMER -> processTreesBySeason("green");
            case SPRING -> processTreesBySeason("light green ");
            case WINTER -> {
                for (int i = 0; i < trees.size(); i++) {
                    trees.get(i).setLeafs(null);
                }
            }
        }
    }

    private void processTreesBySeason(String color) {
        for (int i = 0; i < trees.size(); i++) {
            List<SomeTree.Leaf> leafs = trees.get(i).getLeafs();
            for (int j = 0; j < leafs.size(); j++) {
                leafs.get(i).setColor(color);
            }
        }
    }
}
