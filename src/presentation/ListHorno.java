package presentation;




import domain.models.Horno;
import domain.usecase.GetHornoUseCaso;

import java.util.ArrayList;
import java.util.List;
public class ListHorno {
    public void print() {
        GetHornoUseCaso getHornoUseCaso = new GetHornoUseCaso();
        List<Horno> chasis = GetHornoUseCaso.execute();

        for (int i = 0; i < horno.size(); i++) {
            System.out.println("Horno: " +
                    chasis.get(i).getId() +
                    ":" + chasis.get(i).getMarca() +
                    ":" + chasis.get(i).getTemperatura() +
                    ":" + chasis.get(i).getNombre());
        }
    }
}
