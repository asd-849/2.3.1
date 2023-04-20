package web.service;

import web.model.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

//    public List<Car> setGetList() {
//        List<Car> carsList = new ArrayList<>(){{
//            new Car("sadas", "dasjdlas", 12312);
//            new Car("asdDA", "acasd", 4122);
//            new Car("ibgfba", "cdgasdf", 182);
//            new Car("qweqwr", "gffdvae", 12123);
//            new Car("jvffg", "weqwwe", 851213);
//        }};
//        return carsList;
//    }
    private List<Car> carsList = new ArrayList<>();
    {
        carsList.add(new Car("jvffg", "weqwwe", 851213));
        carsList.add(new Car("qweqwr", "gffdvae", 12123));
        carsList.add(new Car("ibgfba", "cdgasdf", 182));
        carsList.add(new Car("asdDA", "acasd", 4122));
        carsList.add(new Car("sadas", "dasjdlas", 12312));
    }

    public List<Car> getCurrentCarsList() {
        return carsList;
    }

    @Override
    public List<Car> getCarsList(List<Car> carsList, int count) {
        if (count >= 5) {
            return carsList;
        }
        return carsList.subList(0, count);
    }
}
