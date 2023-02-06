package domain.usecase;

import data.PizzaStorage;
import domain.models.Pizza;

public class SavePizzaUseCase {
    private PizzaStorage pizzaStorage = PizzaStorage.getInstance();

public  void  execute(Pizza pizza){
    pizzaStorage.save(pizza);
}

}
