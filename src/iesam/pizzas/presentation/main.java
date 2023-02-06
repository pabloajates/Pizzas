package iesam.pizzas.presentation;

import iesam.pizzas.domain.Barbacoa;
import iesam.pizzas.domain.Campera;
import iesam.pizzas.domain.Carbonara;
import iesam.pizzas.domain.Horno;

public class main {

    public static void main (String [] args){

        Barbacoa barbacoa = new Barbacoa();
        barbacoa.setId(1);
        barbacoa.setNombre("barbacoa");
        barbacoa.setSalsa("salsita");
        barbacoa.setExtras("alguno");
        barbacoa.setPicante(true);

        Campera campera = new Campera();
        campera.setId(3);
        campera.setNombre("campera");
        campera.setSalsa("roquefort");
        campera.setExtras("piña");
        campera.setCarne(false);

        Carbonara carbonara = new Carbonara();
        carbonara.setId(2);
        carbonara.setNombre("carbonara");
        carbonara.setSalsa("barbacoa");
        carbonara.setExtras("queso");
        carbonara.setQueso_azul(false);
        carbonara.setQueso_cabra(true);

        //Hornos para un tipo de pizza
        Horno horno = new Horno();
        horno.setId(12);
        horno.setNombre("Hornazo");
        horno.setMarca("Toyota");
        horno.setTemperatura("200 Cº");
        horno.getPizzasBarbacoa(barbacoa);

        Horno horno2 = new Horno();
        horno2.setId(13);
        horno.setNombre("Hornito");
        horno.setMarca("BMW");
        horno.setTemperatura("300 Cº");
        horno2.getPizzasCampera(campera);

        Horno horno3 = new Horno();
        horno3.setId(13);
        horno3.setNombre("Horno Mayor");
        horno3.setMarca("Mercedes");
        horno3.setTemperatura("150 Cº");
        horno3.getPizzasBarbacoa(barbacoa);


    }
}
