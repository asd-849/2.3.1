package web.service;

import web.model.*;
import java.util.*;

public interface CarService {
    public List<Car> getCarsList(List<Car> carsList, int count);
}
