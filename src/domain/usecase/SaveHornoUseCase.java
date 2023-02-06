package domain.usecase;

import data.HornoStorage;
import data.PizzaStorage;
import domain.models.Horno;
import domain.models.Pizza;

public class SaveHornoUseCase {
    private HornoStorage hornoStorage  = HornoStorage.getInstance();

    public  void  execute(Horno horno){
        hornoStorage.save(horno);
    }

}

}
