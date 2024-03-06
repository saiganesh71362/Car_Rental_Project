package com.java.car_pro;
import com.java.car_pro.Car;
import com.java.car_pro.Customer;
import com.java.car_pro.Rental;
import com.java.car_pro.CarRentalSystem;




public class Main_Driver
{
	public static void main(String[] args)
	{
        CarRentalSystem rentalSystem = new CarRentalSystem();

        Car car1 = new Car("C001", "Toyota", "Camry", 60.0); // Different base price per day for each car
        Car car2 = new Car("C002", "Honda", "Accord", 70.0);
        Car car3 = new Car("C003", "Mahindra", "Thar",150.0);
        rentalSystem.addCar(car1);
        rentalSystem.addCar(car2);
        rentalSystem.addCar(car3);

        rentalSystem.menu();
    }

}
