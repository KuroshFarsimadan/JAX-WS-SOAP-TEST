package client;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import beans.Car;
import service.CarService;

public class SOAPClient {

	// https://docs.oracle.com/cd/E17802_01/j2ee/j2ee/1.4/docs/tutorial-update2/doc/JAXRPC5.html
	public static void main(String[] args) throws MalformedURLException {

		URL wsdlURL = new URL("http://localhost:8085/ws/car?wsdl");

		QName qname = new QName("http://service/", "CarServiceImplService");

		Service service = Service.create(wsdlURL, qname);

		CarService ps = service.getPort(CarService.class);

		Car car1 = new Car();
		car1.setName("Some Car 1");
		car1.setId(1);
		car1.setAge(1999);
		
		
		Car car2 = new Car();
		car2.setName("Some Car 2");
		car2.setId(2);
		car2.setAge(2011);



		System.out.println("Add Car Status=" + ps.addCar(car1));
		System.out.println("Add Car Status=" + ps.addCar(car2));

		System.out.println(ps.getCar(1));


		System.out.println(Arrays.asList(ps.getAllCars()));

		System.out.println("Delete Car Status=" + ps.deleteCar(2));


		System.out.println(Arrays.asList(ps.getAllCars()));

	}

}