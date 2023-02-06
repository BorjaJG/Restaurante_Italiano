package presentation;

import domain.models.Horno;
import domain.models.Pizza;
import domain.usecase.GetHornoUseCaso;

public class FormHorno {
    private  final  Integer tipoA = 0;
    private  final  Integer tipoB = 1;
    private  final  Integer tipoC = 2;


    public void hornear(){
        hornearPizza1();
        hornearPizza2();
        hornearPizza3();
    }
    private void  hornearPizza1(){
        Horno horno = new Horno();
        Horno.setId(0);
        Horno.setMarca("Balay");
        Horno.setNombre("Horno de Pizza carbonara");






    }
    private void  hornearPizza2(){
        Horno horno = new Horno();
        Horno.setId(0);
        Horno.setMarca("Balay");
        Horno.setNombre("Horno de Pizza carbonara");






    }
    private void  hornearPizza3(){
        Horno horno = new Horno();
        Horno.setId(0);
        Horno.setMarca("Balay");
        Horno.setNombre("Horno de Pizza carbonara");






    }
}
