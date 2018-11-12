package service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.jws.WebService;

import beans.Car;

@WebService(endpointInterface = "service.CarService")
public class CarServiceImpl implements CarService {

	private static Map<Integer, Car> cars = new HashMap<Integer, Car>();

	public boolean addCar(Car p) {
		cars.put(p.getId(), p);
		return true;
	}

	public boolean deleteCar(int id) {
		if (cars.get(id) == null) {
			return false;
		} else {
			cars.remove(id);
			return true;
		}
	}

	public Car getCar(int id) {
		return cars.get(id);
	}

	public Car[] getAllCars() {
		Car[] p = new Car[cars.keySet().size()];
		int counter = 0; // We cannot set array content with Integer object
		for (Integer id : cars.keySet()) {
			p[counter] = cars.get(id);
			counter++;
		}
		return p;
	}

}