package web.servies;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServies implements Servies {

    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("HAVAL", "blue", 2));
        cars.add(new Car("HONDA", "black", 4));
        cars.add(new Car("TOYOTA", "white", 7));
        cars.add(new Car("SUZUKI", "yellow", 5));
        cars.add(new Car("BMW", "green", 8));
    }

    @Override
    public List<Car> index(int count) {
        List<Car> newCars = new ArrayList<>();
        if (count >= 5) {
            return newCars = cars;
        } else {
            for (int i = 0; i < count; i++) {
                newCars.add(cars.get(i));
            }
        }
        return newCars;
    }
}
