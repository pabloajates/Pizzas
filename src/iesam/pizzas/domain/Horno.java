package iesam.pizzas.domain;

public class Horno {

    private Integer id;
    private String nombre;
    private String marca;
    private String temperatura;

    private CartaPizzas pizzas;

    public CartaPizzas getPizzasBarbacoa(Barbacoa barbacoa) {
        return pizzas;
    }
    public CartaPizzas getPizzasCampera(Campera campera) {
        return pizzas;
    }
    public CartaPizzas getPizzasCarbonara(Carbonara carbonara) {
        return pizzas;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }
}
