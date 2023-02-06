package presentation;

import domain.models.Pizza;
import domain.usecase.GetPizzaUseCase;
import java.util.ArrayList;
import java.util.List;

public class ListPizza {
    public void print() {
        GetPizzaUseCase getPizzaUseCase = new GetPizzaUseCase();
        List<Pizza> pizza = getPizzaUseCase.execute();

        for (int i = 0; i < pizza.size(); i++) {
            System.out.println("Pizza: " +
                    pizza.get(i).getNombre() +
                    ":" + pizza.get(i).getSalsa() +
                    ":" + pizza.get(i).getId());

        }
    }
}
