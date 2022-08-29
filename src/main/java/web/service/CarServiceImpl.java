package web.service;

import org.springframework.stereotype.Component;
import web.models.Car;
import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService{
    private final List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car(1, "Lada", "Red"));
        cars.add(new Car(2, "Uaz", "Black"));
        cars.add(new Car(3, "Bmw", "Grey"));
        cars.add(new Car(4, "Audi", "Green"));
        cars.add(new Car(5, "Kia", "Blue"));

    }

    @Override
    public List<Car> getCarsByCount(int i) {
        return cars.stream().limit(i).toList();
    }
}
