package domain.usecase;

import data.HornoStorage;
import data.PizzaStorage;
import domain.models.Pizza;

import java.util.List;

public class GetPizzaUseCase {
    private PizzaStorage storage = PizzaStorage.getInstance();
    public List<Pizza> execute() {
        return storage.getAll();

    }
}
