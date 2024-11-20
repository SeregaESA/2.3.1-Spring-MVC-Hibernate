package web.servies;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;


public class CarServies {

    private ArrayList<Car> cars;

    {
        cars.add(new Car("haval", "blue", 2));
        cars.add(new Car("honda", "black", 4));
        cars.add(new Car("toyota", "white", 7));
        cars.add(new Car("suzuki", "elove", 5));
        cars.add(new Car("BMW", "green", 8));
    }

    public List <Car> index() {
        return cars;
    }

}
