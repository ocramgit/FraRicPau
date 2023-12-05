package Map;
import java.util.ArrayList;
import java.util.Arrays;

public class Map {

    ArrayList<ArrayList<Position>> map = new ArrayList<>();

    public Map() {
    }

    public void createMap() {
        for (int i = 0; i < 50; i++) {
            map.add(new ArrayList<>(Arrays.asList(new Left(), new Center(), new Right())));
        }
    }

    public ArrayList<ArrayList<Position>> getMap() {
        return map;
    }

}