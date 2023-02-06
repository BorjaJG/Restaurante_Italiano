package data;

import domain.models.Pizza;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class PizzaStorage {


    private static PizzaStorage instance;

    private Map<Integer, PizzaStorage> storage = new TreeMap<>();

    private PizzaStorage(){

    }




}
