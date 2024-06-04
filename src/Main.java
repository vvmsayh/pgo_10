import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Main {
public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        cars.add(new Car("Toyota Camry", 2010));
        cars.add(new Car("Honda Accord", 2015));
        cars.add(new Car("Ford Mustang", 2020));
        cars.add(new Car("Chevrolet Malibu", 2008));
        cars.add(new Car("BMW 3 Series", 2018));
        cars.add(new Car("Audi A4", 2012));
        cars.add(new Car("Mercedes-Benz C-Class", 2016));
        cars.add(new Car("Volkswagen Passat", 2014));
        cars.add(new Car("Hyundai Sonata", 2011));
        cars.add(new Car("Nissan Altima", 2013));

        Collections.sort(cars);
        for (Car car : cars) {
        System.out.println(car);
        }
 }
}