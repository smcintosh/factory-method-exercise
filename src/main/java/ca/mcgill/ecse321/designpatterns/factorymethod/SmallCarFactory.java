package ca.mcgill.ecse321.designpatterns.factorymethod;

public class SmallCarFactory extends CarFactory {
	@Override
	public Car makeCar() {
		return new SmallCar();
	}
}
