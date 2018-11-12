package service;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import beans.Car;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface CarService {

	@WebMethod
	public boolean addCar(Car p);

	@WebMethod
	public boolean deleteCar(int id);

	@WebMethod
	public Car getCar(int id);

	@WebMethod
	public Car[] getAllCars();
}