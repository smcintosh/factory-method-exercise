package ca.mcgill.ecse321.designpatterns.factorymethod;

public class BigCarFactory extends CarFactory {
	@Override
	public Car makeCar() {
		return new BigCar();
	}
}
