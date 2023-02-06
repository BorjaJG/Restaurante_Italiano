package data;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class HornoStorage {

    private static HornoStorage instance;

    private Map<Integer, HornoStorage> storage = new TreeMap<>();

    private HornoStorage(){

    }

}
