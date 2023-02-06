package data;



import domain.models.Barbacoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;



public class BarbacoaStorage {

    private static BarbacoaStorage instance;

    private Map<Integer, Barbacoa> storage = new TreeMap<>();

    private BarbacoaStorage() {

    }

    public void save(Barbacoa barbacoa) {
        storage.put(barbacoa.getId(), barbacoa);
    }
    public void o


}

