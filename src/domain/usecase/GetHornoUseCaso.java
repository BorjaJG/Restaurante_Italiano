package domain.usecase;

import data.HornoStorage;
import data.PizzaStorage;
import domain.models.Horno;
import domain.models.Pizza;

import java.util.List;

public class GetHornoUseCaso {

    private HornoStorage storage = HornoStorage.getInstance();
    public List<Horno> execute() {
        return storage.getAll();

    }
}

}
